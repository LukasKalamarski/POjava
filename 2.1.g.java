import java.util.Scanner;
import static java.lang.Math.*;
public class Start {

    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        int wynik = 0;
        for (int i = 0; i < n; i++) {
            int t = temp.nextInt();
            wynik += t;
        }
        System.out.println(wynik);
        wynik = 1;
        for (int i = 0; i < n; i++) {
            int t = temp.nextInt();
            wynik *= t;
        }
        System.out.println(wynik);
    }
}
