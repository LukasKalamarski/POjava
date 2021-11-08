import java.util.*;
import java.util.ArrayList;

public class Start {

    public static List<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        boolean fl;
        int ila = 0;
        int ilb = 0;
        int siz = a.size() + b.size();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0; i<siz; i++)
        {
            if(i%2==0)
                fl=true;
            else
                fl=false;
            if(i<a.size()*2 && fl)
            {
                temp.add(a.get(ila));
                ila++;
            }
            else if(i<b.size()*2 && !fl)
            {
                temp.add(b.get(ilb));
                ilb++;
            }
        }
        return temp;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        ArrayList<Integer> y = new ArrayList<>();
        y.add(4);
        y.add(5);
        y.add(6);
        ArrayList<Integer> z = new ArrayList<>(merge(x, y));
        for(int i=0; i<z.size(); i++)
        {
            System.out.println(z.get(i));
        }
    }
}
