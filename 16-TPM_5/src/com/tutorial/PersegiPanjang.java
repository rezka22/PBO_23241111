package com.tutorial;

public class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    //Overriding
    public float luas() {
        return panjang * lebar;
    }

    //Overriding
    public float keliling() {
        return 2 * (panjang + lebar);
    }
}

    

