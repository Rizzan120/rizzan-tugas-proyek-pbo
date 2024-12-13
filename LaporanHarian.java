import java.util.List;

public class LaporanHarian {
    private int jumlahPenumpangPerRute;
    private double pendapatanHarian;
    private List<Penumpang> daftarPenumpang;

    public LaporanHarian(int jumlahPenumpangPerRute, double pendapatanHarian, List<Penumpang> daftarPenumpang) {
        this.jumlahPenumpangPerRute = jumlahPenumpangPerRute;
        this.pendapatanHarian = pendapatanHarian;
        this.daftarPenumpang = daftarPenumpang;
    }

    public void tampilkanLaporan() {
        // Implementasi menampilkan laporan harian
    }
}
