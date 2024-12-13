import java.util.Date;

public class Jadwal {
    private Date waktuBerangkat;
    private Date waktuTiba;
    private Kendaraan kendaraan;
    private Rute rute;

    public Jadwal(Date waktuBerangkat, Date waktuTiba, Kendaraan kendaraan, Rute rute) {
        this.waktuBerangkat = waktuBerangkat;
        this.waktuTiba = waktuTiba;
        this.kendaraan = kendaraan;
        this.rute = rute;
    }

    public void tampilkanJadwal() {
        // Implementasi menampilkan jadwal
    }
}
