package com.tutorial;

public class Main {
    public static void main(String[] args) {
        persegi Persegi = new persegi(7);
        lingkaran Lingkaran = new lingkaran(4);
        PersegiPanjang persegiPanjang = new PersegiPanjang(3, 6);
        Segitiga segitiga = new Segitiga(4, 5);

        System.out.println("Persegi:");
        System.out.println("Luas: " + Persegi.luas());
        System.out.println("Keliling: " + Persegi.keliling());

        System.out.println("\nLingkaran:");
        System.out.println("Luas: " + Lingkaran.luas());
        System.out.println("Keliling: " + Lingkaran.keliling());

        System.out.println("\nPersegi Panjang:");
        System.out.println("Luas: " + persegiPanjang.luas());
        System.out.println("Keliling: " + persegiPanjang.keliling());

        System.out.println("\nSegitiga:");
        System.out.println("Luas: " + segitiga.luas());
        System.out.println("Keliling: " + segitiga.keliling());
    }
}
