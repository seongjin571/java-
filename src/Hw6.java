import java.util.Scanner;
public class Hw6 {
    public static void main(String []args){
        char []arrB = new char[26];
        char []arrS = new char[26];
        int []total =new int[26];
        int big=65;
        int small=97;
        for(int i=0; i<26; i++){
            arrB[i]=(char)big;
            big++;
        }
        for(int i=0; i<26; i++){
            arrS[i]=(char)small;
            small++;
        }
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for(int i=0; i<input.length(); i++){
            for(int j=0; j<26; j++){
                if(arrB[j]==input.charAt(i) || arrS[j]==input.charAt(i)){
                    total[j]++;
                }
            }
        }
        System.out.println("히스토램을 그립니다.");
        for(int i=0; i<26; i++) {
            System.out.print(arrB[i]);
            for (int j = 0; j < total[i]; j++)
                System.out.print("-");
            System.out.println("");
        }
    }
}
