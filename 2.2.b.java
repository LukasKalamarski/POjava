import java.util.Scanner;
import static java.lang.Math.*;
public class Start {

    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        int wynik = 0;
        for (int i = 0; i < n; i++) {
            if(i%3==0 && i%5==1) {
                wynik+=1;
            }
        }
        System.out.println(wynik);
    }
}
