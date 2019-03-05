import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q4_0305 {
    public static void main(String[]args){
        List<String> dataList = new ArrayList<>();
        BufferedReader reader = null;
        PrintWriter writer = null;
        try{
            reader = new BufferedReader(new FileReader("src/Data.txt"));
            writer = new PrintWriter(new FileWriter("Data.txt"));
            String strReader = null;
            while((strReader = reader.readLine()) != null){
                dataList.add(strReader);
            }
            Collections.sort(dataList);
            for(String i : dataList) {
                System.out.println(i);
                writer.println(i);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            writer.close();
            try {
                reader.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        }
}

