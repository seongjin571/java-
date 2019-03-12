import java.util.Scanner;
import java.util.Vector;

class WordGenerator extends Thread{
    Vector<String> word = new Vector<>(9);
    String [] data = {"태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카"};
    public void run(){
        for(int i = 0; i < 9; i++){
            word.add(data[i]);
             try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class Hw14 {
    public static void main(String[]args){
        WordGenerator wg = new WordGenerator();
        Scanner scan = new Scanner(System.in);
        wg.start();
        while (true){
            System.out.println(wg.word);
            System.out.print(">>");
            String name = scan.next();
            wg.word.remove(name);
        }
    }
}
