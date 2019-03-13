class Thread3 extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(i);

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Q4_0313 {
    public static void main(String[]args){
        Thread3 th3 = new Thread3();
        th3.setDaemon(true);
        th3.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("종료합니다. ");
    }
}
