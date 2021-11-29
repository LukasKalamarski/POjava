package pl.imiajd.kalamarski;

public class Student extends Ososba
{
    private String kierunek;
    public Student(String nazwisko, int rokUrodzenia, String ki)
    {
        super(nazwisko, rokUrodzenia);
        this.kierunek = ki;
    }
    public String getKierunek()
    {
        return kierunek;
    }
}