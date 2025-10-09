import java.util.ArrayList;
import java.util.List;

public class Codelab1 {
    public static void main(String[] args) {
        String[] nama = {"Adi", "Budi", "Cahyo", "Diana", "Eva"};
        List<String> namaTerpanjang = cariNamaTerpanjang(nama);
        System.out.println("Nama terpanjang adalah: " + namaTerpanjang);
    }

    public static  List<String> cariNamaTerpanjang(String[] array) {
        int panjangMax = 0;
        for (String nama : array) {
            if (nama.length() > panjangMax) {
                panjangMax = nama.length();
            }
        }

        List<String> hasil = new ArrayList<>();
        for (String nama : array) {
            if (nama.length() == panjangMax) {
                hasil.add(nama);
            }
        }
        return hasil;
    }
}