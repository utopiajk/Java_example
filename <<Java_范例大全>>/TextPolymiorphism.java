
import java.util.Date;				//引入类		


class Student{

	String name;
	Date date = new Date();
	int hour = date.getHours();			//获得时间

	public void goToSchool(Student student){

		Student stu = new Student();

		if(this.hour <= 7 && this.hour > 5){
			this.clockMe(stu);
		}
		else{
			System.out.println("洗脸刷牙");
		}
	}

	public void clockMe(Student stu){
		System.out.println("叮铃铃...叮铃铃..." + this.name + "起床了");
	}

}

class Pupil extends Student{

	public void goToSchool(Student student){
		System.out.println("我是小学生");
		Pupil pupil = new Pupil();

		if(hour <= 6 && hour > 5){
			this.clockMe(pupil);
		}
		else{
			System.out.println("要锻炼身体!");
		}
	}

	public void clockMe(Student stu){
		System.out.println("小鸟咕咕叫..." + this.name + "起床了");
	}

	public void showInfo(){
		System.out.println("我是小学生!");
	}

}

class Undergraduate extends Student{

	public void goToSchool(Student stu){
		System.out.println("我是大学生");
		Undergraduate graduate = new Undergraduate();

		if(hour <= 9 && hour > 5){
			this.clockMe(graduate);
		}
		else{
			System.out.println("继续睡觉!");
		}
	}

	public void clockMe(Student me){
		System.out.println("小鼓咚咚咚..." + this.name + "起床了");
	}

	public void showInfo(){
		System.out.println("我是大学生!");
	}

}


public class TextPolymiorphism{

	public static void main(String[] args){

		System.out.println("1.当时间在 5 - 7 点时");
		//System.out.println("2. 当时间不再 5 - 7 点时");
		Student student = new Pupil();
		student.name = "Susan";
		student.goToSchool(student);
		//student.showInfo();

		System.out.println();

		student = new Undergraduate();
		student.name = "Tom";
		student.goToSchool(student);

		System.out.println();

		Pupil pupil = new Pupil();
		pupil.goToSchool(pupil);
		pupil.showInfo();

	}

}


/* 程序运行结果 */
/*
1.当时间在 5 - 7 点时
我是小学生
要锻炼身体!

我是大学生
继续睡觉!

我是小学生
要锻炼身体!
我是小学生!
*/



/* 源程序解读 */
/*
(1) 程序中定义了学生父类和两个子类。在父类中定义去上学方式以及铃声起床另个方法。
	两个子类根据起床时间的不同，重写父类的方法。

(2) 在 main() 方法中，父类变量引用子类对象，创建可以把子类对象当做父类对象的实例。
	这样，子类自己扩展的属性和方法就不能调用了，只能调用父类的。比如子类方法中的
	showInfo() 方法在这种情况下子类就不能调用。由于子类重写父类的方法，在调用
	方法 goToSchool() 时，由于时间不同，子类重写 clockMe() 方法，则调用该方法
	时调用的是子类重写后的方法。当实例化子类对象时，子类可以调用自己扩展及重写
	的属性和方法。
*/











