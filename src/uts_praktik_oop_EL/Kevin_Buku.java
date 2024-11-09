package uts_praktik_oop_EL;

public class Kevin_Buku extends Kevin_Publikasi {
    private String penerbit;
    private int jumlahHalaman;

    public Kevin_Buku(String judul, String penulis, int tahunTerbit, String kategori, String penerbit, int jumlahHalaman) {
        super(judul, penulis, tahunTerbit, kategori);
        this.penerbit = penerbit;
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public String toString() {
        return "judul: " + getJudul() + " | penulis: " + getPenulis() + " | tahunTerbit: " + getTahunTerbit() + " | kategori: " + getKategori() + " | penerbit: " + penerbit + " | jumlahHalaman: " + jumlahHalaman;
    }
}
