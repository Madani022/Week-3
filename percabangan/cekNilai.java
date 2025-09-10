package week3.percabangan;
import java.util.Scanner;

public class cekNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nilai (0-100): ");
        int angka = scanner.nextInt();

        if (angka < 0 || angka > 100) {
            System.out.println("Nilai harus antara 0 sampai 100.");
        } else {
            // Cek kelulusan
            if (angka >= 60) {
                System.out.println("Lulus");
            } else {
                System.out.println("Tidak Lulus");
            }

            // Cek grade
            String grade;
            if (angka >= 85) {
                grade = "A";
            } else if (angka >= 70) {
                grade = "B";
            } else if (angka >= 60) {
                grade = "C";
            } else if (angka >= 50) {
                grade = "D";
            } else {
                grade = "E";
            }
            System.out.println("Grade: " + grade);
        }

        scanner.close();
    }
}