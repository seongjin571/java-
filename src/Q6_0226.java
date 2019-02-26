import java.util.ArrayList;
public class Q6_0226 {
    public static void main(String []args){
        ArrayList list1= new ArrayList();
        ArrayList list2= new ArrayList();


        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        System.out.println("교집합");
        list3.retainAll(list4);
        for(int i=0; i<list3.size(); i++)
        {
            System.out.print(list3.get(i)+" ");
        }
        System.out.println(" ");
        list3=list1;
        list4=list2;
        System.out.print("합집합-");
        list3.addAll(list4);
        for(int i=0; i<list3.size(); i++)
        {
            System.out.print(list3.get(i)+" ");
        }
        list3=list1;
        list4=list2;
        System.out.println("차집합");




    }
}
