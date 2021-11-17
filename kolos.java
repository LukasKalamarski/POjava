package pl.edu.uwm.obiektowe.s151192.kolo1;
import java.time.LocalDate;
import java.util.ArrayList;


class Pozycja
{
    String nazwa;
    double cenaJednostkowa;
    float stawkaVat;
    float ilosc;
    double wartosc;
    Pozycja(String nz, double cj, float sv, float il)
    {
        this.nazwa = nz;
        this.cenaJednostkowa = cj;
        this.stawkaVat = sv;
        this.ilosc = il;
    }
    public double getWartosc()
    {
        this.wartosc = this.cenaJednostkowa * this.ilosc * this.stawkaVat;
        return  this.wartosc;
    }
}

class Faktura
{
    private String numer;
    private LocalDate dataWystawienia;
    private int terminPlatnosciDni;
    ArrayList<Pozycja> pozycje = new ArrayList<>();
    Faktura(String nr, LocalDate dw, int tp)
    {
        this.numer = nr;
        this.dataWystawienia = dw;
        this.terminPlatnosciDni = tp;
    }
    public void setDataWystawienia(LocalDate temp)
    {
        this.dataWystawienia = temp;
    }
    public void setTerminPlatnosciDni(int temp)
    {
        this.terminPlatnosciDni = temp;
    }
    public String getNumer()
    {
        return numer;
    }
    public LocalDate getDataWystawienia()
    {
        return dataWystawienia;
    }
    public int getTerminPlatnosciDni()
    {
        return terminPlatnosciDni;
    }
    public LocalDate wyswietlTerminPlatnosci()
    {
        LocalDate temp = this.dataWystawienia.plusDays(this.terminPlatnosciDni);
        return temp;
    }
    void dodajPozycje(Pozycja p)
    {
        this.pozycje.add(p);
    }
    void usuńPozycje(int numer)
    {
        this.pozycje.remove(numer);
    }
    void usuńPozycje(Pozycja p)
    {
        this.pozycje.remove(p);
    }
    public double getWartosc()
    {
        double wartosc = 0;
        for(int i=0; i<pozycje.size(); i++)
        {
            wartosc = wartosc + pozycje.get(i).getWartosc();
        }
        return wartosc;
    }
    public void wypiszFakture()
    {
        System.out.println(this.toString());
        Pozycja temp;
        double wartosc = 0;
        for(int i=0; i<pozycje.size(); i++)
        {
            temp = pozycje.get(i);
            wartosc = wartosc + temp.getWartosc();
            System.out.println("Nazwa: " + temp.nazwa + " cena bazowa: " + temp.cenaJednostkowa + " stawka VAT: " + temp.stawkaVat + " ilosc: " + temp.ilosc + " wartosc koncowa: " + temp.getWartosc());
        }
        System.out.println("Wartosc calosciowa: " + wartosc);
    }
    public String toString(){return ("Faktura o numerze " + this.numer + " wystawiona dnia" + this.dataWystawienia + ", termin platnosci: " + this.wyswietlTerminPlatnosci());}
}

public class Main {

    public static void main(String[] args) {
        Pozycja pz1 = new Pozycja("Woda", 1, 4, 2);
        Pozycja pz2 = new Pozycja("Ryz", 4, 4, 3);
        Pozycja pz3 = new Pozycja("Chleb", 2, 3, 2);
        Pozycja pz4 = new Pozycja("Cebula", 3, 4, 1);
        Pozycja pz5 = new Pozycja("Energetyki", 5, 5, 4);
        Faktura fk1 = new Faktura("2345", LocalDate.of(2012, 01, 01), 35);
        Faktura fk2 = new Faktura("1244", LocalDate.of(2013, 02, 12), 22);
        fk1.dodajPozycje(pz1);
        fk1.dodajPozycje(pz2);
        fk1.dodajPozycje(pz3);
        fk2.dodajPozycje(pz4);
        fk2.dodajPozycje(pz5);
        fk1.wypiszFakture();
        System.out.println();
        fk2.wypiszFakture();
        fk2.usuńPozycje(pz5);
        System.out.println("Po zmianach:");
        fk2.wypiszFakture();
    }
}
