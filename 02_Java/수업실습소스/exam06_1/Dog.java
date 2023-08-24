package exam06_1;

public class Dog extends Pet {

	String sex;
	
	public Dog() {}
	public Dog(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	//재정의
	
	@Override
	public void eat() {
		System.out.println("Dog.eat");
	}
	@Override
	public void sleep() {
		System.out.println("Dog.sleep");
	}
	
	
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}


