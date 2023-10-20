class Node {
    int NIM;
    String NAMA;
    Node next, prev;

    public Node(int nim1, String nama2) {
        NIM = nim1;
        NAMA = nama2;
    }
}

public class stack_coba_LL {
    Node head, tail;
    int size = 0;

    public void push(int nim, String nama) {
        Node mahasiswa = new Node(nim, nama);

        if (head == null) {
            head = mahasiswa;
            tail = mahasiswa;
        } else {
            mahasiswa.next = head;
            head.prev = mahasiswa;
            head = mahasiswa;
        }
        size++;
    }

    public Node pop() {
        Node bantu = head;
        if (bantu != null) {
            head = head.next;
            bantu.next = null;
        }
        return bantu;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.NIM + " " + current.NAMA);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        stack_coba_LL A = new stack_coba_LL();
        stack_coba_LL B = new stack_coba_LL();

        A.push(177, "Nune");
        A.push(277, "Restu");
        A.push(377, "Ciko");

        B.push(477, "Licos");
        B.push(577, "Bram");
        B.push(677, "Rafli");

        System.out.println("Daftar Mahasiswa Kelas A : ");
        A.display();

        System.out.println("------------------------");

        System.out.println("Daftar Mahasiswa Kelas B : ");
        B.display();

        Node tampung = new Node(0, " ");
        while (tampung.NIM != 177) {
            tampung = A.pop();
            if (tampung.NIM == 177) {
                B.push(tampung.NIM, tampung.NAMA);
            }
        }

        System.out.println("Daftar Mahasiswa Kelas A : ");
        A.display();

        System.out.println("------------------------");

        System.out.println("Daftar Mahasiswa Kelas B : ");
        B.display();

        // ini comment dibuat untuk cek apa bisa dipush ke github atau tidak.
    }
}