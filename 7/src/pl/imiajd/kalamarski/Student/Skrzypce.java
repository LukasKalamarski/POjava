package pl.imiajd.kalamarski.Student;

import java.time.LocalDate;

public class Skrzypce extends Instrument
{
    public String dzw;
    public Skrzypce(String pr, LocalDate rw, String dz)
    {
        super(pr, rw);
        this.dzw = dz;
    }
}
