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

| No. | Pengujian | Hasil yang diharapkan | Hasil aktual |
| :---: | :--- | :--- | :--- |
| 1 | Menambah 25520001 (Ashabudinar Panji Samudra, IPK: 4.00) | Mahasiswa berhasil ditambahkan | [BERHASIL] Mahasiswa 'Ashabudinar Panji Samudra (25520001)' berhasil ditambahkan. |
| 2 | Mencari 25520001 | Data ditemukan | [DITEMUKAN] NIM: 25520001 \| Nama: Ashabudinar Panji Samudra \| IPK: 4.0 |
| 3 | Menampilkan Daftar (Traversal) | Menampilkan seluruh daftar mahasiswa | Menampilkan daftar dengan NIM: 25520001, Nama: Ashabudinar Panji Samudra, IPK: 4.0 |
| 4 | Menghapus 25520001 | Mahasiswa berhasil dihapus | [HAPUS] Mahasiswa 'Ashabudinar Panji Samudra (25520001)' berhasil dihapus. |

## 4. Kesimpulan

1. Program Sistem Pengelolaan Data Mahasiswa berbasis Singly Linked List telah berhasil dibuat dan seluruh fungsi (Insert, Search, Delete, Traversal, serta Exit) berjalan dengan tepat sesuai hasil pengujian aktual.
2. Penggunaan Singly Linked List terbukti sangat fleksibel dalam mengalokasikan memori dinamis O(n) secara efisien tanpa pembatasan ukuran awal seperti pada Array statis.
3. Struktur data dan penanganan kondisi batas berjalan stabil tanpa terjadinya kesalahan runtime (NullPointerException).
