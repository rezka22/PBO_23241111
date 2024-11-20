class player { 
    // data member atau variabel
    String nama; // default, bisa diakses daari luar class
    public int exp;
    private int health; // private

    // konstruktor
    player(String nama, int exp, int health){
        this.nama = nama;
        this.exp = exp;
        this.health = health;
    }

    // metehod, harus default
    void cetak(){
        kuranginexp();
        System.out.println("player : " + this.nama);
        System.out.println("player : " + this.exp);
        System.out.println("player : " + this.health);
    }
    // method menulis, public
    public void ubahhealth(int value){
        this.health = value;
    }
    // method, private
    private void kuranginexp(){
        this.exp -= 10; // exp =exp -10
    }

}



public class App {
    public static void main(String[] args) throws Exception {
        // instansiasi objek
        player player1 = new player("saitama", 50, 100);

        // default
        // membaca
        System.out.println(player1.nama);
        // menulis
        player1.nama = "conan";
        // membaca
        System.out.println(player1.nama);

        // public
        //membaca
        System.out.println(player1.exp);
        // menulis
        player1.exp = 75;
        // membaca 
        System.out.println(player1.exp);

        // // private
        // System.out.println(player1.health);
        // // menulis
        // player1.health = 125;
        // // membaca
        // System.out.println(player1.health);

        // method default
        // membaca private
        player1.cetak();

        // method public menulis 
        player1.ubahhealth(125);
        player1.cetak();

        // method private
        player1.cetak();
    }
}
