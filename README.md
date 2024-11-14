Studi Kasus
Kasus ini biasanya melibatkan beberapa fitur yang umum ada pada mesin ATM, seperti:

1. Cek Saldo:
Menampilkan saldo terkini dari akun pengguna.
2. Tarik Tunai:
Fitur untuk menarik uang dengan memastikan saldo mencukupi dan memenuhi saldo least yang dipersyaratkan.
3. Setor Tunai:
Menambahkan sejumlah uang ke dalam akun pengguna.
4. ubah pin:
Mengganti Stick pengguna dengan verifikasi Stick lama dan input Stick baru dua kali.
5. Keluar:
Mengakhiri sesi penggunaan.

Desain Kelas
Untuk membuat aplikasi ATM, beberapa kelas berikut biasanya diperlukan:

1. Account:
Kelas ini menyimpan informasi akun pengguna, seperti Stick, saldo, dan metode untuk mengubah Stick dan memeriksa saldo.
2. ATM:
Kelas utama yang berfungsi sebagai antarmuka ATM dan mengelola operasi dasar seperti login, navigasi menu, dan pemrosesan transaksi.
3. Transaction:
Kelas induk untuk semua jenis transaksi (misalnya, Withdrawal, Store) yang berisi metode abstrak untuk dieksekusi.
4. Withdrawal dan Deposit:
Kelas yang diturunkan dari Exchange untuk menangani transaksi tarik tunai dan setor tunai.

 
![Screenshot 2024-11-14 153943](https://github.com/user-attachments/assets/28feab6b-ddca-427a-9aa6-da94e9b45746)
