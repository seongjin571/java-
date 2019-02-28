import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Student implements Comparable<Student>{
    String name;
    int kor,eng,math;
    int total;
    Student(String name, int kor, int eng, int math){
        this.name=name;
        this.kor=kor;
        this.eng=eng;
        this.math=math;
        this.total=kor+eng+math;
    }


    @Override
    public int compareTo(Student student){
        if (total>student.total)
            return -1;
        else if(total<student.total)
            return 1;
        else
            return 0;
    }

}
public class Q5_0226 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int korR=(int)(Math.random()*100);
            int engR=(int)(Math.random()*100);
            int mathR=(int)(Math.random()*100);
            Student student = new Student("한성진",korR,engR,mathR);
            list.add(student);
        }
        Collections.sort(list);
        for(Student s: list){
            System.out.println("이름: "+s.name+" 국어: "+s.kor+" 수학: "+s.math+" 영어: "+s.eng+" 총점 :"+s.total);
        }
    }
}


