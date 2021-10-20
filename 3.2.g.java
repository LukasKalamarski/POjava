import java.util.Random;
import static java.lang.Math.*;

public class Start {

    public static void generuj(int tab[], int n, int min, int max)
    {
        Random r = new Random();
        for (int j = 0; j < n; ++j) {
            tab[j] = r.nextInt(max + 1 - min) + min;
        }
    }

    public static void odwrocFragment(int tab[], int lewy, int prawy)
    {
        for(int i = 0; i< floor((prawy - lewy)/2); i++)
        {
            int temp = tab[lewy + i];
            tab[lewy + i] = tab[prawy - i];
            tab[prawy-i] = temp;
        }
    }

    public static void main(String[] args) {

        int []tab = new int[5];
        generuj(tab, 5, -10, 10);
        for(int i = 0; i<5; i++)
        {
            System.out.println(tab[i]);
        }
        System.out.println();
        odwrocFragment(tab, 2, 4);
        for(int i = 0; i<5; i++)
        {
            System.out.println(tab[i]);
        }

    }
}
