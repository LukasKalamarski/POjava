package pl.imiajd.kalamarski.Student;

import java.time.LocalDate;

public class Fortepian extends Instrument
{
    private String dzw;
    public Fortepian(String pr, LocalDate rw, String dz)
    {
        super(pr, rw);
        this.dzw = dz;
    }
}