package exam02;

import java.util.List;

public class DeptReviewMain {

	public static void main(String[] args)throws Exception {
		
		// DB연동
		DeptReviewServiceImpl service = new DeptReviewServiceImpl();
		List<DeptReviewDTO> list = service.select();
		for (DeptReviewDTO dto : list) {
			System.out.println(dto);
		}
		
		
//		DeptReviewServiceImpl service = new DeptReviewServiceImpl();
//		DeptReviewDTO dto = service.selectAll();
//		System.out.println(dto);
	}
}
