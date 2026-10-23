# Analisis Kompleksitas Algoritma (Big-O Notation)

Dokumen ini berisi analisis kompleksitas waktu (*Time Complexity*) dan kompleksitas ruang (*Space Complexity*) untuk operasi-operasi Singly Linked List pada pengelolaan Data Mahasiswa.

---

## Tabel Ringkasan Kompleksitas

| Operasi Algoritma | Time Complexity (Waktu) | Space Complexity (Ruang) | Keterangan |
| :--- | :---: | :---: | :--- |
| **Insert (Tambah)** | $\mathcal{O}(n)$ | $\mathcal{O}(1)$ | Memerlukan validasi duplikasi NIM sebesar $\mathcal{O}(n)$, penambahan di `head` sebesar $\mathcal{O}(1)$. |
| **Search (Cari)** | $\mathcal{O}(n)$ | $\mathcal{O}(1)$ | Melakukan iterasi linear dari `head` sampai menemukan NIM target atau `null`. |
| **Delete (Hapus)** | $\mathcal{O}(n)$ | $\mathcal{O}(1)$ | Mencari letak node target terlebih dahulu lalu memutus dan menyambung pointer. |
| **Traversal (Tampilkan)** | $\mathcal{O}(n)$ | $\mathcal{O}(1)$ | Mengunjungi seluruh $n$ node tepat satu kali untuk mencetak data. |

---

## Detail Analisis Kasus (Case Analysis)

### 1. Insert (Tambah Data Mahasiswa)
* **Best Case — $\mathcal{O}(1)$:** Terjadi saat linked list masih dalam kondisi kosong (`head == null`), sehingga pengecekan duplikat langsung selesai.
* **Worst Case — $\mathcal{O}(n)$:** Program harus mengecek seluruh $n$ node untuk memastikan NIM tidak duplikat sebelum menyisipkan node baru di `head`.

### 2. Search (Cari Data Mahasiswa)
* **Best Case — $\mathcal{O}(1)$:** Data mahasiswa yang dicari berada di elemen pertama (`head`).
* **Worst Case — $\mathcal{O}(n)$:** Data berada di posisi paling akhir (*tail*) atau NIM yang dicari tidak ada dalam daftar.

### 3. Delete (Hapus Data Mahasiswa)
* **Best Case — $\mathcal{O}(1)$:** Node yang akan dihapus berada di `head`.
* **Worst Case — $\mathcal{O}(n)$:** Node yang akan dihapus berada di elemen paling akhir (*tail*) atau tidak ditemukan.

### 4. Space Complexity Total
* **$\mathcal{O}(n)$:** Penggunaan alokasi memori dinamis bertambah seiring bertambahnya jumlah node $n$ mahasiswa di dalam linked list.
