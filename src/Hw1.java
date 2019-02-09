import java.util.Scanner;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
class function_deposit {
    List list = new ArrayList();
    HashMap map = new HashMap();

    void new_deposit() {
        map = new HashMap();
        System.out.println("-------");
        System.out.println("계좌생성");
        System.out.println("-------");
        System.out.printf("계좌번호: ");
        Scanner new_deposit_data = new Scanner(System.in);
        String deposit_number = new_deposit_data.nextLine();
        System.out.printf("계좌주: ");
        String deposit_name = new_deposit_data.nextLine();
        System.out.printf("초기입금액: ");
        int deposit_money = new_deposit_data.nextInt();

        map.put(1, deposit_number);
        map.put(2, deposit_name);
        map.put(3, deposit_money);
        list.add(map);

        System.out.println("계좌가 생성되었습니다.");
    }

    void list_deposit() {
        HashMap getMap = new HashMap();
        System.out.println("-------");
        System.out.println("계좌목록");

        for (int i = 0; i < list.size(); i++) {
            getMap = (HashMap) list.get(i);
            System.out.print(getMap.get(1) + "     ");
            System.out.print(getMap.get(2) + "     ");
            System.out.print(getMap.get(3) + "     ");
            System.out.println("");
        }
    }

    void input_deposit() {
        int check=0;
        HashMap getMap = new HashMap();
        System.out.println("-------");
        System.out.println("예금");
        System.out.println("-------");
        System.out.printf("계좌번호: ");
        Scanner new_deposit_data = new Scanner(System.in);
        String deposit_number = new_deposit_data.nextLine();
        System.out.printf("예금액: ");
        int deposit_money = new_deposit_data.nextInt();
        getMap = (HashMap) list.get(0);
        for (int i = 0; i < list.size(); i++) {
            getMap = (HashMap) list.get(i);
            if(getMap.get(1).equals(deposit_number)) {
                int n = ((Integer) getMap.get(3)).intValue();
                n += deposit_money;
                getMap.put(3, n);
                System.out.println("예금이 성공되었습니다.");
                check=1;
                break;
            }
        }
        if(check==0)
            System.out.println("계좌번호를 잘못 입력하셨습니다.");
    }



    void out_deposit() {
        int check=0;
        HashMap getMap = new HashMap();
        System.out.println("-------");
        System.out.println("출금");
        System.out.println("-------");
        System.out.printf("계좌번호: ");
        Scanner new_deposit_data = new Scanner(System.in);
        String deposit_number = new_deposit_data.nextLine();
        System.out.printf("출금액: ");
        int deposit_money = new_deposit_data.nextInt();
        for (int i = 0; i < list.size(); i++) {
            getMap = (HashMap) list.get(i);
            if(getMap.get(1).equals(deposit_number)) {
                int n = ((Integer) getMap.get(3)).intValue();
                n -= deposit_money;
                getMap.put(3, n);
                System.out.println("출금이 성공되었습니다.");
                check=1;
            }
        }
        if(check==0)
            System.out.println("계좌번호를 잘못 입력하셨습니다.");
    }

}
public class Hw1 {
    public static void main(String []args) {
        function_deposit control= new function_deposit();
        while (true) {

            System.out.println("-----------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("-----------------------------------------------");
            System.out.println("선택>");
            Scanner choice = new Scanner(System.in);
            int choice_number = choice.nextInt();
            if(choice_number==1) {
                control.new_deposit();
            }
            else if(choice_number==2) {
                control.list_deposit();
            }
            else if(choice_number==3)
                control.input_deposit();
            else if(choice_number==4)
                control.out_deposit();
            if(choice_number==5)
                break;
        }
        System.out.println("프로그램 종료");
    }

}

