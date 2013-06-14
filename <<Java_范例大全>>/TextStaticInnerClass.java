public class TextStaticInnerClass{

	private static int num = 1;
	private int count = 10;

	public static void outer(){
		System.out.println("外部类的静态方法!");
	}

	public void outer_1(){
		System.out.println("外部类的非静态方法!");
	}

	public void outer_2(){

		System.out.println(Inner.inner_num);
		Inner.inner_outer();
		Inner inner = new Inner();
		inner.inner_outer_1();

	}

	static class Inner{

		static int inner_num = 100;
		int inner_count = 200;

		static void inner_outer(){
			System.out.println("访问外部类的静态成员" + num);
			outer();
		}

		void inner_outer_1(){
			System.out.println("静态内部类的非静态方法");
			outer();
		}

	}

	public static void main(String[] args){

		TextStaticInnerClass inner = new TextStaticInnerClass();
		inner.outer_2();

	}

}



/* 程序运行结果 */
/*
100
访问外部类的静态成员1
外部类的静态方法!
静态内部类的非静态方法
外部类的静态方法!
*/




/* 源程序解读 */
/*
(1) 在程序类中定义静态变量、非静态变量、静态方法、非静态
	方法以及一个静态内部类。在静态内部类中定义静态变量、
	非静态变量以及非静态方法。默认的非静态方法的访问修饰符
	为 protected，可以被该类所在的包内成员以及包内的类
	成员访问

(2) 在静态内部类的方法中只能访问外部类的静态变量及静态方法。
	外部类访问静态内部类的语法格式为: 静态内部类.静态变量
	(或静态方法())。如果外部类访问内部类的非静态成员，需要
	先实例化内部类。
*/



















