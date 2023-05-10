/**
* Nama File     : Manajer.java
* Tanggal       : 10 Mei 2023
* Penulis       : Oktaviana Sadama Nur Azizah
* NIM           : 24060121130060
* Deskripsi     : Class manajer yang meng-inherit class pegawai
**/

public class Manajer extends Pegawai {
    protected int tunjangan = 700000;
    
    public Manajer(String nama) {
        this.nama = nama;
    }
    
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan :" + tunjangan);
    }
    
}