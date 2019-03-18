package jdbc.practice;

import jdbc.dao.*;
import jdbc.dto.*;
import java.util.List;

public class JdbcPractice {
	public static void main(String[]args) {
		
		int member = (int)(Math.random()*4+1);
		StudyMemberDao smDao = new StudyMemberDao();
		StudyMember sm = smDao.getId(member);
		System.out.println(sm); //특정 id값 데이터 조회
		
//		StudyMember sm2 = new StudyMember(5,"jungwhan","suwon");
//		smDao.addMember(sm2); //데이터 추가 
	
//		smDao.deleteMember("jungwhan"); //데이터 삭제
		
		List <StudyMember> smList = smDao.selectAll();
		for(StudyMember i : smList) {
			System.out.println(i);
		}//모든 데이터 조회 
		
	}
	
}
