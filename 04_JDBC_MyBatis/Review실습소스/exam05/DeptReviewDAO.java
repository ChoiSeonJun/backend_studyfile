package exam05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// 역할: oracle 연동==> 조회, 저장, 수정, 삭제 기능들...
public class DeptReviewDAO {

	// DB 연동 - 데이터 저장
	public int insert(Connection con, // DB 연
			           DeptReviewDTO dto // main에서 전달한 저장할 데이터
			           ) {
		int n = 0;
		PreparedStatement pstmt = null;	
	 try {	
		String sql ="insert into dept (deptno, dname, loc ) "
				     + " values ( ?, ? , ? )";
		pstmt = con.prepareStatement(sql);		
		pstmt.setInt(1, dto.getDeptno());
		pstmt.setString(2, dto.getDname());
		pstmt.setString(3, dto.getLoc());
		n = pstmt.executeUpdate();
	 }catch(SQLException e) {
		 System.out.println(e.getMessage());
//		 e.printStackTrace();
	 }finally {
		//finally
		try {
			if(pstmt!=null)pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
		return n;
	}//end insert
	
	
	//DB 연동
	public List<DeptReviewDTO> select(Connection con) {
		  // while문안에서 저장한 DTO를 누적용
		  List<DeptReviewDTO> list  = new ArrayList<DeptReviewDTO>();
		  PreparedStatement pstmt = null;
		  ResultSet rs = null;
	 try {	
		  String sql ="select deptno, dname, loc from dept";
		  pstmt = con.prepareStatement(sql);
		  rs = pstmt.executeQuery();
		  while(rs.next()){
		      int deptno = rs.getInt("deptno");
		      String dname = rs.getString(2);
		      String loc = rs.getString("loc");
		      DeptReviewDTO dto =
		    		  new DeptReviewDTO(deptno, dname, loc);
		      list.add(dto);
		  }
	 }catch(SQLException e) {
		 
	 }finally {
		  try {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 }  
		  return list;
	}//end select
	
	public DeptReviewDTO selectAll() {
		//DB 접속해서 데이터 가져왔다.
		int deptno = 10;
		String dname = "개발";
		String loc = "서울";
		//System.out.println(deptno+"\t"+dname+"\t"+loc);
		DeptReviewDTO dto = 
				new DeptReviewDTO(deptno, dname, loc);
		return dto;
	}

	public int update(Connection con, DeptReviewDTO dto) throws Exception {
		
		String sql ="update dept set dname=?, loc=? where deptno=?";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, dto.getDname());
		pstmt.setString(2, dto.getLoc());
		pstmt.setInt(3, dto.getDeptno());
		
		int n = pstmt.executeUpdate();
		
		pstmt.close();
		
		return n;
	}
	
	
	
	
	
	
	
	public void delete() {}
}
