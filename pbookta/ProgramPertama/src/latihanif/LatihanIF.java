
package latihanif;


public class LatihanIF {
  public static void main(String[] args)
  {
      int pensil=15000;
      int buku=45000;
      int pulpen=20000;
      int penghapus=30000;
      int harga=pensil + (buku*2) + (pulpen*3) + penghapus - 5000;
      if(harga>100000)
      {
          int diskon = harga * 10 / 100;
          int total = harga - diskon;
          {System.out.println(total);}
      }
      else
      {
          int diskon = harga * 5 / 100;
          int total = harga - diskon;
          {System.out.println(total);}
      }
  }
}
