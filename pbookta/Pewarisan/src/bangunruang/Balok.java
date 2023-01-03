package bangunruang;

public class Balok extends BangunRuang{
     private double p,l,t;
    public Balok()
    {
        super();
        System.out.println("mencetak Class Balok\n");
        p = 10;
        l = 5;
        t = 9;
        nama = "ini Balok";//nama(variable)
    }
    public double Volume()
    {
        return p * l * t;
    }
    public void infoBalok()// method prosedur
    {
        System.out.println ("Nama : " + nama);
        System.out.println ("Nilai p : " + this.p);
        System.out.println ("Nilai l : " + this.l);
        System.out.println ("Nilai t : " + this.t);
        System.out.println ("Volume Balok :" + Volume());
    }
}
