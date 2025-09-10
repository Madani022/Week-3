package week3.Perulangan;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("Pilih jenis kendaraan:");
            System.out.println("1. Motor");
            System.out.println("2. Mobil");
            System.out.print("Masukkan pilihan (1/2): ");
            pilihan = scanner.nextInt();
            if (pilihan < 1 || pilihan > 2) {
                System.out.println("Nilai harus antara 1 sampai 2.");
            }
        } while (pilihan < 1 || pilihan > 2);

        int hari;
        do {
            System.out.print("Masukkan jumlah hari masuk (1-7): ");
            hari = scanner.nextInt();
            if (hari < 1 || hari > 7) {
                System.out.println("Nilai harus antara 1 sampai 7.");
            }
        } while (hari < 1 || hari > 7);

        int tarif = (pilihan == 1) ? 2000 : 5000;
        int total = 0;
        for (int i = 1; i <= hari; i++) {
            total += tarif;
        }

        System.out.println("Total biaya parkir selama " + hari + " hari: Rp." + total);
        scanner.close();
    }
}