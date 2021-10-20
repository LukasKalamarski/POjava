import java.util.Random;

public class Start {

    public static void generuj(int tab[], int n, int min, int max)
    {
        Random r = new Random();
        for (int j = 0; j < n; ++j) {
            tab[j] = r.nextInt(max + 1 - min) + min;
        }
    }

    public static int dlugoscMax(int tab[])
    {
        int wyn = 0;
        int max = tab[0];
        for(int i = 0; i< tab.length; i++)
        {
            if(tab[i] >= max)
            {
                max = tab[i];
            }
        }
        while(true)
        {
            if(max > 1)
            {
                wyn++;
            }
            else
                break;
            max = max / 10;
        }
        return wyn;
    }

    public static void main(String[] args) {

        int []tab = new int[5];
        generuj(tab, 5, 0, 1000);
        for(int i = 0; i<5; i++)
        {
            System.out.println(tab[i]);
        }
        System.out.println(dlugoscMax(tab));
    }
}
