package jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

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

	public StudyMember getId(int id) { //특정 아이디로 테이터 출력
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
			String sql = "select id,name,hometown from java_study where id = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				String name = rs.getString(2);
				String hometown = rs.getString(3);
				int id1 = rs.getInt("id");
				sm = new StudyMember(id1, name, hometown);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return sm;
	}
	

	public int addMember(StudyMember sm) { // 데이터 추가 
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
			String sql = "insert into java_study values(?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, sm.getId());
			ps.setString(2, sm.getName());
			ps.setString(3, sm.getHometown());
			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	

	public int deleteMember(String name) {//특정 이름 데이터 출력
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
			String sql = "delete from java_study where name = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
		return result;
	}

	
	public List<StudyMember> selectAll() {//모든 정보 출력
		List<StudyMember> smList = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
			String sql = "select id, name, hometown from java_study";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				int memberId = rs.getInt("id");
				String name = rs.getString("name");
				String hometown = rs.getString("hometown");
				sm = new StudyMember(memberId, name, hometown);
				smList.add(sm);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return smList;
	}
	
}
