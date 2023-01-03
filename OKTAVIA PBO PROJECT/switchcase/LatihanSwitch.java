
package switchcase;
import java.util.Scanner;
public class LatihanSwitch{
        public static void main(String args[])
    {
            int nasgor,steak,miayam,batagor,harga;
            nasgor = 12000;
            steak = 15000;
            miayam = 7000;
            batagor = 8000;
            Scanner input = new Scanner(System.in);
            System.out.println("Masukan No Pesanan Anda : ");
            harga = input.nextInt();
            switch(harga){
            case 1 : { System.out.println("Makanan yang anda pilih adalah nasi goreng dengan harga" + nasgor);
                       break;}
            case 2 : { System.out.println("Makanan yang anda pilih adalah nasi goreng dengan harga" + steak);
                       break;}
            case 3 : { System.out.println("Makanan yang anda pilih adalah nasi goreng dengan harga" + mieayam);
                       break;}
            case 4 : { System.out.println("Makanan yang anda pilih adalah nasi goreng dengan harga" + batagor);
                       break;}
            default : { System.out.println("Tidak ada dalam menu");}
            }
        if (harga==1){
        System.out.println("Masukkan Jumlah: ");
        int jumlah = input.nextInt();
        System.out.println("Total Harga = " + nasgor * jumlah);
        }
        if (harga==2){
        System.out.println("Masukkan Jumlah: ");
        int jumlah = input.nextInt();
        System.out.println("Total Harga = " + steak * jumlah);
        }
        if (harga==3){
        System.out.println("Masukkan Jumlah: ");
        int jumlah = input.nextInt();
        System.out.println("Total Harga = " + mieyam * jumlah);
        }
        if (harga==4){
        System.out.println("Masukkan Jumlah: ");
        int jumlah = input.nextInt();
        System.out.println("Total Harga = " + batagor * jumlah);
        }
    }
    
}
