public class MahasiswaQueue {
     String nim;
    String nama;

    public MahasiswaQueue(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void display() {
        System.out.println("NIM: " + nim + " | Nama: " + nama);
    }
}
