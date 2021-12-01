package pl.imiajd.kalamarski.Student;

import java.time.LocalDate;

public abstract class Osoba
{
    public Osoba(String nazwisko, String[] im, java.time.LocalDate du, boolean pl)
    {
        this.imiona = im;
        this.nazwisko = nazwisko;
        this.plec = pl;
        this.dataUrodzenia = du;
    }

    public abstract String getOpis();

    public String[] getImiona()
    {
        return this.imiona;
    }
    public LocalDate getDataUrodzenia()
    {
        return this.dataUrodzenia;
    }
    public boolean getPlec()
    {
        return this.plec;
    }
    public String getNazwisko()
    {
        return nazwisko;
    }


    private String nazwisko;
    private String[] imiona;
    private java.time.LocalDate dataUrodzenia;
    private boolean plec;
}