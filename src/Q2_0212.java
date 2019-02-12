import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Q2_0212 {
    List list =new ArrayList();
    int count_check=0;
    int count=1;

    void check(String check_one,String check_next){
        if(check_one.equals(check_next)){
            count+=1;
    }
        else{
            list.add(check_one);
            list.add(count);
            count=1;
        }
    }


    public static void main(String[] args) {
        Q2_0212 p=new Q2_0212();
        String check_one="";
        String check_next="";
        String all="";
        Scanner input = new Scanner(System.in);
        String input_content = input.nextLine();
        String[] arr=new String[input_content.length()+1];
        for(int i=0; i<input_content.length(); i++){
            arr[i]=input_content.substring(i,i+1);
        }
        for (int i = 0; i < input_content.length(); i++)
        {

            check_one=arr[i];
            check_next=arr[i+1];
            p.check(check_one,check_next);


        }
//        p.list.remove(0);
//        p.list.remove(1);
        for(int i=0; i<p.list.size();i++){
            all+=p.list.get(i);
        }

        System.out.println(all);

    }


}
