package sebelum;

import java.util.Scanner;

public class KalkulatorIMT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String n = input.nextLine();

        System.out.print("Masukkan Berat Badan (kg): ");
        double bb = input.nextDouble();

        System.out.print("Masukkan Tinggi Badan (cm): ");
        double tb = input.nextDouble();

        // Konversi tinggi dari cm ke meter
        double tinggiMeter = tb / 100;

        // Menghitung IMT
        double imt = bb / (tinggiMeter * tinggiMeter);

        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Nama: " + n);
        System.out.printf("IMT Anda adalah: %.2f\n", imt);

        // Menentukan kategori IMT
        String kategori;
        if (imt < 18.5) {
            kategori = "Berat badan kurang";
        } else if (imt >= 18.5 && imt < 25) {
            kategori = "Berat badan normal";
        } else if (imt >= 25 && imt < 30) {
            kategori = "Berat badan berlebih";
        } else {
            kategori = "Obesitas";
        }
        System.out.println("Kategori: " + kategori);

        input.close();
    }
}