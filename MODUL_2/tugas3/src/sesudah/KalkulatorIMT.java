package sesudah;

// Menerapkan Rename Variable, Introduce Constant, dan Extract Method
public class KalkulatorIMT implements OperasiKalkulator {
    // 2. Introduce Constant
    private static final double KONVERSI_CM_KE_METER = 100.0;

    // 3. Extract Method (untuk kalkulasi IMT)
    @Override
    public double hitung(DataPasien data) {
        // 1. Rename Variable (dari tb menjadi tinggiBadanCm, dst.)
        double tinggiBadanMeter = data.getTinggiBadanCm() / KONVERSI_CM_KE_METER;
        double beratBadanKg = data.getBeratBadanKg();

        if (tinggiBadanMeter <= 0) {
            return 0;
        }
        return beratBadanKg / (tinggiBadanMeter * tinggiBadanMeter);
    }

    // 3. Extract Method (untuk menentukan kategori)
    @Override
    public String tentukanKategori(double nilaiImt) {
        if (nilaiImt < 18.5) {
            return "Berat badan kurang";
        } else if (nilaiImt < 25) {
            return "Berat badan normal";
        } else if (nilaiImt < 30) {
            return "Berat badan berlebih";
        } else {
            return "Obesitas";
        }
    }
}
