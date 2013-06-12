class Pet{
	private String name;
	private int age;
	private boolean gender;
	private Pet partner;

	public Pet(){}

	public Pet(String name, int age, boolean gender, Pet partner){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.partner = partner;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}

	public boolean isGender(){
		return gender;
	}

	public void setGender(){
		this.gender = gender;
	}

	public String getName(){
		return name;
	}

	public void setNmae(String name){
		this.name = name;
	}

	public Pet getPartner(){
		return partner;
	}

	public void setPartner(Pet partner){
		this.partner = partner;
	}

	public boolean isOverAgeForMarry(){

		if(this.gender && this.getAge() >= 5){
			return true;
		}

		if(!this.gender && this.getAge() >= 4){
			return true;
		}

		return false;

	}

	public boolean marry(Pet pet){

		if(this.gender == pet.gender){
			System.out.println("根据规定，不允许同性结婚");
			return false;
		}

		if(this.partner != null || pet.partner != null){
			System.out.println("一方已结婚，不能再婚");
			return false;
		}

		if(!this.isOverAgeForMarry() || !pet.isOverAgeForMarry()){
			System.out.println("未达到结婚年龄，不能结婚，再过几年吧");
			return false;
		}

		System.out.println("恭喜 " + this.name + "和 " + pet.name + "结婚！");
		this.partner = pet;
		pet.partner = this;
		return true;

	}

}

public class TextEncapsulation{

	public static void main(String[] args){

		Pet pet1 = new Pet("Cat1", 5, true, null);
		Pet pet2 = new Pet("Cat2", 4, false, null);
		Pet pet3 = new Pet("Cat3", 6, true, null);
		Pet pet4 = new Pet("Cat4", 5, true, null);
		Pet pet5 = new Pet("Cat5", 3, false, null);

		System.out.println("1.双方都满足结婚条件，可以结吗？");
		pet1.marry(pet2);

		System.out.println("2.如果一方已经结婚，可以再结吗？");
		pet2.marry(pet3);

		System.out.println("3.如果是同性，可以结婚吗？");
		pet3.marry(pet4);

		System.out.println("4.如果一方未到结婚年龄，双方可以结婚吗？");
		pet4.marry(pet5);

		System.out.println("5.一方离婚，可以与其它宠物结婚吗？");
		pet2.setPartner(null);
		pet2.marry(pet3);

	}

}



/* 程序运行结果 */
/* 
1.双方都满足结婚条件，可以结吗？
恭喜 Cat1和 Cat2结婚！
2.如果一方已经结婚，可以再结吗？
一方已结婚，不能再婚
3.如果是同性，可以结婚吗？
根据规定，不允许同性结婚
4.如果一方未到结婚年龄，双方可以结婚吗？
未达到结婚年龄，不能结婚，再过几年吧
5.一方离婚，可以与其它宠物结婚吗？
恭喜 Cat2和 Cat3结婚！ 
*/








