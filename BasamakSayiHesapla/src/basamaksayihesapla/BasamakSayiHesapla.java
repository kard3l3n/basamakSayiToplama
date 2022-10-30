package basamaksayihesapla;
import java.util.Scanner;
import java.math.*;

public class BasamakSayiHesapla {
    public static void main(String[] args) {
        int sayi,numberCounter=0;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("sayi giriniz:");
        sayi=input.nextInt();
        
        int adet = 0,toplam=0;
 
        while(sayi != 0)
        {
           toplam=(sayi%10)+toplam;
           sayi /= 10;
            ++adet;
        }
 
        System.out.println("Basamak Toplamı: " + toplam);
        
    }
    
}
