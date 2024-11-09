package uts_praktik_oop_EL;

import java.util.*;

public class Kevin_Main {
    public static void main(String[] args) {
    	Kevin_Buku buku1 = new Kevin_Buku("Java Programming", "John Doe", 2020, "Programming", "TechBooks", 400);
        Kevin_Buku buku2 = new Kevin_Buku("Machine Learning in Education", "Jane Smith", 2021, "Education", "EduPublish", 350);
        Scanner scanner = new Scanner(System.in);
        
        List<Kevin_Buku> listBuku = new ArrayList<>();
        listBuku.add(buku1);
        listBuku.add(buku2);
        
        Kevin_Artikel artikel1 = new Kevin_Artikel("Advancement in Artificial Intelligence", "Alice Jhonson", 2022, "Artificial Intelligence", "Ceria University", 8, 3);
        Kevin_Artikel artikel2 = new Kevin_Artikel("Impact of Big Data Analysis in Healthcare", "Bob White", 2023, "Healthcare", "Health Tech Institute", 12, 5);
        
        List<Kevin_Artikel> listArtikel = new ArrayList<>();
        listArtikel.add(artikel1);
        listArtikel.add(artikel2);
        
        List<Kevin_Order> listOrder = new ArrayList<>();
        
        System.out.println("==================================");
        System.out.println("    Welcome to Ceria Library");
        System.out.println("==================================");

        int choice;
        do {
            System.out.println("1. Lihat Publikasi");
            System.out.println("2. Tambah Publikasi");
            System.out.println("3. Lakukan Order");
            System.out.println("4. Kelola Order");
            System.out.println("5. Exit Program");
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayPublications(listBuku, listArtikel);
                    break;
                case 2:
                    addPublication(listBuku, listArtikel, scanner);
                    break;
                case 3:
                    makeOrder(listBuku, listArtikel, listOrder, scanner);
                    break;
                case 4:
                    manageOrders(listOrder, scanner);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan layanan Ceria Library.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan pilihan yang benar.");
            }
        } while (choice != 5);
    }

    private static void displayPublications(List<Kevin_Buku> listBuku, List<Kevin_Artikel> listArtikel) {
        System.out.println("==================================");
        System.out.println("Daftar Buku");
        System.out.println("==================================");
        for (int i = 0; i < listBuku.size(); i++) {
            System.out.println((i + 1) + ". " + listBuku.get(i));
        }

        System.out.println("==================================");
        System.out.println("Daftar Artikel");
        System.out.println("==================================");
        for (int i = 0; i < listArtikel.size(); i++) {
            System.out.println((i + 1) + ". " + listArtikel.get(i));
        }

        System.out.println("Press any key to continue . . .");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    private static void addPublication(List<Kevin_Buku> listBuku, List<Kevin_Artikel> listArtikel, Scanner scanner) {
        System.out.println("==================================");
        System.out.println("        Tambah Publikasi");
        System.out.println("==================================");
        System.out.println("Pilih jenis publikasi (1: Buku, 2: Artikel): ");
        int pubType = scanner.nextInt();
        scanner.nextLine();

        switch (pubType) {
            case 1:
                System.out.println("==================================");
                System.out.println("           Tambah Buku");
                System.out.println("==================================");
                System.out.print("Judul: ");
                String judulBuku = scanner.nextLine();
                System.out.print("Penulis: ");
                String penulisBuku = scanner.nextLine();
                System.out.print("Tahun Terbit: ");
                int tahunTerbitBuku = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Kategori: ");
                String kategoriBuku = scanner.nextLine();
                System.out.print("Penerbit: ");
                String penerbitBuku = scanner.nextLine();
                System.out.print("Jumlah Halaman: ");
                int jumlahHalamanBuku = scanner.nextInt();
                scanner.nextLine();
                Kevin_Buku buku = new Kevin_Buku(judulBuku, penulisBuku, tahunTerbitBuku, kategoriBuku, penerbitBuku, jumlahHalamanBuku);
                listBuku.add(buku);
                System.out.println("Buku Berhasil ditambahkan");
                break;
            case 2:
                System.out.println("==================================");
                System.out.println("          Tambah Artikel");
                System.out.println("==================================");
                System.out.print("Judul: ");
                String judulArtikel = scanner.nextLine();
                System.out.print("Penulis: ");
                String penulisArtikel = scanner.nextLine();
                System.out.print("Tahun Terbit: ");
                int tahunTerbitArtikel = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Kategori: ");
                String kategoriArtikel = scanner.nextLine();
                System.out.print("Universitas: ");
                String universitasArtikel = scanner.nextLine();
                System.out.print("Halaman: ");
                int halamanArtikel = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Volume: ");
                int volumeArtikel = scanner.nextInt();
                scanner.nextLine();
                Kevin_Artikel artikel = new Kevin_Artikel(judulArtikel, penulisArtikel, tahunTerbitArtikel, kategoriArtikel, universitasArtikel, halamanArtikel, volumeArtikel);
                listArtikel.add(artikel);
                System.out.println("Artikel berhasil ditambahkan.");
                break;
            default:
                System.out.println("Input yang dimasukkan salah !");
        }
    }

    private static void makeOrder(List<Kevin_Buku> listBuku, List<Kevin_Artikel> listArtikel, List<Kevin_Order> listOrder, Scanner scanner) {
        System.out.println("==================================");
        System.out.println("         Order Publikasi");
        System.out.println("==================================");
        System.out.println("Pilih jenis publikasi yang ingin dipinjam (1: Buku, 2: Artikel): ");
        int pubType = scanner.nextInt();
        scanner.nextLine();

        switch (pubType) {
            case 1:
                System.out.println("==================================");
                System.out.println("           Order Buku             ");
                System.out.println("==================================");
                System.out.println("Daftar Buku");
                for (int i = 0; i < listBuku.size(); i++) {
                    System.out.println((i + 1) + ". " + listBuku.get(i));
                }
                System.out.print("Masukkan nomor buku yang ingin anda pinjam (Masukkan 0 untuk batal): ");
                int bookChoice = scanner.nextInt();
                scanner.nextLine();
                if (bookChoice > 0 && bookChoice <= listBuku.size()) {
                    Kevin_Buku chosenBook = listBuku.get(bookChoice - 1);
                    System.out.print("Masukkan nama peminjam: ");
                    String peminjamBuku = scanner.nextLine();
                    System.out.print("Masukkan tanggal selesai peminjaman (YYYYMMDD): ");
                    String tanggalSelesaiBuku = scanner.nextLine();
                    Kevin_Order orderBuku = new Kevin_Order(chosenBook, peminjamBuku, getCurrentDate(), tanggalSelesaiBuku, "Ongoing");
                    listOrder.add(orderBuku);
                    System.out.println("Order berhasil dibuat untuk buku \"" + chosenBook.getJudul() + "\".");
                } else {
                    System.out.println("Input tidak valid atau order dibatalkan.");
                }
                break;
            case 2:
                System.out.println("==================================");
                System.out.println("         Order Artikel");
                System.out.println("==================================");
                System.out.println("Daftar Artikel");
                for (int i = 0; i < listArtikel.size(); i++) {
                    System.out.println((i + 1) + ". " + listArtikel.get(i));
                }
                System.out.print("Masukkan nomor artikel yang ingin anda pinjam (Masukkan 0 untuk batal): ");
                int articleChoice = scanner.nextInt();
                scanner.nextLine();
                if (articleChoice > 0 && articleChoice <= listArtikel.size()) {
                    Kevin_Artikel chosenArticle = listArtikel.get(articleChoice - 1);
                    System.out.print("Masukkan nama peminjam: ");
                    String peminjamArtikel = scanner.nextLine();
                    System.out.print("Masukkan tanggal selesai peminjaman (YYYYMMDD): ");
                    String tanggalSelesaiArtikel = scanner.nextLine();
                    Kevin_Order orderArtikel = new Kevin_Order(chosenArticle, peminjamArtikel, getCurrentDate(), tanggalSelesaiArtikel, "Ongoing");
                    listOrder.add(orderArtikel);
                    System.out.println("Order berhasil dibuat untuk artikel \"" + chosenArticle.getJudul() + "\".");
                } else {
                    System.out.println("Input tidak valid atau order dibatalkan.");
                }
                break;
            default:
                System.out.println("Input yang dimasukkan salah !");
        }
    }

    private static String getCurrentDate() {
        return java.time.LocalDate.now().toString().replace("-", "");
    }


    private static void manageOrders(List<Kevin_Order> listOrder, Scanner scanner) {
        System.out.println("==================================");
        System.out.println("           List Order");
        System.out.println("==================================");
        for (int i = 0; i < listOrder.size(); i++) {
            Kevin_Order order = listOrder.get(i);
            System.out.println("OID" + (i + 1));
            System.out.println("Judul: " + order.getNamaPublikasi().getJudul());
            System.out.println("Peminjam: " + order.getNamaPeminjam());
            System.out.println("Tanggal Selesai: " + order.getTanggalSelesai());
            System.out.println("Status: " + order.getStatus());
            System.out.println("--------------------------------------------------------");
        }

        System.out.println("Pilih order yang ingin diubah status peminjamannya: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        Kevin_Order order = listOrder.get(choice - 1);

        System.out.println("Ubah Status:");
        System.out.println("1. Ongoing");
        System.out.println("2. Returned");
        System.out.println("3. Due");
        System.out.print("Pilihan: ");
        int statusChoice = scanner.nextInt();
        scanner.nextLine(); 

        switch (statusChoice) {
            case 1:
                order.setStatus("Ongoing");
                break;
            case 2:
                order.setStatus("Returned");
                break;
            case 3:
                order.setStatus("Due");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        System.out.println("Status Berhasil Diubah !");
    }
}