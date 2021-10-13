import java.util.Scanner;
import static java.lang.Math.*;
public class Start {

    public static int sil(int n) {
        int wynik = 1;
        for(int i = 1; i<=n; i++)
        {
            wynik = wynik * i;
        }
        return wynik;
    }

    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        double wynik = 0;
        for (int i = 1; i <= n; i++) {
            int t = temp.nextInt();
            wynik = wynik + (pow(-1, i)*t) / (sil(t));
        }
        System.out.println(wynik);
    }
}
