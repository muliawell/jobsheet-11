public class SLLMain19 {
    public static void main(String[] args) {
        SingleLinkedList19 sll = new SingleLinkedList19();

        Mahasiswa19 mhs1 = new Mahasiswa19("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa19 mhs2 = new Mahasiswa19("23212201", "Bimon", "2B", 3.8);
        Mahasiswa19 mhs3 = new Mahasiswa19("22212202", "Cintia", "3C", 3.5);
        Mahasiswa19 mhs4 = new Mahasiswa19("21212203", "Dirga", "4D", 3.6);

        sll.print(); // masih kosong
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("Data pada indeks ke-2: ");
        sll.get(2).tampilInformasi();

        System.out.println("Indeks dari 'Bimon': " + sll.indexOf("Bimon"));

        System.out.println("Menghapus elemen pertama:");
        sll.removeFirst();
        sll.print();

        System.out.println("Menghapus elemen terakhir:");
        sll.removeLast();
        sll.print();

        System.out.println("Menghapus 'Cintia':");
        sll.remove("Cintia");
        sll.print();

        System.out.println("Menghapus data pada indeks ke-0:");
        sll.removeAt(0);
        sll.print();
    }
}
