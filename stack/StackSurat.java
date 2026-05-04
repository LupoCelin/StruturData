import java.util.Stack;

public class StackSurat {
    Stack<Surat15> stack = new Stack<>();

    // Menu 1: Terima Surat Izin (Push)
    public void push(Surat15 data) {
        stack.push(data);
        System.out.println("Surat berhasil diterima.");
    }

    // Menu 2: Proses Surat Izin (Pop)
    public void pop() {
        if (!stack.isEmpty()) {
            Surat15 out = stack.pop();
            System.out.println("Memproses surat dari: " + out.namaMahasiswa);
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
        }
    }

    // Menu 3: Lihat Surat Izin Terakhir (Peek)
    public void peek() {
        if (!stack.isEmpty()) {
            Surat15 top = stack.peek();
            System.out.println("Surat Teratas:");
            System.out.println("ID: " + top.idSurat + " | Nama: " + top.namaMahasiswa + 
                               " | Jenis: " + top.jenisIzin + " | Durasi: " + top.durasi + " hari");
        } else {
            System.out.println("Stack kosong.");
        }
    }

    // Menu 4: Cari Surat berdasarkan nama
    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (Surat15 s : stack) {
            if (s.namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan! ID: " + s.idSurat + " atas nama " + s.namaMahasiswa);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}