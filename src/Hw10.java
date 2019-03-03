import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Hw10 {
    public static String hideString(String string){
        int stringLength = string.length();

    }
    public static void main(String[]args){
        BufferedReader reader = null;
        List<String> stringText = new ArrayList<>();
        String text = null;
        try {
            reader = new BufferedReader(new FileReader("src/word.txt"));
            while ((text = reader.readLine())!=null){
                stringText.add(text);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
//        int count = 1;
        Scanner scan = new Scanner(System.in);
        int listIndex = scan.nextInt();
        String answerString = null;

        try {
            answerString = stringText.get(listIndex);
            System.out.println(answerString);
        }catch (IndexOutOfBoundsException e){
            System.out.println("선택한 인자값이 없습니다.");
        }

        for(int i = 4; i>=0; i--) {
                String answerTry = scan.next();
                if(i!=0) {
                        if (answerString.equals(answerTry)) {
                        System.out.println("정답입니다.!");
                        i=-1;
                    } else {
                        System.out.println(i + "번 기회가 남았습니다.");
                    }
                }
                else{
                    if (answerString.equals(answerTry)) {
                        System.out.println("정답입니다.!");
                        i=-1;
                    } else {
                        System.out.println("죽었습니다.");
                    }
                }
        }
    }
}
