class Mahasiswa {
    String nama;
    String NIM;
    String Prodi;
    int umur;
    Double IPK;
}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       
        Mahasiswa mhs_1 = new Mahasiswa();
        mhs_1.nama = "Rezka";
        mhs_1.NIM = "23241111";
        mhs_1.Prodi = "Pendidikan Teknologi Informasi";
        mhs_1.umur = 20;
        mhs_1.IPK = 4.0;

        System.out.println("Nama : " + mhs_1.nama);
        System.out.println("NIM :  " + mhs_1.NIM);
        System.out.println("Prodi : " + mhs_1.Prodi);
        System.out.println("Umur " + mhs_1.umur);
        System.out.println("IPK : " + mhs_1.IPK);
    }
}