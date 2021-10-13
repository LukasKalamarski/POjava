import java.util.Scanner;
import static java.lang.Math.*;
public class Start {

    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int dod = 0;
        int zer = 0;
        int uj = 0;
        int n = temp.nextInt();
        for (int i = -n; i < n; i++) {
            if(i >= 0)
            {
                dod++;
            }
            if(i <= 0)
            {
                uj++;
            }
            if(i == 0)
            {
                zer++;
            }
        }
        System.out.println("Liczba liczb dodatnich: " + dod);
        System.out.println("Liczba zer: " + zer);
        System.out.println("Liczba liczb ujemnych: " + uj);
    }
}
