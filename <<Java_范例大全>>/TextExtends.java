class Box{

	double width;
	double height;
	double depth;

	//带参数的构造器
	Box(Box box){
		this.width = box.width;
		this.height = box.height;
		this.depth = box.depth;
	}

	//带参数的构造器
	Box(double width, double height, double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	//默认构造器
	Box(){
		this.width = -1;
		this.height = -1;
		this.depth = -1;
		System.out.println("I am a box");
	}

	//构造正方体
	Box(double len){
		this.width = this.height = this.depth = len;
	}

	double volumn(){
		return width*height*depth;
	}

}

class BoxWeight extends Box{

	double weight;

	//带参数的构造器
	BoxWeight(double w, double h, double d, double m){
		width = w;
		height = h;
		depth = d;
		weight = m;
	}

	BoxWeight(){
		System.out.println("I am a small Box");
	}

}

public class TextExtends{

	public static void main(String[] args){

		BoxWeight weightBox = new BoxWeight(10, 20, 15, 34.0);
		Box box = new Box();

		double vol;
		vol = weightBox.volumn();

		System.out.printf("盒子 box1 的体积:  %s %n", vol);
		System.out.printf("盒子 box1 的重量:  %s %n", weightBox.weight);

		box = weightBox;
		vol = box.volumn();

		System.out.printf("盒子 box 的体积:  %s %n", vol);
		//System.out.printf("盒子 box 的重量:  %s %n", box.weight);
		Box box2 = new BoxWeight();

	}

}


/* 程序运行结果 */
/*
I am a box
I am a box
盒子 box1 的体积:  3000.0 
盒子 box1 的重量:  34.0 
盒子 box 的体积:  3000.0 
I am a box
I am a small Box
*/



/* 源程序解读 */
/*
(1) 程序中定义一个父类和子类。在父类中定义一个盒子的高度、宽度和深
	度，子类继承父类的所有特征并为自己添加一个重量成员 weight。继
	承可以让子类没有必要重新创建父类中的所有特征。

(2) 在 main() 方法中，在子类带参数实例化对象时，由于继承父类，则
	需要打印父类默认构造器中的语句 I am a Box。当父类不带参数实
	例化对象时调用默认构造器也打印出 I am a Box。
	在 line 76, 将子类对象赋给父类变量，weight 是子类的一个属性，
	父类不知道子类增加的属性，所以父类不恩能够获取子类属性 weight 
	的值。父类变量引用子类对象，可以看做是先实例化父类，接着实例化
	子类对象，所以打印出父类和子类默认构造器中的语句。
*/




















