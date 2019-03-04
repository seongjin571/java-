import java.io.*;
import java.util.*;

public class Hw10_3 {

    public static void gameStart(String answer) {
        Set<Integer> setIndex = new HashSet<>();
        int answerLength = answer.length();
        char[] charAnswer = answer.toCharArray();
        char[] hideAnswer = answer.toCharArray();
        int hideCount;
        if (answer.length() <= 4)
            hideCount = 2;
        else
            hideCount = 3;

        while (setIndex.size() != hideCount) {
            int hideIndex = (int) (Math.random() * answerLength);
            setIndex.add(hideIndex);
        }

        for (int i : setIndex) {
            hideAnswer[i] = '_';
        }

        Scanner scan = new Scanner(System.in);
        char tryAnswer = ' ';
        for (int i = 4; i >= 0; i--) {
            System.out.println(hideAnswer);
            System.out.print(">>");
            tryAnswer = scan.next().charAt(0);

            for (int j : setIndex) {
                if (charAnswer[j] == tryAnswer)
                    hideAnswer[j] = tryAnswer;
            }
            if (Arrays.equals(hideAnswer,charAnswer)) {
                System.out.println(answer+ "정답입니다!");
                break;
            } else {
                if (i == 0) {
                    System.out.println("실패하셨습니다");
                    System.out.print("정답은 " +new String(charAnswer)+" 입니다.");
                    break;
                } else {
                    System.out.println(i + "번 기회가 남았습니다.");
                }
            }
        }
    }

    public static void main(String[] args) {
        BufferedReader reader = null;
        List<String> readerList = new ArrayList<>();
        String text = null;

        try {
            reader = new BufferedReader(new FileReader("src/word.txt"));
            while ((text = reader.readLine()) != null) {
                readerList.add(text);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("입출력 오류");
        }

        int listLength = readerList.size();
        int listIndex = (int) (Math.random() * listLength) + 1;
        String strAnswer = null;

        strAnswer = readerList.get(listIndex);
        System.out.println("행맨 게임을 시작합니다.");
        gameStart(strAnswer);

    }
}
