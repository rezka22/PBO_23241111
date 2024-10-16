class MOTOR{
    String merk;
    int tahun;
    String noPolisi;
    String warna;

    MOTOR(String inputmerk, int inputtahun, String inputnoPolis, String inputwarna){
        merk = inputmerk;
        tahun = inputtahun;
        noPolisi = inputnoPolis;
        warna = inputwarna;

        System.out.println("Merk : " + merk);
        System.out.println("Tahun : " + tahun);
        System.out.println("No Polisi : " + noPolisi);
        System.out.println("Warna : " + warna);
    }
    
}


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        MOTOR mtr_1 = new MOTOR("Honda", 2016, "DR 3274 MA", "Hitam");

    }
}