# Pseudocode - Sistem Data Mahasiswa (Singly Linked List)

Dokumen ini berisi rancangan pseudocode untuk operasi-operasi utama pada struktur data **Singly Linked List** data mahasiswa dengan bahasa Indonesia.

---

### A. Main Program (Menu Interaktif)

```text
MULAI
    BUAT objek daftarMahasiswa
    pilihan = 0
    
    SELAMA pilihan != 5 DO
        TAMPILKAN "=== APLIKASI PENGELOLAAN DATA MAHASISWA ==="
        TAMPILKAN "1. Tambah Mahasiswa (Insert)"
        TAMPILKAN "2. Cari Mahasiswa (Search)"
        TAMPILKAN "3. Hapus Mahasiswa (Delete)"
        TAMPILKAN "4. Tampilkan Daftar (Traversal)"
        TAMPILKAN "5. Keluar"
        INPUT pilihan

        JIKA pilihan == 1 MAKA
            INPUT nim, nama, ipk
            PANGGIL daftarMahasiswa.insert(nim, nama, ipk)
        SELAIN JIKA pilihan == 2 MAKA
            INPUT targetNim
            PANGGIL daftarMahasiswa.search(targetNim)
        SELAIN JIKA pilihan == 3 MAKA
            INPUT targetNim
            PANGGIL daftarMahasiswa.delete(targetNim)
        SELAIN JIKA pilihan == 4 MAKA
            PANGGIL daftarMahasiswa.traversal()
        SELAIN JIKA pilihan == 5 MAKA
            TAMPILKAN "Program selesai"
        SELAIN
            TAMPILKAN "Pilihan tidak valid"
        AKHIR JIKA
    AKHIR SELAMA
SELESAI
```

---

### B. Insert (Tambah Mahasiswa)

```text
MULAI (nim, nama, ipk)
    JIKA nim kosong ATAU nama kosong ATAU ipk < 0.0 ATAU ipk > 4.0 MAKA
        TAMPILKAN "Input tidak valid"
        SELESAI
    AKHIR JIKA

    current = head
    SELAMA current tidak NULL DO
        JIKA current.nim sama dengan nim MAKA
            TAMPILKAN "NIM sudah terdaftar"
            SELESAI
        AKHIR JIKA
        current = current.next
    AKHIR SELAMA

    BUAT nodeBaru(nim, nama, ipk)
    nodeBaru.next = head
    head = nodeBaru
    TAMPILKAN "Berhasil ditambahkan"
SELESAI
```

---

### C. Search (Cari Mahasiswa)

```text
MULAI (targetNim)
    current = head
    SELAMA current tidak NULL DO
        JIKA current.nim sama dengan targetNim MAKA
            TAMPILKAN current.nim, current.nama, current.ipk
            KEMBALIKAN current
        AKHIR JIKA
        current = current.next
    AKHIR SELAMA
    
    TAMPILKAN "Mahasiswa tidak ditemukan"
    KEMBALIKAN NULL
SELESAI
```

---

### D. Delete (Hapus Mahasiswa)

```text
MULAI (targetNim)
    JIKA head == NULL MAKA
        TAMPILKAN "Daftar kosong"
        KEMBALIKAN FALSE
    AKHIR JIKA

    JIKA head.nim sama dengan targetNim MAKA
        head = head.next
        TAMPILKAN "Berhasil dihapus"
        KEMBALIKAN TRUE
    AKHIR JIKA

    current = head
    previous = NULL

    SELAMA current tidak NULL DAN current.nim tidak sama dengan targetNim DO
        previous = current
        current = current.next
    AKHIR SELAMA

    JIKA current == NULL MAKA
        TAMPILKAN "NIM tidak ditemukan"
        KEMBALIKAN FALSE
    SELAIN ITU
        previous.next = current.next
        TAMPILKAN "Berhasil dihapus"
        KEMBALIKAN TRUE
    AKHIR JIKA
SELESAI
```

---

### E. Traversal (Tampilkan Seluruh Mahasiswa)

```text
MULAI
    JIKA head == NULL MAKA
        TAMPILKAN "Daftar mahasiswa kosong"
        SELESAI
    AKHIR JIKA

    current = head
    no = 1
    SELAMA current tidak NULL DO
        TAMPILKAN no, current.nim, current.nama, current.ipk
        current = current.next
        no = no + 1
    AKHIR SELAMA
SELESAI
```
