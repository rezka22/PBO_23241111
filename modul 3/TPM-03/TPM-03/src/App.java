class hitung_gaji_bersih{
    private int gaji_pokok;
    private int tunjangan;
    private double pajak;

    // setter
    public void setgajipokok(int gaji_pokok){
        this.gaji_pokok = gaji_pokok;
    }
    public void settunjangan(int tunjanggan){
        this.tunjangan = tunjangan;
    }
    public void setpajak(double pajak){
        this.pajak = pajak;
    }

    // getter
    public int getGajiPokok() {
        return gaji_pokok;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public double getPajak() {
        return pajak;
    }

    // method
    public double hitungGajiBersih() {
        double gajiKotor = gaji_pokok + tunjangan;
        double jumlahPajak = gajiKotor * (pajak / 100);
        return gajiKotor - jumlahPajak;
    }

    public void cetakGajiBersih(){
        System.out.printf("Gaji Bersih Anda adalah sebesar Rp. %.0f%n", hitungGajiBersih());
    }
    

    
    public static void main(String[] args) {
        hitung_gaji_bersih gaji = new hitung_gaji_bersih();

        gaji.setgajipokok(3000000); 
        gaji.settunjangan(500000);  
        gaji.setpajak(10);          
        gaji.cetakGajiBersih();
    
    }
}