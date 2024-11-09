package uts_praktik_oop_EL;

public class Kevin_Order {
    private Kevin_Publikasi namaPublikasi;
    private String namaPeminjam;
    private String tanggalMulai;
    private String tanggalSelesai;
    private String status;

    public Kevin_Order(Kevin_Publikasi namaPublikasi, String namaPeminjam, String tanggalMulai, String tanggalSelesai, String status) {
        this.namaPublikasi = namaPublikasi;
        this.namaPeminjam = namaPeminjam;
        this.tanggalMulai = tanggalMulai;
        this.tanggalSelesai = tanggalSelesai;
        this.status = status;
    }

    public Kevin_Publikasi getNamaPublikasi() {
        return namaPublikasi;
    }

    public void setNamaPublikasi(Kevin_Publikasi namaPublikasi) {
        this.namaPublikasi = namaPublikasi;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public String getTanggalMulai() {
        return tanggalMulai;
    }

    public void setTanggalMulai(String tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }

    public String getTanggalSelesai() {
        return tanggalSelesai;
    }

    public void setTanggalSelesai(String tanggalSelesai) {
        this.tanggalSelesai = tanggalSelesai;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
