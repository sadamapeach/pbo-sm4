/**
* Nama File     : Pegawai.java
* Tanggal       : 10 Mei 2023
* Penulis       : Oktaviana Sadama Nur Azizah
* NIM           : 24060121130060
* Deskripsi     : Class pegawai yang mengimplementasikan nama dan gaji pokok pegawai
**/

public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}