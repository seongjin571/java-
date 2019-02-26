//import java.util.Collections;
//import java.util.List;
//import java.util.ArrayList;
////interface Comparable<T>{
//////    void compareTo();
////}
//class Student implements Comparable<Student>{
//    String name;
//    int kor,eng,math;
//    int total;
//    Student(String name, int kor, int eng, int math){
//        this.name=name;
//        this.kor=kor;
//        this.eng=eng;
//        this.math=math;
//        this.total=kor+eng+math;
//    }
//
//    @Override
////    public int compareTo(Student student){
//////        return total.compareTo(student.total);
////
////    }
////    public void setTotal(){
////
////    }
//}
//public class Q5_0226 {
//    public static void main(String[] args) {
//        List<Student> list = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            int korR=(int)(Math.random()*100);
//            int engR=(int)(Math.random()*100);
//            int mathR=(int)(Math.random()*100);
//            Student student = new Student("한성진",korR,engR,mathR);
//            list.add(student);
//        }
//        Collections.sort(list);
//
//
//    }
//}
//
//
