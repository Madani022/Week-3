package week3.input;
import java.util.Scanner;

public class Hitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        System.out.print("Pilih Operasi: 1. Tambah 2. Kurang 3. Kali 4. Bagi: ");
        int operasi = scanner.nextInt();

        pilihOperasi(operasi, angka1, angka2);

        scanner.close();
    }

    static void pilihOperasi(int operasi, int angka1, int angka2) {
        switch (operasi) {
            case 1:
                System.out.println("Hasil: " + (angka1 + angka2));
                break;
            case 2:
                System.out.println("Hasil: " + (angka1 - angka2));
                break;
            case 3:
                System.out.println("Hasil: " + (angka1 * angka2));
                break;
            case 4:
                if (angka2 != 0) {
                    System.out.println("Hasil: " + ((double) angka1 / angka2));
                } else {
                    System.out.println("Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            default:
                System.out.println("Operasi tidak valid");
                break;
        }
    }
}