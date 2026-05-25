package Pertemuan12;

public class SingleLinkedList15 {
    NodeMahasiswa15 head;
    NodeMahasiswa15 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa15 tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa15 input) {
        NodeMahasiswa15 ndInput = new NodeMahasiswa15(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa15 input) {
        NodeMahasiswa15 ndInput = new NodeMahasiswa15(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa15 input) {
        NodeMahasiswa15 ndInput = new NodeMahasiswa15(input, null);
        NodeMahasiswa15 temp = head;
        if (isEmpty()) {
            return;
        }
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa15 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa15 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                }
            }
            if (temp != null) {
                temp.next = new NodeMahasiswa15(input, temp.next);
                if (temp.next.next == null) {
                    tail = temp.next;
                }
            }
        }
    }
}