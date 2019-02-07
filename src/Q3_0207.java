import java.util.Scanner;
import java.util.Arrays;
public class Q3_0207 {
    public static void main(String[] args) {
        System.out.println("로또 번호를 입력해 주세요.");
        Scanner num=new Scanner(System.in);
        int num_final=num.nextInt();
        for(int i=0; i<num_final; i++){
            System.out.println(i+"번째: "+making_random());
        }
    }
    static String making_random() {
        int[] arr = new int[6];
        while (true) {
            for (int i = 0; i < 6; i++) {
                arr[i] = (int) (Math.random() * 45 + 1);
            }
            if(check(arr)==true)
                break;
        }
        return Arrays.toString(arr);
    }
    static boolean check(int arr_check[]){
        int [] check_num=new int[45];
        for(int i=0; i<6; i++){
            check_num[arr_check[i]-1]+=1;
            if(check_num[arr_check[i]-1]==2)
                return false;
        }
        return true;
    }
}
