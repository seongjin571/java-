import java.util.Scanner;
public class Hw2{
    public static void main(String[]args){
        System.out.printf("게임에 참가하는 인원은 몇명입니까?");
        Scanner scan=new Scanner(System.in);
        int player_number = scan.nextInt();
        game_borad[] player;
        player=new game_borad[player_number];
        for(int i=0; i<player_number; i++){
            System.out.printf("참가자의 이름을 입력하세요>>");
            String name = scan.next();
            player[i]=new game_borad(name);
        }
        System.out.println("시작하는 단어는 아버지입니다.");
        for(int i=0; i<player_number; i++){
            player[i].game_start();
            if(i+1==player_number)
                i=-1;
        }
    }
}
class game_borad{
    String name;
    static String before_string="아버지";
    static String next_string="";

    game_borad(String name){
        this.name=name;
    }

    void game_start(){
        System.out.printf(this.name+">>");
        Scanner word_scan =new Scanner(System.in);
        next_string=word_scan.next();
        String before = before_string.substring(before_string.length()-1,before_string.length());
        String next= next_string.substring(0,1);
        if(before.equals(next)){
            before_string=next_string;
        }
        else{
            System.out.println(this.name+"이 졌습니다.");
            System.exit(0);
        }
    }
}