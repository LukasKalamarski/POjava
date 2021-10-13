import java.util.Scanner;
import static java.lang.Math.*;
public class Start {

    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        for (int i = 1; i < n; i++) {
            if(sqrt(i) % 1 == 0)
            {
                System.out.println(i);
            }
        }
    }
}
