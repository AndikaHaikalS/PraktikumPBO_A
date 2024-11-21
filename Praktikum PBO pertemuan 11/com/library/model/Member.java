package com.library.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Member extends Person {
    private List<Book> borrowedBooks;
    private double fine;

    // Konstruktor
    public Member(String name, String id) {
        super(name, id);
        this.borrowedBooks = new ArrayList<>();
        this.fine = 0.0;
    }

    // Metode untuk meminjam buku
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.setBorrowed(true);
        book.setBorrowDate(LocalDate.now());
        System.out.println("Buku '" + book.getTitle() + "' berhasil dipinjam.");
    }

    // Metode untuk mengembalikan buku
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setBorrowed(false);

            // Cek keterlambatan pengembalian
            if (LocalDate.now().isAfter(book.getDueDate())) {
                long daysLate = java.time.temporal.ChronoUnit.DAYS.between(book.getDueDate(), LocalDate.now());
                double lateFine = daysLate * 5000; // Misalnya denda Rp5.000 per hari
                addFine(lateFine);
                System.out.println("Anda terlambat " + daysLate + " hari. Denda: Rp" + lateFine);
            } else {
                System.out.println("Buku '" + book.getTitle() + "' berhasil dikembalikan tepat waktu.");
            }
        } else {
            System.out.println("Buku '" + book.getTitle() + "' tidak ditemukan dalam daftar pinjaman Anda.");
        }
    }

    // Getter untuk daftar buku yang dipinjam
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Getter untuk denda
    public double getFine() {
        return fine;
    }

    // Menambahkan denda
    public void addFine(double amount) {
        this.fine += amount;
    }

    // Membayar denda
    public void payFine(double amount) {
        if (amount <= fine) {
            fine -= amount;
            System.out.println("Denda sebesar Rp" + amount + " telah dibayar.");
        } else {
            System.out.println("Jumlah pembayaran melebihi total denda yang ada.");
        }
    }
}
