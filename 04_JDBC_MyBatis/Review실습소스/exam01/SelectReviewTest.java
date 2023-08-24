package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectReviewTest {

	public static void main(String[] args) throws Exception {

		  String driver = "oracle.jdbc.driver.OracleDriver";
		  String url ="jdbc:oracle:thin:@localhost:1521:xe";
		  String usrid ="SCOTT";
		  String passwd ="TIGER";
		  Class.forName(driver);
		  Connection con = DriverManager.getConnection(url, usrid, passwd );
		  
		  
		  
		  
		  
		  String sql ="select deptno, dname, loc from dept";
		  PreparedStatement pstmt = con.prepareStatement(sql);
		  ResultSet rs = pstmt.executeQuery();
		  while(rs.next()){
		      int deptno = rs.getInt("deptno");
		      String dname = rs.getString(2);
		      String loc = rs.getString("loc");
		      System.out.println(deptno+"\t"+dname+"\t"+loc);
		  }
		  rs.close();
		  pstmt.close();
		  con.close();
		  
	}

}



