package exam07_4;

public class TestPet {

	public static void main(String[] args) {

		// 1. 일반 객체 생성
		Cat c1 = new Cat("야옹이", 2);
		Dog d1 = new Dog("망치", 1, "수컷");
		Bird b1 = new Bird("까치", 1, "블랙");
		
		// 다음 코드의 문제는 관리해야될 메서드가 많아진다.
		// 해결: 추상메서드로 제공하여 통일성 부여
		c1.eat();
		c1.sleep();
		
		d1.eat();
		d1.sleep();
		
		b1.eat();
		b1.sleep();
		
		// 추상 클래스는 객체생성 불가
//		Pet p = new Pet();
		
		// 다형성 ( new는 불가능하지만 변수의 데이터타입으로 사용 가능)
		Pet p = new Cat();

	}

}
