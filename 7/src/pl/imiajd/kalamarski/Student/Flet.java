package pl.imiajd.kalamarski.Student;

import java.time.LocalDate;

public class Flet extends Instrument
{
    public String dzw;
    public Flet(String pr, LocalDate rw, String dz)
    {
        super(pr, rw);
        this.dzw = dz;
    }
}