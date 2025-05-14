public class QueueLinkedList {
    NodeQueue front, rear;
    int size;

    public QueueLinkedList() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(MahasiswaQueue data) {
        NodeQueue newNode = new NodeQueue(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa " + data.nim + " telah mendaftar.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Mahasiswa " + front.data.nim + " dipanggil.");
            front = front.next;
            size--;
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void displayFront() {
        if (!isEmpty()) {
            System.out.print("Mahasiswa terdepan: ");
            front.data.display();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void displayRear() {
        if (!isEmpty()) {
            System.out.print("Mahasiswa terakhir: ");
            rear.data.display();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void displayAll() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            NodeQueue temp = front;
            System.out.println("Daftar Mahasiswa yang Mengantre:");
            while (temp != null) {
                temp.data.display();
                temp = temp.next;
            }
        }
    }

    public void displaySize() {
        System.out.println("Jumlah mahasiswa yang mengantre: " + size);
    }
} 