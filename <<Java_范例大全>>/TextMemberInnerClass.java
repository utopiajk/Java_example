class OuterClass{

	String outer = "outer class";
	private int number = 1;
	private static int count = 10;

	public OuterClass(){}

	public OuterClass(int number, int count){
		this.number = number;
		this.count = count;
		System.out.println("传入的数分别为: " + this.number + "与 " + this.count);
	}

	private void outer_1(){
		System.out.println("调用外部类的非静态方法");
		InnerClass inner = this.new InnerClass();
	}

	private static void outer_2(){
		System.out.println("调用外部类的静态方法");
		//InnerClass inner = this.new InnerClass();
	}

	class InnerClass{

		String outer = "inner class";

		public InnerClass(){
			System.out.println("成员内部类的构造器");
		}

		protected void communicate(){
			System.out.println("外部类的字符窜: " + OuterClass.this.outer);
			System.out.println("内部类的字符串: " + this.outer);
		}

		protected void inner_1(){
			System.out.println("调用外部类的私有方法");
			outer_1();
			outer_2();
		}

	}

}

public class TextMemberInnerClass{

	public static void main(String[] args){

		OuterClass outer = new OuterClass(10, 20);
		OuterClass.InnerClass inner = outer.new InnerClass();
		System.out.println("OuterClass = " + outer.outer);
		System.out.println("InnerClass = " + inner.outer);
		inner.communicate();
		inner.inner_1();

	}

}


/* 程序运行结果 */
/*
传入的数分别为: 10与 20
成员内部类的构造器
OuterClass = outer class
InnerClass = inner class
外部类的字符窜: outer class
内部类的字符串: inner class
调用外部类的私有方法
调用外部类的非静态方法
成员内部类的构造器
调用外部类的静态方法
*/



/* 源程序解读 */
/*
(1) 程序中定义外部类及其内部的成员变量和方法以及成员
	内部类。OuterClass 类中的非静态方法 outer_1()
	可以实例化 InnerClass 成员内部类，但非静态方法
	不能实例化成员内部类。在成员内部类 InnerClass
	中 communicate() 方法可以访问外部类的静态变量
	或静态方法，语法格式为: "外部类名.this.属性(或方法())"。
	inner_1() 方法可以调用外部类的私有方法。

(2) 在 main() 方法中要实例化成员内部类，需要先实例化外部类。
	语法格式: Outer o = new Outer();
			 Outer.Inner in = o.new.Inner();
*/























