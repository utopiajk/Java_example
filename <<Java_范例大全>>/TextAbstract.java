
package com.zf.s5;							//创建一个包

abstract class Geometric{				
	String color = "block";
	int weight = 2;
	abstract float getArea();			
	abstract float getPerimeter();		
}

class Circle extends Geometric{			
	float radius;

	Circle(float number){			
		radius = number;
	}

	protected float getArea(){			
		return 3.14f*radius*radius;
	}

	protected float getPerimeter(){		
		return 2*3.15f*radius;
	}
}

class Rectangle extends Geometric{		
	float width;
	float height;

	Rectangle(float width, float height){	
		this.width = width;
		this.height = height;
	}

	float getArea(){					
		return width*height;
	}

	float getPerimeter(){				
		return 2*(width*height);
	}
}

public class TextAbstract{				
	public static void main(String[] args){		
		System.out.println("1.获得圆的面积与周长");
		Circle circle = new Circle(4);			
		System.out.printf("圆的面积 %s %n", circle.getArea());
		System.out.printf("圆的周长 %s %n", circle.getPerimeter());
		System.out.printf("2.获得长方体的面积与周长");
		Rectangle rectangle = new Rectangle(3,4);	
		System.out.printf("长方形的面积 %s %n", rectangle.getArea());
		System.out.printf("长方形的周长 %s %n", rectangle.getPerimeter());
	}
}