package sesudah;

// Hasil dari Introduce Parameter Object
public class DataPasien {
    private final double beratBadanKg;
    private final double tinggiBadanCm;

    public DataPasien(double beratBadanKg, double tinggiBadanCm) {
        this.beratBadanKg = beratBadanKg;
        this.tinggiBadanCm = tinggiBadanCm;
    }

    public double getBeratBadanKg() {
        return beratBadanKg;
    }

    public double getTinggiBadanCm() {
        return tinggiBadanCm;
    }
}
