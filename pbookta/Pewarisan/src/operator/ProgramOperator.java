package operator;
import java.util.Scanner;

public class ProgramOperator {
    public static void main(String[] args)
  {
      int nilai1, nilai2, nilai3;
      
      Scanner key = new Scanner (System.in);
      System.out.println("Masukkan Nilai 1 : ");
      nilai1 = key.nextInt();
      System.out.println("Masukkan Nilai 2 : ");
      nilai2 = key.nextInt();
      System.out.println("masukkan Nilai 3 : ");
      nilai3 = key.nextInt();
      
      System.out.println("Nilai 1 = " +nilai1);
      System.out.println("Nilai 2 = " +nilai2);
      System.out.println("Nilai 3 = " +nilai3);
      
      //OPERATOR NILAI
      int tambah = nilai1 + nilai2;
      int kali = nilai2 * nilai3;
      
      //OUTPUT NILAI
      System.out.println("Nilai 1 + Nilai 2 = " +tambah);
      System.out.println("Nilai 2 * Nilai 3 = " +kali);
      
      if(nilai1 > nilai2 && nilai2 > nilai1)
      { System.out.println("Nilai 1 lebih besar dari nilai 2");}
      if(nilai1 > nilai3 && nilai2 > nilai3)
      { System.out.println("Nilai 1 lebih besar dari nilai 3");}
      if(nilai2 > nilai1 && nilai1 > nilai3)
      { System.out.println("Nilai 2 lebih besar dari nilai dan 3");}
      else 
      { System.out.println("Nilai 2 lebih besar dari nilai 1 dan 3");}
  }
}
