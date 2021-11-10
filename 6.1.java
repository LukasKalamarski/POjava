import java.util.*;
import java.util.ArrayList;
import java.util.stream.Stream;
import static java.lang.Math.*;

class RachunekBankowy
{
    static double rocznaStopaProcentowa;
    private double saldo;
    RachunekBankowy(double sal)
    {
        saldo = sal;
    }
    public double obliczMiesieczneOdsetki()
    {
        saldo = saldo + (this.saldo * rocznaStopaProcentowa) /12;
        return saldo;
    }
    public void setRocznaStopaProcentowa(double rsp)
    {
        rocznaStopaProcentowa = rsp;
    }
}


public class Start {

    public static void main(String[] args)
    {
        RachunekBankowy saver1 = new RachunekBankowy(2000);
        RachunekBankowy saver2 = new RachunekBankowy(3000);
        saver1.setRocznaStopaProcentowa(0.4);
        System.out.println(saver1.obliczMiesieczneOdsetki());
        saver2.setRocznaStopaProcentowa(0.4);
        System.out.println(saver2.obliczMiesieczneOdsetki());
        saver1.setRocznaStopaProcentowa(0.5);
        System.out.println(saver1.obliczMiesieczneOdsetki());
        saver2.setRocznaStopaProcentowa(0.5);
        System.out.println(saver2.obliczMiesieczneOdsetki());
    }
}
