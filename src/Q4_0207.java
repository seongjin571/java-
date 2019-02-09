import java.util.Scanner;
class air{
    boolean power=false;
    int temp=20;
    void power(){
        power=!power;
    }
    void channelUp(){
        temp++;
        System.out.println("현재 온도: "+temp);
    }
    void channelDown(){
        temp--;
        System.out.println("현재 온도: "+temp);
    }
    void powerControl(){
        System.out.println("전원 on-3");
        Scanner count = new Scanner(System.in);
        int count_int = count.nextInt();
        if(count_int==3){
            power();
        }
    }
}
public class Q4_0207 {

        public static void main(String []args){

        air remote = new air();
        remote.powerControl();
        while(remote.power) {
            System.out.println("온도 Up-1//온도 Down-2//전원 off-3");
            Scanner controller = new Scanner(System.in);
            int controller_number  = controller.nextInt();
            if(controller_number ==1){
                remote.channelUp();
            }
            else if(controller_number ==2){
                remote.channelDown();
            }
            else if(controller_number ==3){
                remote.power();
                System.out.println("전원이 종료 되었습니다.");
                remote.powerControl();
            }
            else{
                System.out.println("올바른 입력이 아닙니다.");
            }

        }

    }
}
