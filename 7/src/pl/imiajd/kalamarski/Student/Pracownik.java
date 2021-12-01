package pl.imiajd.kalamarski.Student;

import java.time.LocalDate;

public class Pracownik extends Osoba
{
    public Pracownik(String nazwisko, double pobory,  String[] im, java.time.LocalDate du, boolean pl, LocalDate dz)
    {
        super(nazwisko, im, du, pl);
        this.pobory = pobory;
        this.dataZatrudnienia = dz;
    }

    public double getPobory()
    {
        return pobory;
    }

    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }
    public LocalDate dataZatrudnienia;
    private double pobory;
}