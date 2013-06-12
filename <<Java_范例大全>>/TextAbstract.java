
abstract class Geometric{							//创建抽象类
	String color = "block";
	int weight = 2;
	abstract float getArea();						//抽象构造器求面积
	abstract float getPerimeter();					//抽象构造器求周长
}

class Circle extends Geometric{						//继承 Geometric, 求圆的面积和周长
	float radius;

	Circle(float number){							//带参数的构造器
		radius = number;
	}

	protected float getArea(){						//实现父类的抽象方法求圆的面积
		return 3.14f*radius*radius;
	}

	protected float getPerimeter(){					//实现父类的抽象方法求圆的周长
		return 2*3.15f*radius;
	}
}

class Rectangle extends Geometric{					//继承 Geometric 求长方形的面积和周长
	float width;
	float height;

	Rectangle(float width, float height){			//带参数的构造器
		this.width = width;
		this.height = height;
	}

	float getArea(){								//实现父类的抽象方法求长方形的面积
		return width*height;
	}

	float getPerimeter(){							//实现父类的抽象方法求长方形的周长	
		return 2*(width*height);
	}
}

public class TextAbstract{							//操作抽象类求图形面积的类
	
	public static void main(String[] args){		

		System.out.println("1.获得圆的面积与周长");	//Java 程序主入口

		Circle circle = new Circle(4);				//创建圆对象实例

		System.out.printf("圆的面积 %s %n", circle.getArea());
		System.out.printf("圆的周长 %s %n", circle.getPerimeter());

		System.out.printf("2.获得长方体的面积与周长");

		Rectangle rectangle = new Rectangle(3,4);	//创建长方形对象实例
		
		System.out.printf("长方形的面积 %s %n", rectangle.getArea());
		System.out.printf("长方形的周长 %s %n", rectangle.getPerimeter());

	}
}


/* 源程序解读 */

/*(1) 用关键字 abstract 创建 Geometric 抽象类，并声明两个抽象构造器。
	  默认的抽象方法拥有受保护的访问权限，即默认用 protected 访问修饰
	  符修饰。简单地说，只有类内部和子类可以访问该成员。

(2) Circle 和 Rectangle 类继承 Geometric 抽象类，必须实现所有的抽象
	方法，否则需要在关键字 class 前加 abstract 称为抽象类。
*/







