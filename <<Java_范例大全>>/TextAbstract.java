
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
		System.out.println("1.»ñµÃÔ²µÄÃæ»ýÓëÖÜ³¤");
		Circle circle = new Circle(4);			
		System.out.printf("Ô²µÄÃæ»ý: %s%n", circle.getArea());
		System.out.printf("Ô²µÄÖÜ³¤: %s%n", circle.getPerimeter());
		System.out.printf("2.»ñµÃ³¤·½ÐÎµÄÃæ»ýÓëÖÜ³¤");
		Rectangle rectangle = new Rectangle(3,4);	
		System.out.printf("³¤·½ÐÎµÄÃæ»ý: %s%n", rectangle.getArea());
		System.out.printf("³¤·½ÐÎµÄÖÜ³¤: %s%n", rectangle.getPerimeter());
	}
}