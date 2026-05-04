public class StackTugasMahasiswa15 {
    Mahasiswa15[] stack;
    int top;
    int size;

    public StackTugasMahasiswa15(int size) {
        this.size = size;
        stack = new Mahasiswa15[size];
        top = -1; // Indeks awal pointer top
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa15 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa15 pop() {
        if (!isEmpty()) {
            Mahasiswa15 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa15 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        // Menampilkan data dari yang paling atas (terbaru)[cite: 1]
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    // Method Percobaan 2: Konversi Desimal ke Biner[cite: 1]
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi15 stackKonv = new StackKonversi15();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stackKonv.push(sisa);
            nilai = nilai / 2;
        }
        
        String biner = "";
        while (!stackKonv.isEmpty()) {
            biner += stackKonv.pop();
        }
        return biner.isEmpty() ? "0" : biner;
    }
}