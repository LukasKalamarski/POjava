import java.util.Scanner;
public class Start {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ile? ");
        int n = sc.nextInt();
        System.out.println("Liczby:");
        int l = 1;
        boolean p = false;
        int par = 0;
        for(int i = 0; i<n; i++)
        {
            l = sc.nextInt();
            if(i > 0 && p == true && l > 0)
            {
                par++;
            }
            if(l <= 0)
            {
                p = false;
            }
            if(l > 0)
            {
                p = true;
            }
        }
        System.out.println(par);
    }
}
