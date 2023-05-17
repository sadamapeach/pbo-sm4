/**
* Nama File     : Lingkaran.java
* Tanggal       : 17 Mei 2023
* Penulis       : Oktaviana Sadama Nur Azizah
* NIM           : 24060121130060
* Deskripsi     : Implementasi lingkaran sebagai BangunDatar 
**/

public class Lingkaran extends BangunDatar {
    private double jejari;
    
    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }
    public double hitungKeliling() {
        return 2 * jejari * 3.14;
    }
}