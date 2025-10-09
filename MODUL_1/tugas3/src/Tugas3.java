import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan nilai ujian akhir: ");
        int nilai = input.nextInt();

        String status;
        if (nilai >= 60) {
            status = "Lulus";
        } else {
            status = "Tidak Lulus";
        }

        System.out.println("Mahasiswa " + nama + " dinyatakan: " + status);

        input.close();
    }

}

// {nilai ≥ 0 ∧ nilai ≤ 100} C {status = "Lulus" ↔ nilai ≥ 60}
// P (Precondition):
// Kondisi awal atau prasyarat yang harus dipenuhi sebelum program dijalankan.
// Dalam hal ini, nilai ujian yang dimasukkan harus berada dalam rentang 0 sampai 100 (0 ≤ nilai ≤ 100).

// C (Command):
// Program atau perintah yang dieksekusi.
// Program membaca input nama dan nilai ujian akhir mahasiswa, mengevaluasi nilai tersebut, kemudian menentukan status kelulusan berdasarkan syarat nilai (apakah ≥ 60 atau tidak).

// Q (Postcondition):
// Kondisi yang harus terpenuhi setelah program dijalankan.
// Program akan memberikan output berupa status kelulusan:

// Jika nilai ≥ 60, maka status = "Lulus"

// Jika nilai < 60, maka status"TidakLulus"

//informal
//Parameter: nama (sebuah string yang merupakan nama mahasiswa) dan nilai (sebuah bilangan real positif yang merupakan nilai ujian akhir).
//
//Returns: Status kelulusan mahasiswa ("Lulus" jika nilai >= 60 atau "Tidak Lulus" jika nilai < 60) yang ditampilkan bersama nama mahasiswa.