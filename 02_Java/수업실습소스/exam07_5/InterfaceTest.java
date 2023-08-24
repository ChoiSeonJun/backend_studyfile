package exam07_5;

//인터페이스
interface Y1{
	//1)상수
	final int NUM=10; // 상수, 자동으로 public static final 지정된다.
	int SIZE= 20;     // 변수처럼 보이는데 상수. 자동으로 public static final 지정된다.
	public static final int COUNT = 30; //권장
	
	// 2) 추상 메서드 ( 인터페이스를 사용하는 가장 큰 목적이다. )
	public abstract void a(); // 권장
	public void a2(); // 자동으로 public abstract 지정된다.
	void a3();        // default 접근지정자로 보이는데 public 이다.
	
	// 3) default 메서드
	public default void b() {
		System.out.println("default 메서드");
	}
	// 4) static 메서드
	public static void c() {
		System.out.println("static 메서드");
	}
}

interface Y2{
	public abstract void x();
}
interface Y3{
	public abstract void x2();
}
class K implements Y2{
	@Override
	public void x() {

	} // 구현
}

class K2 implements Y2, Y3{ // 다중 구현

	@Override
	public void x2() {}

	@Override
	public void x() {}  
	
}
// 인터페이스 간 상속 ( 다중상속 )
interface Y4 extends Y2, Y3{
	
}
// 상속 및 구현
class K3 extends Object implements Y2, Y3{
	@Override
	public void x2() {}

	@Override
	public void x() {}  
}

class Z implements Y1{
	@Override
	public void a() {
		System.out.println("a");
	}
	@Override
	public void a2() {
		System.out.println("a2");
	}
	@Override
	public void a3() {
		System.out.println("a3");
	}
}
public class InterfaceTest {

	public static void main(String[] args) {
		Z z = new Z();
		z.a();
		z.a2();
		z.a3();
		System.out.println(Y1.NUM);
		System.out.println(Y1.SIZE);
		System.out.println(Y1.COUNT);
		z.b(); // default 메서드는 일반클래스의 concrete 메서드처럼 사용한다.
		Y1.c();  // static 메서드
		
		
//		Y2 y = new Y2(); // new 불가
		
		K k = new K();
		k.x();
		
		//다형성 ( 매우 중요 )
		Y2 k2 = new K();
		k2.x();
		
	
	}

}




