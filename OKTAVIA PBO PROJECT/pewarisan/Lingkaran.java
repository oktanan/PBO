
package pewarisan;
public class Lingkaran extends BangunDatar{
    private double r;
    public Lingkaran()
    {
        super();
        System.out.println("mencetak Class Anak\n");
        r = 10;
        nama = "ini lingkaran";//nama(variable)
    }
    public double Luas()
    {
        return 3.14 * r * r;
    }
    public void infoLingkaran()// method prosedur
    {
        System.out.println ("Nama : " + nama);
        System.out.println ("Nilai r : " + this.r);
        System.out.println ("Luas Lingkaran :" + Luas());
    }
}
