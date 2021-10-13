import java.util.Scanner;
import static java.lang.Math.*;
public class Start {

    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int f = 0;
        int n = temp.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i == 1)
            {
                f = i;
            }
            else
            {
                System.out.println(i);
            }
        }
        System.out.println(f);
    }
}
