package exam07_3;

public class Bird extends Pet {

	String color;
	
	public void fly() {
		System.out.println("Bird.fly");
	}

	//오버라이딩는 강제성이 없다.
	public void eatBird() {
		System.out.println("Bird.eat");
	}
	public void sleepBird() {
		System.out.println("Bird.sleep");
	}

	public Bird() {}
	public Bird(String name, int age) {
		super(name, age);
	}
	public Bird(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return String.format("Bird 이름: %s, Bird 나이:%d, Bird 색상:%s \n", name, age, color);
	}
}
