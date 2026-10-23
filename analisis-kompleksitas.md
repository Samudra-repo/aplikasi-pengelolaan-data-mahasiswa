# Analisis Kompleksitas Algoritma

## 1. Analisis Waktu

| Operasi | Kompleksitas | Alasan |
| :--- | :--- | :--- |
| Insert di awal | O(1) | Mengubah referensi head tanpa penelusuran |
| Search | O(n) | Memeriksa node satu per satu |
| Delete berdasarkan NIM | O(n) | Mencari node sebelum menghapus |
| Traversal | O(n) | Mengunjungi seluruh node |

Catatan: Pada program ini, pengecekan NIM duplikat sebelum Insert membutuhkan O(n), sehingga keseluruhan proses penambahan melalui menu memiliki kompleksitas O(n).

## 2. Analisis Memori

Linked List menggunakan memori O(n) untuk menyimpan n mahasiswa.

Setiap node menyimpan data mahasiswa serta referensi menuju node berikutnya.

## 3. Pengujian Program

### A. Kasus Normal

| No. | Pengujian | Hasil yang Diharapkan | Hasil Aktual | Status |
| :---: | :--- | :--- | :--- | :---: |
| 1 | Menambah data mahasiswa (NIM: 25520001) | Mahasiswa berhasil ditambahkan | [BERHASIL] Mahasiswa 'Ashabudinar Panji Samudra (25520001)' berhasil ditambahkan. | Lulus |
| 2 | Mencari NIM yang terdaftar (NIM: 25520001) | Data mahasiswa ditemukan dan ditampilkan | [DITEMUKAN] NIM: 25520001 \| Nama: Ashabudinar Panji Samudra \| IPK: 4.0 | Lulus |
| 3 | Menampilkan daftar mahasiswa (Traversal) | Menampilkan seluruh daftar mahasiswa secara terurut | Menampilkan daftar dengan NIM: 25520001, Nama: Ashabudinar Panji Samudra, IPK: 4.0 | Lulus |
| 4 | Menghapus NIM yang terdaftar (NIM: 25520001) | Data mahasiswa berhasil dihapus | [HAPUS] Mahasiswa 'Ashabudinar Panji Samudra (25520001)' berhasil dihapus. | Lulus |
| 5 | Keluar aplikasi (Menu 5) | Program berhenti dan menampilkan pesan terima kasih | Terima kasih telah menggunakan program ini! | Lulus |

### B. Kasus Batas (Edge / Boundary Cases)

| No. | Pengujian | Hasil yang Diharapkan | Hasil Aktual | Status |
| :---: | :--- | :--- | :--- | :---: |
| 1 | Menampilkan daftar saat list kosong | Menampilkan pesan daftar kosong | --- DAFTAR MAHASISWA KOSONG --- | Lulus |
| 2 | Menghapus NIM pada list kosong | Menampilkan pesan kegagalan | [GAGAL] Daftar mahasiswa kosong! | Lulus |
| 3 | Mencari NIM pada list kosong / tidak terdaftar | Menampilkan pesan tidak ditemukan | [TIDAK DITEMUKAN] Mahasiswa dengan NIM '99999999' tidak ditemukan. | Lulus |
| 4 | Menambah NIM yang sudah ada (duplikat) | Mencegah penambahan dan tampil pesan error | [ERROR] NIM '25520001' sudah terdaftar (duplikat)! | Lulus |
| 5 | Menghapus elemen pertama (Head) | Head berpindah ke node berikutnya tanpa error | [HAPUS] Mahasiswa '...' berhasil dihapus. Pointer head berhasil diperbarui. | Lulus |

## 4. Kesimpulan

1. Program Sistem Pengelolaan Data Mahasiswa berbasis Singly Linked List telah berhasil dibuat dan seluruh fungsi (Insert, Search, Delete, Traversal, serta Exit) berjalan dengan tepat baik pada kasus normal maupun kasus batas.
2. Penggunaan Singly Linked List terbukti sangat fleksibel dalam mengalokasikan memori dinamis O(n) secara efisien tanpa pembatasan ukuran awal seperti pada Array statis.
3. Struktur data dan penanganan kondisi batas berjalan teruji stabil tanpa memicu kesalahan runtime (*NullPointerException*).
