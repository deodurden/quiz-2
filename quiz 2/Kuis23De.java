

import java.util.Scanner;

public class Kuis23De{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int porsi;
        int total = 0;
        int jumlahTransaksi = 0;

        System.out.print("Jumlah porsi (0 = selesai): ");
        porsi = sc.nextInt();
        jumlahTransaksi++;

        for (int i = 1;i<=porsi;i++) {
            
            // Harga: porsi pertama Rp 15000, porsi berikutnya Rp 12000 per porsi
                int biaya = 15000 + (porsi - 1) * 12000;
                total = 0;
                total += biaya;
                System.out.println("Biaya: Rp " + biaya);

                System.out.println("Jumlah porsi (0 = selesai): ");
            }
        }

        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah transaksi : " + jumlahTransaksi);
        System.out.println("Total pemasukan  : Rp " + total);
    }
}
