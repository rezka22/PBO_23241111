package com.tutorial;

public class persegi extends BangunDatar {
    private float sisi;

    public persegi(float sisi) {
        this.sisi = sisi;
    }

    //Overriding
    public float luas() {
        return sisi * sisi;
    }

    //Overriding
    public float keliling() {
        return 4 * sisi;
    }
}

    

