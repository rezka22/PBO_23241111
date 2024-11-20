class data{
    // data member atau variabel instant
    public int intpublic;
    private int intprivate;
    private double doubleprivate;

    // konstruktor, modifier public
    public data(){
        this.intpublic = 0;
        this.intprivate = 100;
    }
    // method untuk membaca / getter
    public int getintprivate(){
        return this.intprivate;
    }

    // method untuk menulis / setter
    public void setdoubleprivte(double value){
        this.doubleprivate = value;
    }

    // method untuk membaca semua variabel
    void cetak(){
        System.out.println("public : " + this.intpublic);
        System.out.println("public : " + this.intprivate);
        System.out.println("public : " + this.doubleprivate);

    }
}



public class App {
    public static void main(String[] args) throws Exception {
        // instansiasi objek
        data data1 = new data();

        // membaca dan menulis menggunkan public
        data1.intpublic = 5; // proses membaca
        // menulis
        System.out.println("public : " + data1.intpublic);

        // membaca menggunakan getter
        int angka = data1.getintprivate();
        System.out.println("private : " + angka);

        // menulis menggunakan setter
        data1.setdoubleprivte(1.35);

    }
}
