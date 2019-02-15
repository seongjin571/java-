import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    int id;
    String product_ex;
    String producer;
    int cost;
    Product(int id){
        this.id=id;
    }
    Scanner input = new Scanner(System.in);

    void input() {
        System.out.printf("상품 설명>>");
        this.product_ex = input.nextLine();
        System.out.printf("생산자>>");
        this.producer = input.nextLine();
        System.out.printf("가격>>");
        this.cost = input.nextInt();
    }

    void print() {
        System.out.println("ID>>" + id);
        System.out.println("상품 설명>>" + product_ex);
        System.out.println("생산자>>" + producer);
        System.out.println("가격>>" + cost);
}
}

class Book extends Product {
    int ISBN;
    String author_name;
    String book_name;
    Book(int id){
        super(id);
    }

    void input() {
        super.input();
        System.out.printf("ISBN 번호>>");
        this.ISBN = input.nextInt();
        System.out.printf("저자>>");
        input.nextLine();
        this.author_name = input.nextLine();
        System.out.printf("책 제목>>");
        this.book_name = input.nextLine();
    }

    void print() {
        super.print();
        System.out.println("ISBN 번호>>" + ISBN);
        System.out.println("저자>>" + author_name);
        System.out.println("책 제목>>" + book_name);
    }
}

class CompactDisc extends Book {
    String album_name;
    String singer_name;
    CompactDisc(int id){
        super(id);
    }
    void input() {
        super.input();
        System.out.printf("앨범 제목>>");
        this.album_name = input.nextLine();
        System.out.printf("가수>>");
        this.singer_name = input.nextLine();
    }

    void print() {
        super.print();
        System.out.println("앨범 제목>>" + album_name);
        System.out.println("가수>>" + singer_name);
    }
}

class ConverstionBook extends Book {
    String lang_info;

    ConverstionBook(int id){
        super(id);
    }
    void input() {
        super.input();
        System.out.printf("언어>>");
        this.lang_info = input.nextLine();
    }

    void print() {
        super.print();
        System.out.println("언어>>" + lang_info);
    }

}

public class Hw3 {
    static List<Product> list = new ArrayList<Product>();

    static void choice_type() {
        if(list.size()<10) {
            System.out.println("책(1). 음악CD(2). 회화책(3)>>");
            Scanner choice = new Scanner(System.in);
            int type_number = choice.nextInt();
            switch (type_number) {
                case 1:
                    Book product_arr = new Book(list.size() + 1);
                    product_arr.input();
                    list.add(product_arr);
                    break;
                case 2:
                    CompactDisc product_arr2 = new CompactDisc(list.size() + 1);
                    product_arr2.input();
                    list.add(product_arr2);
                    break;
                case 3:
                    ConverstionBook product_arr3 = new ConverstionBook(list.size() + 1);
                    product_arr3.input();
                    list.add(product_arr3);
                    break;
            }
        }
        else{
            System.out.println("상품 등록 한도를 넘었습니다.");
        }
    }


    static void exit() {
        System.exit(0);
    }

    public static void main(String[] args) {


        while (true) {
            System.out.println("상품 추가(1). 모든 상품 조회(2). 끝내기(3)>>");
            Scanner choice = new Scanner(System.in);
            int choice_number = choice.nextInt();
            switch (choice_number) {
                case 1:
                    choice_type();
                    break;
                case 2:
                    for (int i = 0; i < list.size(); i++) {
                        list.get(i).print();
                        System.out.println("");
                    }
                    break;
                case 3:
                    exit();
                    break;
            }
        }
    }

}
