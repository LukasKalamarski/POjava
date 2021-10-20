import java.util.Random;

public class Start {

    public static void generuj(int tab[], int n, int min, int max)
    {
        Random r = new Random();
        for (int j = 0; j < n; ++j) {
            tab[j] = r.nextInt(max + 1 - min) + min;
        }
    }

    public static int sumaDodatnich(int tab[])
    {
        int wyn = 0;
        for(int i = 0; i< tab.length; i++)
        {
            if(tab[i] > 0)
            {
                wyn+=tab[i];
            }
        }
        return wyn;
    }

    public static int sumaUjemnych(int tab[])
    {
        int wyn = 0;
        for(int i = 0; i< tab.length; i++)
        {
            if(tab[i] < 0)
            {
                wyn+=tab[i];
            }
        }
        return wyn;
    }

    public static void main(String[] args) {

        int []tab = new int[5];
        generuj(tab, 5, -10, 10);
//        for(int i = 0; i<5; i++)
//        {
//            System.out.println(tab[i]);
//        }
        System.out.println(sumaDodatnich(tab));
        System.out.println(sumaUjemnych(tab));
    }
}
