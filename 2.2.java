import java.util.Scanner;
public class Start {

    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        int wynik = 1;
        for (int i = 0; i < n; i++) {
            wynik *= temp.nextInt();
        }
        System.out.println(wynik);
    }
}
