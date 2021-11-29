package pl.imiajd.kalamarski;

class Ososba
{
    private String nazwisko;
    private int rokUrodzenia;
    public Ososba(String nz, int ru)
    {
        this.nazwisko = nz;
        this.rokUrodzenia = ru;
    }

    public String getNazwisko()
    {
        return this.nazwisko;
    }
    public int getRokUrodzenia()
    {
        return this.rokUrodzenia;
    }
}
