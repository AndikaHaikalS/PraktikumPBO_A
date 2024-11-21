package com.library;

import com.library.model.Book;
import com.library.model.Member;
import com.library.service.LibraryService;
import java.util.Scanner;

public class Main {    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();
        Scanner scanner = new Scanner(System.in);

        // Tambahkan beberapa buku dan anggota contoh
        libraryService.addBook(new Book("Pemrograman Java", "Andi", "ISBN001"));
        libraryService.addBook(new Book("Struktur Data", "Budi", "ISBN002"));
        libraryService.addBook(new Book("Basis Data", "Cici", "ISBN003"));
        libraryService.registerMember(new Member("Dewi", "MEM001"));
        libraryService.registerMember(new Member("Eka", "MEM002"));

        int mainChoice;
        do {
            // Menu utama
            System.out.println("\nSelamat datang di Sistem Manajemen Perpustakaan");
            System.out.println("Pilih jenis pengguna:");
            System.out.println("1. Member");
            System.out.println("2. Petugas Perpustakaan");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            
            // Validasi input utama
            while (!scanner.hasNextInt()) {
                System.out.print("Masukkan angka valid: ");
                scanner.next();
            }
            mainChoice = scanner.nextInt();
            scanner.nextLine(); // Bersihkan buffer
            
            switch (mainChoice) {
                case 1 -> memberMenu(libraryService, scanner);
                case 2 -> librarianMenu(libraryService, scanner);
                case 3 -> System.out.println("Terima kasih telah menggunakan sistem ini.");
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (mainChoice != 3);
    }

    // Menu untuk Member
    private static void memberMenu(LibraryService libraryService, Scanner scanner) {
        int choice;
        do {
            System.out.println("\n=== Menu Member ===");
            System.out.println("1. Daftar Buku yang Tersedia");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Kembalikan Buku");
            System.out.println("4. Cek Denda");
            System.out.println("5. Bayar Denda");
            System.out.println("6. Keluar ke Menu Utama");
            System.out.print("Pilih opsi: ");
            
            // Validasi input
            while (!scanner.hasNextInt()) {
                System.out.print("Masukkan angka valid: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Bersihkan buffer
            
            switch (choice) {
                case 1 -> libraryService.listAvailableBooks();
                case 2 -> {
                    System.out.print("Masukkan ID anggota: ");
                    String borrowerId = scanner.nextLine();
                    System.out.print("Masukkan ISBN buku: ");
                    String borrowIsbn = scanner.nextLine();
                    libraryService.borrowBook(borrowerId, borrowIsbn);
                }
                case 3 -> {
                    System.out.print("Masukkan ID anggota: ");
                    String returnerId = scanner.nextLine();
                    System.out.print("Masukkan ISBN buku: ");
                    String returnIsbn = scanner.nextLine();
                    libraryService.returnBook(returnerId, returnIsbn);
                }
                case 4 -> {
                    System.out.print("Masukkan ID anggota: ");
                    String fineMemberId = scanner.nextLine();
                    Member fineMember = libraryService.findMember(fineMemberId);
                    if (fineMember != null) {
                        System.out.println("Total denda: Rp" + fineMember.getFine());
                    } else {
                        System.out.println("Anggota tidak ditemukan.");
                    }
                }
                case 5 -> {
                    System.out.print("Masukkan ID anggota: ");
                    String payMemberId = scanner.nextLine();
                    Member payMember = libraryService.findMember(payMemberId);
                    if (payMember != null) {
                        System.out.print("Masukkan jumlah pembayaran: Rp");
                        double amount = scanner.nextDouble();
                        scanner.nextLine(); // Bersihkan buffer
                        payMember.payFine(amount);
                    } else {
                        System.out.println("Anggota tidak ditemukan.");
                    }
                }
                case 6 -> System.out.println("Kembali ke menu utama...");
                default -> System.out.println("Opsi tidak valid.");
            }
        } while (choice != 6);
    }

    // Menu untuk Petugas Perpustakaan
    private static void librarianMenu(LibraryService libraryService, Scanner scanner) {
        int choice;
        do {
            System.out.println("\n=== Menu Petugas Perpustakaan ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Daftarkan Anggota");
            System.out.println("4. Daftar Buku yang Tersedia");
            System.out.println("5. Daftar Buku yang Dipinjam");
            System.out.println("6. Daftar Anggota");
            System.out.println("7. Keluar ke Menu Utama");
            System.out.print("Pilih opsi: ");
            
            // Validasi input
            while (!scanner.hasNextInt()) {
                System.out.print("Masukkan angka valid: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Bersihkan buffer
            
            switch (choice) {
                case 1 -> {
                    System.out.print("Masukkan judul buku: ");
                    String title = scanner.nextLine();
                    System.out.print("Masukkan penulis: ");
                    String author = scanner.nextLine();
                    System.out.print("Masukkan ISBN: ");
                    String isbn = scanner.nextLine();
                    libraryService.addBook(new Book(title, author, isbn));
                }
                case 2 -> {
                    System.out.print("Masukkan ISBN buku yang akan dihapus: ");
                    String removeIsbn = scanner.nextLine();
                    libraryService.removeBook(removeIsbn);
                }
                case 3 -> {
                    System.out.print("Masukkan nama anggota: ");
                    String memberName = scanner.nextLine();
                    System.out.print("Masukkan ID anggota: ");
                    String memberId = scanner.nextLine();
                    libraryService.registerMember(new Member(memberName, memberId));
                }
                case 4 -> libraryService.listAvailableBooks();
                case 5 -> libraryService.listBorrowedBooks();
                case 6 -> libraryService.listMembers();
                case 7 -> System.out.println("Kembali ke menu utama...");
                default -> System.out.println("Opsi tidak valid.");
            }
        } while (choice != 7);
    }
}
