# Sistem Pengelolaan Data Mahasiswa (Singly Linked List)
Nama : Ashabudinar Panji Samudra
NIM : 25520001
Prodi : Informatika

Program Sistem Pengelolaan Data Mahasiswa merupakan aplikasi berbasis konsol (Command Line Interface / CLI) yang dibangun menggunakan bahasa pemrograman Java dan struktur data Singly Linked List. Program ini dirancang untuk mengelola entitas data mahasiswa (NIM, Nama, dan IPK) secara interaktif.

---

## Fitur Utama

1. Insert Data (Tambah Mahasiswa): Menambahkan data mahasiswa baru ke awal linked list dengan validasi input dan pencegahan NIM duplikat.
2. Search Data (Cari Mahasiswa): Mencari informasi mahasiswa berdasarkan NIM.
3. Delete Data (Hapus Mahasiswa): Menghapus data mahasiswa dari linked list berdasarkan NIM.
4. Traversal Data (Tampilkan Daftar): Menampilkan seluruh daftar mahasiswa yang tersimpan secara terurut.
5. Menu Interaktif Console: Berbasis `Scanner` untuk kemudahan navigasi Pengguna.

---

## Struktur Berkas Proyek

- `main.java`: Kode sumber Java yang berisi implementasi Node, LinkedList, dan Menu CLI Interaktif.
- `pseudocode.md`: Dokumentasi algoritma dalam bentuk pseudocode.
- `analisis-kompleksitas.md`: Dokumentasi analisis kompleksitas waktu (Big-O) dan ruang.

---

## Tujuan Program
1. Mempermudah Pengelolaan Data: Menyediakan sarana pengelolaan data akademik mahasiswa yang efisien, terstruktur, dan interaktif melalui antarmuka CLI.
2. Implementasi Konsep Struktur Data Dinamis: Menerapkan secara nyata konsep dasar Singly Linked List, pengalokasian memori dinamis, serta manipulasi pointer/referensi node pada bahasa pemrograman Java.
3. Penerapan Penanganan Kasus Batas (Edge Cases): Memastikan keandalan program dalam menangani kondisi ekstrem seperti operasi pada senarai kosong (empty list), data duplikat, maupun penghapusan pada elemen ujung (head dan tail).
4. Analisis Efisiensi Algoritma: Menguji performa waktu (Time Complexity) dan ruang (Space Complexity) dari setiap operasi algoritma menggunakan notasi Big-O.

---

## Alasan Memilih Singly Linked List
Singly Linked List dipilih sebagai struktur data utama pada program ini berdasarkan beberapa pertimbangan teknis:

1. Alokasi Memori Dinamis (Dynamic Memory Allocation):
Ukuran memori dialokasikan secara real-time saat node baru ditambahkan. Hal ini berbeda dengan Array statis yang memerlukan pendeklarasian batas ukuran awal (fixed size) yang dapat menyebabkan pemborosan memori (memory waste) jika terisi sedikit, atau overflow jika data melebihi kapasitas.

2. Efisiensi Operasi Penambahan (Insert First):
Operasi penambahan node di awal senarai (head) memiliki kompleksitas waktu 
O(1) karena hanya memerlukan pergeseran penunjukan pointer tanpa harus menggeser elemen-elemen lain seperti pada Array.

3. Kemudahan Manipulasi Pointer:
Penghapusan elemen hanya dilakukan dengan memutus dan menyambungkan kembali penunjukan referensi next dari node sebelumnya (previous.next = current.next), sehingga lebih bersih dan tidak meninggalkan celah kosong (gap) di memori.

4. Kesederhanaan Struktur:
Setiap node hanya menyimpan data dan satu penunjuk referensi (next), menjadikannya lebih hemat penggunaan memori dibandingkan Doubly Linked List yang memerlukan dua pointer per node (prev dan next).

---

## Cara Menjalankan Program

### Prasyarat
Pastikan Anda telah menginstal **Java Development Kit (JDK)** versi 8 atau yang lebih baru.

### Langkah-langkah:
1. Kompilasi program Java:
   ```bash
   javac main.java
   ```
2. Jalankan program:
   ```bash
   java main
   ```
3. Ikuti petunjuk menu interaktif di layar terminal/konsol.

---

## Kesimpulan
1. Keberhasilan Implementasi:
Program Sistem Pengelolaan Data Mahasiswa berbasis Singly Linked List dengan bahasa Java telah berhasil dibuat dan berjalan dengan baik sesuai rancangan pseudocode dan skenario pengujian interaktif.

2. Keandalan Penanganan Kasus Batas:
Program terbukti andal dalam menangani berbagai skenario pengujian, baik kasus normal (populated list) maupun kasus batas (empty list, penghapusan head/tail, serta pencegahan NIM duplikat) tanpa memicu terjadinya crash (NullPointerException).

3. Efisiensi Memori & Algoritma:
Singly Linked List memberikan fleksibilitas tinggi dalam penggunaan memori secara dinamis dengan kompleksitas ruang 
O(n). Meskipun operasi pencarian dan penghapusan memerlukan kompleksitas waktu 
O(n) pada worst-case, struktur ini sangat ideal dan efisien untuk aplikasi skala kecil hingga menengah yang membutuhkan ukuran data fleksibel.





