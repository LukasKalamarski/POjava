package pl.imiajd.kalamarski;

class Nauczyciel extends Ososba
{
    private int pensja;
    public Nauczyciel(String nazwisko, int rokUrodzenia, int ps)
    {
        super(nazwisko, rokUrodzenia);
        this.pensja = ps;
    }
    public int getPensja()
    {
        return this.pensja;
    }
}
