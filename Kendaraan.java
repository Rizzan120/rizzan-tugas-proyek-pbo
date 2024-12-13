public abstract class Kendaraan {
    private String idKendaraan;
    private String jenis;
    private int kapasitas;
    private boolean statusOperasional;
    private Rute rute;

    public Kendaraan(String idKendaraan, String jenis, int kapasitas, boolean statusOperasional, Rute rute) {
        this.idKendaraan = idKendaraan;
        this.jenis = jenis;
        this.kapasitas = kapasitas;
        this.statusOperasional = statusOperasional;
        this.rute = rute;
    }

    public void operasikan() {
        // Implementasi operasikan kendaraan
    }

    public void berhenti() {
        // Implementasi berhenti kendaraan
    }
}
