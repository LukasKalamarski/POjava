package pl.imiajd.kalamarski;

public class Adres
{
    private String ulica;
    private String numer_domu;
    private String numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;
    public Adres(String ul, String nd, String nm, String mi, String kp)
    {
        this.ulica = ul;
        this.numer_domu = nd;
        this.numer_mieszkania = nm;
        this.miasto = mi;
        this.kod_pocztowy = kp;
    }

    public Adres(String ul, String nd, String mi, String kp)
    {
        this.ulica = ul;
        this.numer_domu = nd;
        this.miasto = mi;
        this.kod_pocztowy = kp;
    }

    public void pokaz()
    {
        System.out.println(this.kod_pocztowy + ", " + this.miasto);
        System.out.println(this.ulica + ", " + this.numer_domu + ", " + this.numer_mieszkania);
    }

    public boolean przed(String a2)
    {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for(int i=0; i<this.kod_pocztowy.length(); i++)
        {
            if(this.kod_pocztowy.charAt(i) != '-')
            {
                sb.append(this.kod_pocztowy.charAt(i));
            }
        }
        for(int i=0; i<a2.length(); i++)
        {
            if(a2.charAt(i) != '-')
            {
                sb2.append(a2.charAt(i));
            }
        }
        int ad1 = Integer.parseInt(sb.toString());
        int ad2 = Integer.parseInt(sb2.toString());
        if(ad1 > ad2)
            return false;
        return true;

    }
}

