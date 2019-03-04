import java.io.*;
import java.util.*;

public class Hw10 {
    public static String[] convert(String string) {
        int stringLength = string.length();
        String[] stringArray = new String[stringLength];

        for (int i = 0; i < stringLength; i++) {
            stringArray[i] = string.substring(i, i + 1);
        }
        return stringArray;
    }

    public static String hideString(String string) {

        Set<Integer> set = new HashSet<>();
        int stringLength = string.length();
        int hideCount;
        if (string.length() <= 4)
            hideCount = 2;
        else
            hideCount = 3;

        while (set.size() != hideCount) {
            int setIndex = (int) (Math.random() * stringLength);
            set.add(setIndex);
        }

        String[] stringArray = convert(string);
        for (int i : set) {
            stringArray[i] = "_";
        }

        String hidedString = String.join("", stringArray);
        return hidedString;

    }

    public static String check(String answerString, String tryString, String middleAnswer) {
        int answerLength = answerString.length();

        String[] stringArray = convert(middleAnswer);
        for (int i = 0; i < answerLength; i++) {
            if (answerString.substring(i, i + 1).equals(tryString))
                stringArray[i] = tryString;
            System.out.print(stringArray[i]);
        }
        System.out.println("");

        String middleString = String.join("", stringArray);
        return middleString;
    }

    public static void main(String[] args) {
        BufferedReader reader = null;
        List<String> stringText = new ArrayList<>();
        String text = null;

        try {
            reader = new BufferedReader(new FileReader("src/word.txt"));
            while ((text = reader.readLine()) != null) {
                stringText.add(text);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Scanner scan = new Scanner(System.in);
        int listLength = stringText.size();
        int listIndex = (int) (Math.random() * listLength) + 1;
        String answerString = null;

        answerString = stringText.get(listIndex);
        String middleAnswer = hideString(answerString);
        System.out.println("행맨 게임을 시작합니다.");
        System.out.println(middleAnswer);
        System.out.print(">>");


        for (int i = 4; i >= 0; i--) {
            String answerTry = scan.next();
            middleAnswer = check(answerString, answerTry, middleAnswer);
            if (i != 0) {
                if (answerString.equals(middleAnswer)) {
                    System.out.println("정답입니다!");
                    break;
                } else
                    System.out.println(i + "번 남았습니다.");
                System.out.print(">>");
            } else {
                if (answerString.equals(middleAnswer)) {
                    System.out.println("정답입니다!");
                    break;
                } else
                    System.out.println("죽었습니다...정답은 " + answerString + "이였습니다.");
            }
        }
    }
}
