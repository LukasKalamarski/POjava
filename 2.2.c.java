import java.util.Scanner;
import static java.lang.Math.*;
public class Start {

    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        boolean p = false;
        if(sqrt(n) % 1 == 0)
        {
            p = true;
        }
        System.out.println(p);
    }
}
