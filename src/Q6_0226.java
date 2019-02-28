import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class Q6_0226 {
    public static void main(String []args){
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        ArrayList<Integer> list3= new ArrayList<>();
        ArrayList<Integer> list4= new ArrayList<>();
        Set <Integer> set=new HashSet<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        for(int i=0; i<list1.size(); i++){
            list3.add(list1.get(i));
            list4.add(list2.get(i));
        }
//        list3.add(list1);
//        list4.add(list2);


//        System.out.println("교집합");
//        list1.retainAll(list2);
//        for(Integer i: list1)
//            System.out.print(i+" ");
//
//
//        System.out.println("차집합-");
//        list1.addAll(list2);
//        list3.retainAll(list4);
//        list1.removeAll(list3);
//        for(Integer i: list1)
//            System.out.print(i+" ");

        System.out.println("합집합");
        list1.addAll(list2);
        //1번
//        for(Integer i : list1){
//            set.add(list1.get(i));
//        }
        //2번
//        for(int i=0; i<list1.size(); i++){
//            set.add(list1.get(i));
//        }
        //출력
        for(Integer i :set){
            System.out.print(i+" ");
        }
//        Iterator<Integer> iterator = set.iterator();
//        while(iterator.hasNext()){
//            System.out.print(iterator.next()+" ");
//        }


    }
}
