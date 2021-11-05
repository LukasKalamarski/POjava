import java.io.File;
import java.util.*;
import static java.lang.Math.*;
import java.io.*;
public class Start {

    public static int file(String z, String nazwa) throws IOException {
        File file = new File(nazwa);
        Scanner sc = new Scanner(file);
        StringBuffer sb = new StringBuffer();
        while (sc.hasNextLine())
            sb.append(sc.nextLine());
        String str = sb.toString();
        int kt = 0;
        int wyn = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == z.charAt(kt))
            {
                kt++;
            }
            if(kt == z.length()-1)
            {
                wyn++;
                kt=0;
            }
        }
        return wyn;
    }

    public static void main(String[] args) throws IOException {

        System.out.println(file("ma", "C:\\Users\\LukSquid\\Documents\\UWM\\Semestr3\\POjava\\text.txt"));

    }
}
