import java.io.File;
import java.util.*;
import static java.lang.Math.*;
import java.io.*;
public class Start {

    public static int file(char z, String nazwa) throws IOException {
        File file = new File(nazwa);
        Scanner sc = new Scanner(file);
        StringBuffer sb = new StringBuffer();
        while (sc.hasNextLine())
            sb.append(sc.nextLine());
        String st = sb.toString();;
        int ile = 0;
        for(int i=0; i<st.length(); i++)
        {
            if(st.charAt(i) == z)
                ile++;
        }
        return ile;
    }

    public static void main(String[] args) throws IOException {

        System.out.println(file('a', "C:\\Users\\LukSquid\\Documents\\UWM\\Semestr3\\POjava\\text.txt"));

    }
}
