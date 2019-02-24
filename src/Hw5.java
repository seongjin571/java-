import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Location {
    String name;
    String lat;
    String har;
}
public class Hw5 {

    public static void main(String []args) {
        HashMap<String,Location>  map = new HashMap<String,Location>();
        Scanner input= new Scanner(System.in);
        for(int i=0; i<2; i++) {
            Location location = new Location();
            System.out.print("지명 입력-");
            location.name = input.nextLine();
            System.out.print("위도 입력-");
            location.lat = input.nextLine();
            System.out.print("경도 입력-");
            location.har = input.nextLine();
            System.out.println("");
            map.put(location.name, location);
        }
        System.out.print("지명을 검색하세요-");
        Location find_location = map.get(input.next());
        System.out.println("지역명 : "+find_location.name);
        System.out.println("위도 : "+find_location.lat);
        System.out.println("경도 : "+find_location.har);

        }
    }

