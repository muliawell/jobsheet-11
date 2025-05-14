public class Mahasiswa19 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa19(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    public void tampilInformasi(){
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk + "\t");
    }
    

}