import java.util.Scanner;

public class Q2_0212_2{
        public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        String number_input = number.nextLine();
        String new_string="";

        for (int i = 0; i < number_input.length(); i++){
            int count=1;
            for(int j=i; j<number_input.length()-1; j++) {
                if (number_input.charAt(j) == number_input.charAt(j + 1))
                    count++;
                else
                    break;
            }
            new_string+=number_input.charAt(i);
            new_string+=count;
            i+=count-1;
        }

        System.out.println(new_string);
    }
}
