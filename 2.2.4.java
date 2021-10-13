import java.util.Scanner;
import static java.lang.Math.*;
public class Start {

    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int najm = 0;
        int najw = 0;
        int n = temp.nextInt();
        for (int i = -n; i < n; i++) {
            if(i == -n)
            {
                najw = -n;
                najm = -n;
            }
            if(i > najw)
            {
                najw = i;
            }
            if(i < najm)
            {
                najm = i;
            }
        }
        System.out.println("najmniejsza" +najm);
        System.out.println("największa" +najw);
    }
}
