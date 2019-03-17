package jdbc.practice;

import jdbc.dao.*;
import jdbc.dto.*;

public class JdbcPractice {
	public static void main(String[]args) {
		int member = (int)(Math.random()*4+1);
		StudyMemberDao smDao = new StudyMemberDao();
		StudyMember sm = smDao.getId(member);
		System.out.println(sm);
		
		StudyMember sm2 = new StudyMember(5,"jungwhan","suwon");
		smDao.addMember(sm2);
	}
	
}
