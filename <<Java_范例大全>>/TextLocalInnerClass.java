interface LocalInterface{

	public void local_1();
	public void local_2();
	public void local_3();

}

class Outer{

	private int al = 10;

	private void privateShow(){
		System.out.println("外部类的私有非静态变量");
	}

	public void show(){
		System.out.println("外部类的非静态方法");
	}


	public LocalInterface method(){

		final int number = 20;

		class Inner implements LocalInterface{

			public void local_1(){
				show();
			}

			public void local_2(){
				System.out.println("显示局部内部类的成员变量: " + number);
				System.out.println("调用外部类的成员变量: " + al);
			}

			public void local_3(){
				privateShow();
			}

		}

		return new Inner();
	}

}


public class TextLocalInnerClass{

	public static void main(String[] args){

		Outer out = new Outer();
		LocalInterface local = out.method();
		local.local_1();
		local.local_2();
		local.local_3();

	}

}



/* 程序运行结果 */
/*
外部类的非静态方法
显示局部内部类的成员变量: 20
调用外部类的成员变量: 10
外部类的私有非静态变量
*/




/* 源程序解读 */
/*
(1) 程序中定义接口、外部类以及外部类的方法和属性。其中
	在 method() 方法中创建局部内部类 Inner 来实现
	接口中的方法并返回接口类型，这样才能访问到局部内部
	类的方法。其中 local_1() 方法中调用外部类的非静态
	方法，local_2() 方法中显示局部内部类的成员常量和调用
	外部类的成员变量。local_3() 方法中调用外部类的私有
	的非静态方法。

(2) 需要注意的是: 在局部内部类中声明局部常量必须是 final
	型的，不是 final 型的是无法访问的。
*/
























