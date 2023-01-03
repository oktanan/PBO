
package switchcase;
import java.util.Scanner;
public class ProgramSwitch{ 
    public static void main(String args[])
    {
        int nilai;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai : ");
        nilai = input.nextInt();
        switch(nilai)
        {
            case 1 : { System.out.println("Nilainya 1");
                       break;}
            case 2 : { System.out.println("Nilainya 2");
                       break;}
            case 3 : { System.out.println("Nilainya 3");
                       break;}
            default : { System.out.println("Tidak ada nilai");}
        }
    }
    }