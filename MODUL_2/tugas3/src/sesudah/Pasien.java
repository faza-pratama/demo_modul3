package sesudah;

public class Pasien extends Manusia {
    private final DataPasien dataFisik;

    public Pasien(String nama, DataPasien dataFisik) {
        super(nama);
        this.dataFisik = dataFisik;
    }

    public DataPasien getDataFisik() {
        return dataFisik;
    }
}