import java.util.*;
import java.util.ArrayList;
import java.util.stream.Stream;
import static java.lang.Math.*;
public class Start {

    public static void reversed(ArrayList<Integer> a)
    {
        int size2 = (int) floor(a.size()/2);
        for(int i=0; i<size2; i++)
        {
            Integer temp = a.get(i);
            a.set(i, a.get(a.size()-i-1));
            a.set(a.size()-i-1, temp);
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);
        reversed(x);
        for(int i=0; i<x.size(); i++)
        {
            System.out.println(x.get(i));
        }
    }
}
