package exam03;

import java.util.List;

public class DeptReviewMain {

	public static void main(String[] args)throws Exception {
		
		// DB연동 - insert 작업
		int deptno = 99;
		String dname ="관리";
		String loc = "서울";
		DeptReviewDTO xxx = new DeptReviewDTO(deptno, dname, loc);
		// 서비스 연동
		DeptReviewServiceImpl service = new DeptReviewServiceImpl();
		int n = service.insert(xxx);
		System.out.println(n+" 개가 저장되었습니다.");
		
		// DB연동 - select 작업
		List<DeptReviewDTO> list = service.select();
		for (DeptReviewDTO dto : list) {
			System.out.println(dto);
		}
		
		
//		DeptReviewServiceImpl service = new DeptReviewServiceImpl();
//		DeptReviewDTO dto = service.selectAll();
//		System.out.println(dto);
	}
}
