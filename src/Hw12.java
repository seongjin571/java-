import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class seat {
    List<String> seatList = new ArrayList<>();
    String seatName;
    String reservName;
    Scanner scan = new Scanner(System.in);

    seat(String seatName) {
        this.seatName = seatName;
        for (int i = 0; i < 10; i++)
            seatList.add("---");
    }

    void inputSeat() {
        System.out.print("이름 : ");
        reservName = scan.next();
        System.out.print("번호 : ");
        int reservNumber = scan.nextInt();
        if (seatList.get(reservNumber - 1).equals("---"))
            seatList.set(reservNumber - 1, reservName);
        else {
            System.out.println("이미 예약된 좌석입니다.");
            inputSeat();
        }
    }

    void cancelSeat() {
        printSeat();
        System.out.print("이름 : ");
        reservName = scan.next();
        for (int i = 0; i < 10; i++) {
            if (seatList.get(i).equals(reservName))
                seatList.set(i, "---");
        }
    }

    void printSeat() {
        System.out.print(seatName + ">> ");
        for (String i : seatList)
            System.out.print(i + " ");
        System.out.println("");
    }
}


public class Hw12 {
    public static void main(String[] args) {
        seat seatS = new seat("S");
        seat seatA = new seat("A");
        seat seatB = new seat("B");
        boolean check = true;
        Scanner scan = new Scanner(System.in);
        while (check == true) {
            System.out.print("예약(1), 조회(2), 취소(3), 끝내기(4) >> ");
            int select = scan.nextInt();
            int seatSelect;
            switch (select) {

                case 1:
                    System.out.print("좌석 구분 S(1), A(2), B(3) >> ");
                    seatSelect = scan.nextInt();
                    if (seatSelect == 1)
                        seatS.inputSeat();
                    else if (seatSelect == 2)
                        seatA.inputSeat();
                    else if (seatSelect == 3)
                        seatB.inputSeat();
                    else System.out.println("잘못 입력하셨습니다.");
                    break;

                case 2:
                    seatS.printSeat();
                    seatA.printSeat();
                    seatB.printSeat();
                    System.out.println("<<<조회를 완료하였습니다.>>>");
                    break;

                case 3:
                    System.out.print("좌석 구분 S(1), A(2), B(3) >> ");
                    seatSelect = scan.nextInt();
                    if (seatSelect == 1)
                        seatS.cancelSeat();
                    else if (seatSelect == 2)
                        seatA.cancelSeat();
                    else if (seatSelect == 3)
                        seatB.cancelSeat();
                    else System.out.println("잘못 입력하셨습니다.");
                    break;

                case 4:
                    check = false;
                    break;

                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
