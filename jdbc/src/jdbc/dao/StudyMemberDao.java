package jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.dto.StudyMember;

public class StudyMemberDao {
//	private static String dburl = "jdbc:mysql://192.168.0.9:3306/test?characterEncoding=UTF-8&serverTimezone=UTC";
	private static String dburl = "jdbc:mysql://localhost/test?characterEncoding=UTF-8&serverTimezone=UTC"; 
	private static String dbUser = "java";
	private static String dbpasswd = "wkqktmxjel";
	
	StudyMember sm = null;
	Connection conn = null;
	PreparedStatement ps = null; 
	ResultSet rs = null;
	
	public StudyMember getId(int id) {
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(dburl,dbUser,dbpasswd);
		String sql = "select id,name,hometown from java_study where id = ?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1,id);
		rs = ps.executeQuery();
		if (rs.next()) {
			String name = rs.getString(2);
			String hometown = rs.getString(3);
			int id1 = rs.getInt("id");
			sm = new StudyMember(id1, name , hometown);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		if(rs != null) {
			try {
				rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}if(ps != null) {
			try {
				ps.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}if(conn != null) {
			try {
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
		
		return sm;
}
	
	

}
