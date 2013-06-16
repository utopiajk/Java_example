/* 变量 和 常量 */

class Sub{

	/* 如果 final 加在方法前面 */
	/*
	(1) 之所以要使用final方法，可能是出于对两方面理由的考虑。第一个是为方法“上锁”，
		防止任何继承类改变它的本来含义。设计程序时，若希望一个方法的行为在继承期间
		保持不变，而且不可被覆盖或改写，就可以采取这种做法。
	(2) 采用final方法的第二个理由是程序执行的效率。将一个方法设成final后，编译器
		就可以把对那个方法的所有调用都置入“嵌入”调用里。
	*/
	final String subName = "HelloWorld";
	final double fPi = 3.14;		//<<java入门到精通>> p.37

}

public class TextConstant{

	int number = 0;



	//方法的重载，参考《java入门到精通》p.170
	public void run(Object obj){
		System.out.println("是对象 Object: " + obj);
	}

	public void run(Sub sub){
		System.out.println("是类 Sub: " + sub);
	}




	private void showObject(){
		Sub sub = new Sub();
		System.out.println("Sub.subName = " + sub.subName);
		System.out.println("Sub.fPi = " + sub.fPi);
	}

	public static void main(String[] args){

		TextConstant constant = new TextConstant();
		constant.number = 5;
		System.out.println("t.i " + constant.number);
		constant.showObject();
		constant.run(null);

	}

}


/* 程序运行结果 */
/*
t.i 5
Sub.subName = HelloWorld
Sub.fPi = 3.14
是类 Sub: null
*/


/* 源程序解读 */
/*
(1) showObject() 方法中实例化一个对象，可称为实例变量，
	显示对象中的常量信息。其中 Sub 类中的常量声明为 final，
	则变量值不可修改。如果方法声明为 final，则方法不可
	重写。如果类声明为 final，则类不可继承，没有子类。
(2) 类中的两个 run() 方法是多态的一种方式: 重载。在java
	中，同一个类中的两个或两个以上的方法可以有同一个名字，
	只要它们的参数不同即可，在这种情况下，该方法就被称为
	重载(overloaded)。在 main()方法中调用 run() 方法并
	传入 null 作为参数。null 作为关键字，用来标示一个不
	确定的对象。可以将 null 赋给引用类型变量，但不可以将
	null 赋给基本类型变量。在调用 run() 方法中，先考虑类
	对象，如果参数不是类对象才考虑 Object 对象。
*/















