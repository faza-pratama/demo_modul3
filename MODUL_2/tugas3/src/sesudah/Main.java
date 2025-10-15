package sesudah;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KalkulatorIMT kalkulator = new KalkulatorIMT();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Berat Badan (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan Tinggi Badan (cm): ");
        double tinggi = input.nextDouble();

        DataPasien dataPasien = new DataPasien(berat, tinggi);
        Pasien pasien = new Pasien(nama, dataPasien);

        double hasilImt = kalkulator.hitung(pasien.getDataFisik());
        String kategoriImt = kalkulator.tentukanKategori(hasilImt);

        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Nama: " + pasien.getNama());
        System.out.printf("IMT Anda adalah: %.2f\n", hasilImt);
        System.out.println("Kategori: " + kategoriImt);

        input.close();
    }
}