class Employee{

	private String name;
	private String gender;
	private int age;
	private int salary;

	public Employee(String name, String gender, int age, int salary){
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}

	public String getGender(){
		return gender;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getSalary(){
		return salary;
	}

	public void setSalary(int salary){
		this.salary = salary;
	}

}


interface PersonForm{

	public int getFormCol();
	public int getFormRow();
	public String getValue(int row, int col);
	public String getColName(int col);

}


class FormA implements PersonForm{

	String[][] data;

	public FormA(String[][] data){
		this.data = data;
	}

	public String getColName(int col){
		return data[0][col];
	}
	public int getFormCol(){
		return data[0].length;
	}
	public int getFormRow(){
		return data.length-1;
	}
	public String getValue(int row, int col){
		return data[row+1][col];
	}

}


class FormB implements PersonForm{

	private Employee[] data;

	public FormB(Employee[] data){
		this.data = data;
	}

	public String getColName(int col){
		switch(col){
			case 0:
				return "姓名\t|";
			case 1:
				return "性别\t|";
			case 2:
				return "年龄\t|";
			case 3:
				return "工资\t|";
			default:
				return null;
		}
	}
	public int getFormCol(){
		return 4;
	}
	public int getFormRow(){
		return data.length;
	}
	public String getValue(int row, int col){
		switch(col){
			case 0:
				return data[row].getName();
			case 1:
				return data[row].getGender();
			case 2:
				return data[row].getAge() + "";
			case 3:
				return data[row].getSalary() + "";
			default:
				return null;
		}
	}

}


class Table{

	private PersonForm form;

	public Table(PersonForm form){
		this.form = form;
	}

	public void display(){
		for(int i=0; i<form.getFormCol(); i++){
			System.out.print(form.getColName(i));
		}
		System.out.println();
		System.out.println("------------------------");
		for(int i=0; i<form.getFormRow(); i++){
			for(int j=0; j<form.getFormCol(); j++){
				System.out.print(form.getValue(i, j) + "\t|");
			}
			System.out.println();
		}
	}

}


public class TextInterface{

	public static void main(String[] args){

		String[][] str = new String[][]{
			{"name\t|", "gender\t|", "age\t|", "salary\t|"},
			{"Tom", "male", "20", "2000"},
			{"Lingda", "female", "21", "2100"},
			{"Susan", "female", "22", "2200"},
			{"Ansen", "female", "24", "2500"}
		};

		PersonForm form = new FormA(str);
		Table table1 = new Table(form);
		table1.display();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");

		Employee em1 = new Employee("汤姆", "男", 20, 2000);
		Employee em2 = new Employee("琳达", "女", 21, 2100);
		Employee em3 = new Employee("苏萨", "女", 22, 2200);
		Employee em4 = new Employee("艾瑞卡", "男", 23, 2300);
		Employee em5 = new Employee("安臣", "女", 24, 2500);

		Employee[] data = {em1, em2, em3, em4, em5};

		PersonForm form1 = new FormB(data);
		Table table2 = new Table (form1);
		table2.display();

	}

}


/* 程序运行结果 */
/*
name	|gender	|age	|salary	|
------------------------
Tom	|male	|20	|2000	|
Lingda	|female	|21	|2100	|
Susan	|female	|22	|2200	|
Ansen	|female	|24	|2500	|
^^^^^^^^^^^^^^^^^^^^^^^^^^
姓名	|性别	|年龄	|工资	|
------------------------
汤姆	|男	|20	|2000	|
琳达	|女	|21	|2100	|
苏萨	|女	|22	|2200	|
艾瑞卡	|男	|23	|2300	|
安臣	|女	|24	|2500	|
*/





/* 源程序解读 */
/*
(1) 程序中定义一个 Employee 类、一个查看 Employee 薪资的借口和两个实现借口的类。
	在 main() 方法中首先创建二维数据并将数据信息填入数据，定义接口的引用使用了多态。
	接口的引用必须是实现了接口的类的对象，所以使用类 FormA 创建 form 对象，再根据
	form 来创建 Table 表格的对象 table1, 调用 display() 方法输出数据。

(2) 再创建 5 个 Employee 对象，用数组存储。接口引用同样使用多态，方式与创建 form
	对象一样。
*/















