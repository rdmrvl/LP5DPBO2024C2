public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private boolean bekerja;

    public Mahasiswa(String nim, String nama, String jenisKelamin, boolean bekerja) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.bekerja = bekerja;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setBekerja(boolean bekerja) {
        this.bekerja = bekerja;
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public boolean isBekerja() {
        return this.bekerja;
    }
}