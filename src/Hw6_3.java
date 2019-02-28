import java.util.Scanner;
public class Hw6_3 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        for(char i='A'; i<='Z'; i++){
            System.out.print(i+" ");

            for(int j=0; j<string.length(); j++){
                if(string.toUpperCase().charAt(j)==i){
                    System.out.print("-");
                }
            }
            System.out.println("");
        }
    }
}
