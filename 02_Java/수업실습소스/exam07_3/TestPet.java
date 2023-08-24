package exam07_3;

public class TestPet {

	public static void main(String[] args) {

		// 1. 일반 객체 생성
		Cat c1 = new Cat("야옹이", 2);
		Dog d1 = new Dog("망치", 1, "수컷");
		Bird b1 = new Bird("까치", 1, "블랙");
		
		// 다음 코드의 문제는 관리해야될 메서드가 많아진다.
		c1.eat();
		c1.sleep();
		
		d1.eatDog();
		d1.sleepDog();
		
		b1.eatBird();
		b1.sleepBird();

		
	}

}
