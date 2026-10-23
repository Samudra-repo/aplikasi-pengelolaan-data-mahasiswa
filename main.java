// Nama : Ashabudinar Panji Samudra
// NIM : 25520001
// Prodi : Informatika

// File: Main.java
import java.util.Scanner;

// Node untuk menyimpan data Mahasiswa
class Node {
    String nim;
    String nama;
    double ipk;
    Node next;

    public Node(String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.next = null;
    }
}

// Class Singly Linked List untuk Data Mahasiswa
class DaftarMahasiswa {
    private Node head;

    public DaftarMahasiswa() {
        this.head = null;
    }

    // A. Insert (Tambah Mahasiswa - Tambah di Awal)
    public void insert(String nim, String nama, double ipk) {
        if (nim == null || nim.trim().isEmpty() || nama == null || nama.trim().isEmpty() || ipk < 0.0 || ipk > 4.0) {
            System.out.println("[ERROR] Input data tidak valid! IPK harus di antara 0.0 - 4.0.");
            return;
        }

        Node current = head;
        while (current != null) {
            if (current.nim.equalsIgnoreCase(nim)) {
                System.out.println("[ERROR] NIM '" + nim + "' sudah terdaftar (duplikat)!");
                return;
            }
            current = current.next;
        }

        Node nodeBaru = new Node(nim, nama, ipk);
        nodeBaru.next = head;
        head = nodeBaru;
        System.out.println("[BERHASIL] Mahasiswa '" + nama + " (" + nim + ")' berhasil ditambahkan.");
    }

    // B. Search (Cari Mahasiswa berdasarkan NIM)
    public Node search(String nim) {
        Node current = head;
        while (current != null) {
            if (current.nim.equalsIgnoreCase(nim)) {
                System.out.println("[DITEMUKAN] NIM: " + current.nim + " | Nama: " + current.nama + " | IPK: " + current.ipk);
                return current;
            }
            current = current.next;
        }
        System.out.println("[TIDAK DITEMUKAN] Mahasiswa dengan NIM '" + nim + "' tidak ditemukan.");
        return null;
    }

    // C. Delete (Hapus Mahasiswa berdasarkan NIM)
    public boolean delete(String nim) {
        if (head == null) {
            System.out.println("[GAGAL] Daftar mahasiswa kosong!");
            return false;
        }

        if (head.nim.equalsIgnoreCase(nim)) {
            System.out.println("[HAPUS] Mahasiswa '" + head.nama + " (" + head.nim + ")' berhasil dihapus.");
            head = head.next;
            return true;
        }

        Node current = head;
        Node previous = null;

        while (current != null && !current.nim.equalsIgnoreCase(nim)) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("[GAGAL] NIM '" + nim + "' tidak ditemukan untuk dihapus.");
            return false;
        }

        previous.next = current.next;
        System.out.println("[HAPUS] Mahasiswa '" + current.nama + " (" + current.nim + ")' berhasil dihapus.");
        return true;
    }

    // D. Traversal (Tampilkan Seluruh Data Mahasiswa)
    public void traversal() {
        if (head == null) {
            System.out.println("--- DAFTAR MAHASISWA KOSONG ---");
            return;
        }

        System.out.println("\n========================================");
        System.out.println("          DAFTAR NILAI MAHASISWA        ");
        System.out.println("========================================");
        Node current = head;
        int no = 1;
        while (current != null) {
            System.out.println(no + ". NIM  : " + current.nim);
            System.out.println("   Nama : " + current.nama);
            System.out.println("   IPK  : " + current.ipk);
            System.out.println("----------------------------------------");
            current = current.next;
            no++;
        }
    }
}

// Class Utama dengan Menu Interaktif
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DaftarMahasiswa mhsList = new DaftarMahasiswa();
        int pilihan = 0;

        do {
            System.out.println("\n=== APLIKASI PENGELOLAAN DATA MAHASISWA ===");
            System.out.println("1. Tambah Mahasiswa (Insert)");
            System.out.println("2. Cari Mahasiswa (Search)");
            System.out.println("3. Hapus Mahasiswa (Delete)");
            System.out.println("4. Tampilkan Daftar (Traversal)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Membersihkan newline buffer

                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan NIM  : ");
                        String nim = scanner.nextLine();
                        System.out.print("Masukkan Nama : ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan IPK  : ");
                        if (scanner.hasNextDouble()) {
                            double ipk = scanner.nextDouble();
                            scanner.nextLine(); // Membersihkan newline
                            mhsList.insert(nim, nama, ipk);
                        } else {
                            System.out.println("[ERROR] IPK harus berupa angka!");
                            scanner.nextLine(); // Clear invalid input
                        }
                        break;

                    case 2:
                        System.out.print("Masukkan NIM yang dicari: ");
                        String cariNim = scanner.nextLine();
                        mhsList.search(cariNim);
                        break;

                    case 3:
                        System.out.print("Masukkan NIM yang ingin dihapus: ");
                        String hapusNim = scanner.nextLine();
                        mhsList.delete(hapusNim);
                        break;

                    case 4:
                        mhsList.traversal();
                        break;

                    case 5:
                        System.out.println("Terima kasih telah menggunakan program ini!");
                        break;

                    default:
                        System.out.println("[ERROR] Pilihan tidak valid. Silakan pilih 1-5.");
                }
            } else {
                System.out.println("[ERROR] Masukkan angka pilihan menu yang valid!");
                scanner.next(); // Clear invalid token
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
