import java.util.Scanner;
import java.util.Vector;
public class Hw8 {
    public static void main(String []args) {
        Vector<Integer> v = new Vector<>(10);
        Scanner sacn = new Scanner(System.in);
        int max_num=0;

        for (int i = 0; i < 10; i++) {
            int num = sacn.nextInt();
            v.add(num);
        }
        for(int i : v){
            max_num= (max_num<i) ? i:max_num;
        }
        System.out.println(max_num);
    }
}
