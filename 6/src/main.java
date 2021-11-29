import pl.imiajd.kalamarski.Adres;
import pl.imiajd.kalamarski.BetterRectengle;
import pl.imiajd.kalamarski.Student;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {


        Adres ad = new Adres("ulica", "20", "12", "miasto", "12-345");
        ad.pokaz();
        System.out.println(ad.przed("16-123"));
        Student st = new Student("Nazwisko", 1999, "Informatyka");
        BetterRectengle br = new BetterRectengle(0, 0, 3, 2);
        System.out.println(br.getArea());
        System.out.println(br.getParimeter());

    }
}
