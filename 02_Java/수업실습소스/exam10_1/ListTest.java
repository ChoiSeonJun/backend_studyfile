package exam10_1;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {

	public static void main(String[] args) {

		// List계열: 순서가 있고 중복이 기능
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("홍길동");
		
		//출력방법1 - toString() 이용
		System.out.println(list);
		
		//출력방법2 - foreach문 이용
		for (String s : list) {
			System.out.println(">>" + s);
		}
		
		//출력방법3 - Iterator 이용
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			String x = ite.next();
			System.out.println("##" + x);
		}
		
		//출력방법4  - index 이용, list.get(idx) 
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		
		
		
		
	}

}
