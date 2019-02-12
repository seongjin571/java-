import java.util.Scanner;
public class Q1_0212 {
    public static void main(String[]args){
        System.out.println("입력");
        Scanner input= new Scanner(System.in);
        String input_string=input.nextLine();
        String clean1 = input_string.replaceAll("[^0-9]", "");
        System.out.println(clean1);
    }
}
