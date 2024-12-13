public class Tiket {
    private String idTiket;
    private double harga;
    private Penumpang penumpang;
    private Rute rute;
    private Jadwal jadwal;

    public Tiket(String idTiket, double harga, Penumpang penumpang, Rute rute, Jadwal jadwal) {
        this.idTiket = idTiket;
        this.harga = harga;
        this.penumpang = penumpang;
        this.rute = rute;
        this.jadwal = jadwal;
    }

    public void cetakTiket() {
        // Implementasi mencetak tiket
    }
}
