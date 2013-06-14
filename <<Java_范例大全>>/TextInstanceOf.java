public class TextInstanceOf{

	static class ObjectA{
		static String A = "Object";
	}

	static class ObjectB extends ObjectA{
		static void showInfo(){
			System.out.printf("父类的静态属性 %s 的值: %s%n", "A", A);
		}
	}

	public static void main(String[] args){

		ObjectA a = new ObjectA();
		ObjectB b = new ObjectB();

		if(a.A instanceof Object){
			System.out.println("静态属性 A 是 Object 类型");
		}
		else{
			System.out.println("静态属性 A 不是 Object 类型");
		}

		if(a.A instanceof String){
			System.out.println("静态属性 A 是 String 类型");
		}
		else{
			System.out.println("静态属性 A 不是 String 类型");
		}

		if(null instanceof Object){
			System.out.println("null 是 Object 类型");
		}
		else{
			System.out.println("null 不是 Object 类型");
		}

		if(a instanceof ObjectA){
			System.out.println("对象 a 是 ObjectA 类型");
		}
		else{
			System.out.println("对象 a 不是 ObjectA 类型");
		}

		if(b instanceof ObjectA){
			System.out.println("对象 b 是 ObjectA 类型");
		}
		else{
			System.out.println("对象 b 不是 ObjectA 类型");
		}

		if(a instanceof ObjectB){
			System.out.println("对象 a 是 ObjectB 类型");
		}
		else{
			System.out.println("对象 a 不是 ObjectB 类型");
		}

		if(b instanceof ObjectB){
			System.out.println("对象 b 是 ObjectB 类型");
		}
		else{
			System.out.println("对象 b 不是 ObjectB 类型");
		}

	}

}



/* 程序运行结果 */
/*
静态属性 A 是 Object 类型
静态属性 A 是 String 类型
null 不是 Object 类型
对象 a 是 ObjectA 类型
对象 b 是 ObjectA 类型
对象 a 不是 ObjectB 类型
对象 b 是 ObjectB 类型
*/



/* 源程序解读 */
/*
(1) 程序中定义静态内部类。需要注意的是: 仅仅只有内部类能够被声
	明为 static 类型，通常声明一个普通类是不能使用 static 的，
	否则编译出错。编译器会自动给内部类加上一个 reference，指向
	产生它的那个外部类的对象，如果不想要或者说不需要这个 reference，
	那么就可以把这个内部类声明为 static, 禁止这个 reference
	产生。

(2) 在 main() 方法中进行了一系列的判断: 字符串是否是对象类型、
	子类是否是父类类型以及父类是否是子类类型。子类是父类的扩展，
	所以子类属于父类类型。由于是单一继承，则父类不能继承子类，
	所以父类不属于子类类型。

*/
















