import java.util.Scanner;

    class tv{
        Boolean power;
        int channel=10;
        void power(){
            power=!power;
        }
        void channelUp(){
            channel=channel+1;
        }
        void channelDown(){
            channel=channel-1;
        }
    }
    class CaptionTv extends tv{
        Boolean caption=false;
        void displayCation(String text){
            if(caption) {
                System.out.println("자막="+text);
            }
        }
    }
    public class Q5_0207 {
        public static void main(String []args){
            CaptionTv remote= new CaptionTv();
            remote.channelUp();
            remote.caption=true;
            System.out.println("채널은="+remote.channel);
            System.out.println("자막을 입력하시오");
            Scanner caption_scan =new Scanner(System.in);
            String caption_text= caption_scan.nextLine();
            remote.displayCation(caption_text);
        }
    }


