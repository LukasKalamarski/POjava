import java.util.*;

import static java.lang.Math.*;
public class Start {

    public static int countChar(String str, char c)
    {
        int wyn = 0;
        for( int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == c)
            {
                wyn++;
            }
        }
        return wyn;
    }

    public static int countSubStr(String str, String subStr)
    {
        int kt = 0;
        int wyn = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == subStr.charAt(kt))
            {
                kt++;
            }
            if(kt == subStr.length()-1)
            {
                wyn++;
                kt=0;
            }
        }
        return wyn;
    }

    public static String middle(String str)
    {
        if(str.length()%2 == 0)
        {
            String temp = (String.valueOf(str.charAt((str.length()/2)-1) + String.valueOf(str.charAt(str.length()/2))));
            return temp;
        }
        return String.valueOf(str.charAt((int) floor(str.length()/2)));
    }

    public static String repeat(String str, int n)
    {
        String temp = "";
        for(int i=0; i<n; i++)
        {
            temp = temp + str;
        }
        return temp;
    }

    public static int[] where(String str, String subStr)
    {
        int kt = 0;
        int t = 0;
        int[] wyn = new int[str.length()];
        for(int i=0; i<str.length(); i++)
        {
            if(kt == subStr.length()-1)
            {
                kt=0;
                wyn[t] = i;
                t++;
            }
            else if(str.charAt(i) == subStr.charAt(kt))
            {
                kt++;
                wyn[t] = i;
                t++;
            }
        }
        return wyn;
    }

    public static String change(String str)
    {
        StringBuffer sb = new StringBuffer();
        for(int i =0; i<str.length(); i++)
        {
            sb.append(String.valueOf(str.charAt(i)).toUpperCase(Locale.ROOT));
        }
        String st = sb.toString();
        return st;
    }

    public static String nice(String str)
    {
        StringBuffer sb = new StringBuffer();
        int t = str.length()%3;
        for(int i=0; i<str.length(); i++)
        {
            if (t == 0 && i != 0)
            {
                sb.append("\'");
            }
            if(t == 0)
                t=3;
            sb.append(str.charAt(i));
            t--;
        }
        String st = sb.toString();
        return st;
    }

    public static String niceM(String str)
    {
        StringBuffer sb = new StringBuffer();
        String temp = nice(str);

        int ile = 0;
        for (int i=0; i<temp.length(); i++)
        {
            if(String.valueOf(temp.charAt(i)).equals("\'"))
            {
                sb.append(ile);
                sb.append("\'");
                ile = 0;
            }
            else
            {
                ile++;
            }
            if(i==temp.length()-1)
                sb.append(ile);
        }
        String wyn = sb.toString();
        return wyn;
    }

    public static void main(String[] args) {

//        System.out.println(countChar("coco", 'c'));
//        System.out.println(countSubStr("lalala", "la"));
//        System.out.println(middle("bob"));
//        System.out.println(repeat("ho", 5));
//        for(int i=0; i<4; i++)
//        {
//            System.out.println(where("ohoho", "ho")[i]);
//        }
//        System.out.println(change("lama"));
//        System.out.println(nice("12456"));
        System.out.println(niceM("12345678"));
    }
}
