import java.util.Scanner;
public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList queue = new QueueLinkedList();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Antrian Terdepan");
            System.out.println("4. Tampilkan Antrian Terakhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Tampilkan Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    queue.enqueue(new MahasiswaQueue(nim, nama));
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.displayFront();
                    break;
                case 4:
                    queue.displayRear();
                    break;
                case 5:
                    queue.displayAll();
                    break;
                case 6:
                    queue.displaySize();
                    break;
                case 7:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    System.out.println("Terima Kasih:v");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 0);
        sc.close();
    }
}