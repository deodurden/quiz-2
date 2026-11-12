

import java.util.Scanner;

public class Kuis23De{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int total = 0;
        int jumlahTransaksi = 0;

        for(int j = 1; j<=10;j++){
            int porsi;

        
            System.out.print("Jumlah porsi (0 = selesai): ");
        
            porsi = sc.nextInt();
            while(porsi<0||porsi>10){
                
                System.out.println("ulangi");
                porsi = sc.nextInt();
                
            }
        
    
            jumlahTransaksi++;

            for (int i = 1;i<=porsi;i++) {
            
            // Harga: porsi pertama Rp 15000, porsi berikutnya Rp 12000 per porsi
                    int biaya = 15000 + (porsi - 1) * 12000;
                    total = 0;
                    total += biaya;
                    System.out.println("Biaya: Rp " + biaya);
                    
                    
                
            }
            

            
        }
        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah transaksi : " + jumlahTransaksi);
        System.out.println("Total pemasukan  : Rp " + total);   
    }
}
