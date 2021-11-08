import java.util.*;
import java.util.ArrayList;
import java.util.stream.Stream;
public class Start {

    public static List<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> z = new ArrayList<>(a);
        z.addAll(b);
        int size2 = z.size();
        for(int i=0; i<z.size(); i++)
        {
            for(int j=0; j<size2-1; j++)
            {
                if(z.get(j)>z.get(j+1))
                {
                    Integer temp = z.get(j);
                    z.set(j, z.get(j+1));
                    z.set(j+1, temp);
                }
            }
            size2--;
        }
        return z;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(4);
        x.add(8);
        ArrayList<Integer> y = new ArrayList<>();
        y.add(2);
        y.add(3);
        y.add(9);
        ArrayList<Integer> z = new ArrayList<>(mergeSorted(x, y));
        for(int i=0; i<z.size(); i++)
        {
            System.out.println(z.get(i));
        }
    }
}
