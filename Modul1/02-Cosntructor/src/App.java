import java.util.Scanner;

class Mahasiswa {
    public String nama;
    public String nim;
    public String prodi;
    public int umur;
    public double ipk;

    public Mahasiswa(String nama, String nim, String prodi, int umur, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.umur = umur;
        this.ipk = ipk;
    }
}

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan Prodi: ");
        String prodi = scanner.nextLine();

        System.out.print("Masukkan Umur: ");
        int umur = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Masukkan IPK: ");
        double ipk = scanner.nextDouble();
        scanner.nextLine(); 

        Mahasiswa mhs_1 = new Mahasiswa(nama, nim, prodi, umur, ipk);

        System.out.println("Nama : " + mhs_1.nama);
        System.out.println("NIM : " + mhs_1.nim);
        System.out.println("Prodi : " + mhs_1.prodi);
        System.out.println("Umur : " + mhs_1.umur);
        System.out.println("IPK : " + mhs_1.ipk);
    }
}