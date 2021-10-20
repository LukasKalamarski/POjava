import java.util.Random;

public class Start {

    public static void generuj(int tab[], int n, int min, int max)
    {
        Random r = new Random();
        for (int j = 0; j < n; ++j) {
            tab[j] = r.nextInt(max + 1 - min) + min;
        }
    }

    public static int ileDod(int tab[])
    {
        int wyn = 0;
        for(int i = 0; i< tab.length; i++)
        {
            if(tab[i] > 0)
            {
                wyn++;
            }
        }
        return wyn;
    }

    public static int ileUj(int tab[])
    {
        int wyn = 0;
        for(int i = 0; i< tab.length; i++)
        {
            if(tab[i] <0)
            {
                wyn++;
            }
        }
        return wyn;
    }

    public static int ileZer(int tab[])
    {
        int wyn = 0;
        for(int i = 0; i< tab.length; i++)
        {
            if(tab[i] == 0)
            {
                wyn++;
            }
        }
        return wyn;
    }

    public static void main(String[] args) {

        int []tab = new int[5];
        generuj(tab, 5, -30, 30);
//        for(int i = 0; i<5; i++)
//        {
//            System.out.println(tab[i]);
//        }
        System.out.println(ileDod(tab));
        System.out.println(ileUj(tab));
        System.out.println(ileZer(tab));
    }
}
