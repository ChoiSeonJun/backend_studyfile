package exam04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

// 역할: Main 과 DAO 중간역할로서 비즈니스로직 처리 + 트랜잭션 처리 담당
// DB 연동시 Connection까지 얻는다
public class DeptReviewServiceImpl {
	
	  String driver = "oracle.jdbc.driver.OracleDriver";
	  String url ="jdbc:oracle:thin:@localhost:1521:xe";
	  String usrid ="SCOTT";
	  String passwd ="TIGER";
	  
	public DeptReviewServiceImpl() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}//end 생성자
	//DB 연동
	public List<DeptReviewDTO> select() throws Exception {
		Connection con = DriverManager.getConnection(url, usrid, passwd );
		
		// DAO연동 코드
		DeptReviewDAO dao = new DeptReviewDAO();
		List<DeptReviewDTO> list = dao.select(con);
		
		con.close();
		return list;
	}
	
	public int insert(DeptReviewDTO dto) throws Exception {
		Connection con = DriverManager.getConnection(url, usrid, passwd );
		// DAO연동 코드
		DeptReviewDAO dao = new DeptReviewDAO();
		int n = dao.insert(con, dto);
		con.close();
		return n;
	}
	
	public DeptReviewDTO selectAll() {
		DeptReviewDAO dao = new DeptReviewDAO();
		DeptReviewDTO dto = dao.selectAll();
		return dto;
	}
	
	public int update(DeptReviewDTO dto) throws Exception{
		//DB 연동
		Connection con =
				DriverManager.getConnection(url, usrid, passwd);
		
		DeptReviewDAO dao = new  DeptReviewDAO();
		int n = dao.update(con, dto);
		
		con.close();
		return n;
	}
	
	
	
	
	
	
	
	
	
	
}
