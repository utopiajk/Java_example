/*ÊµÀý21 - Í¼ÐÎÃæ»ýÓëÖÜ³¤£¨³éÏóÀà£©*/


package com.zf.s5;						//´´½¨Ò»¸ö°ü

abstract class Geometric{				//´´½¨³éÏóÀà
	String color = "block";
	int weight = 2;
	abstract float getArea();			//³éÏó¹¹ÔìÆ÷ÇóÃæ»ý
	abstract float getPerimeter();		//³éÏó¹¹ÔìÆ÷ÇóÖÜ³¤
}

class Circle extends Geometric{			//¼Ì³Ð Geometric£¬ÇóÔ²µÄÃæ»ýºÍÖÜ³¤
	float radius;

	Circle(float number){				//´ø²ÎÊýµÄ¹¹ÔìÆ÷
		radius = number;
	}

	protected float getArea(){			//ÊµÏÖ¸¸ÀàµÄ³éÏó·½·¨ÇóÔ²µÄÃæ»ý
		return 3.14f*radius*radius;
	}

	protected float getPerimeter(){		//ÊµÏÖ¸¸ÀàµÄ³éÏó·½·¨ÇóÔ²µÄÖÜ³¤
		return 2*3.15f*radius;
	}
}

class Rectangle extends Geometric{		//¼Ì³Ð Geometric Çó³¤·½ÐÎµÄÃæ»ýºÍÖÜ³¤
	float width;
	float height;

	Rectangle(float width, float height){	//´ø²ÎÊýµÄ¹¹ÔìÆ÷
		this.width = width;
		this.height = height;
	}

	float getArea(){					//ÊµÏÖ¸¸ÀàµÄ³éÏó·½·¨Çó³¤·½ÐÎµÄÃæ»ý
		return width*height;
	}

	float getPerimeter(){				//ÊµÏÖ¸¸ÀàµÄ³éÏó·½·¨Çó³¤·½ÐÎµÄÖÜ³¤
		return 2*(width*height);
	}
}

public class TextAbstract{				//²Ù×÷³éÏóÀàÇóÍ¼ÐÎÃæ»ýµÄÀà
	public static void main(String[] args){		//Java ³ÌÐòµÄÖ÷Èë¿Ú
		System.out.println("1.»ñµÃÔ²µÄÃæ»ýÓëÖÜ³¤");
		Circle circle = new Circle(4);			//´´½¨Ô²¶ÔÏóÊµÀý
		System.out.printf("Ô²µÄÃæ»ý: %s%n", circle.getArea());
		System.out.printf("Ô²µÄÖÜ³¤: %s%n", circle.getPerimeter());
		System.out.printf("2.»ñµÃ³¤·½ÐÎµÄÃæ»ýÓëÖÜ³¤");
		Rectangle rectangle = new Rectangle(3,4);	//´´½¨³¤·½ÐÎ¶ÔÏóÊµÀý
		System.out.printf("³¤·½ÐÎµÄÃæ»ý: %s%n", rectangle.getArea());
		System.out.printf("³¤·½ÐÎµÄÖÜ³¤: %s%n", rectangle.getPerimeter());
	}
}