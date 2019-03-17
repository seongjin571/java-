package jdbc.practice;

import jdbc.dao.*;
import jdbc.dto.*;

public class JdbcPractice {
	public static void main(String[]args) {
		StudyMemberDao smDao = new StudyMemberDao();
		StudyMember sm = smDao.getId(3);
		System.out.println(sm);
	}
	
}
