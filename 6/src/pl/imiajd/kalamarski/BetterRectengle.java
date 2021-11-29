package pl.imiajd.kalamarski;

import java.awt.*;

public class BetterRectengle extends Rectangle
{
    private Rectangle rw;
    public BetterRectengle(int x, int y, int w, int h)
    {
        this.rw = new Rectangle();
        this.rw.setLocation(x, y);
        this.rw.setSize(w, h);
    }
    public int getParimeter()
    {
        return 2*this.rw.width + 2*this.rw.height;
    }
    public int getArea()
    {
        return this.rw.width * this.rw.height;
    }
}