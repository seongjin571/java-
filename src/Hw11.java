import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.*;

public class Hw11 {
    public static void main(String[] args) throws IOException {
        File in = new File("src/a.jpg");
        File out = new File("b.jpg");
        long fsize1 = in.length();
        System.out.println(fsize1);
        FileInputStream fis = new FileInputStream(in);
        FileOutputStream fos = new FileOutputStream(out);

        byte [] buffer = new byte[1028];
        int input = -1;
        int count =0;
        int tenPercent = (int)fsize1/10;
        int currentPercent = tenPercent;
        while((input = fis.read(buffer)) != -1){
            fos.write(buffer,0,input);
            count+=1028;
            if(currentPercent <= count) {
                System.out.println("*");
                currentPercent += tenPercent;
            }
        }

    }

}
