/**
* Nama File     : Programmer.java
* Tanggal       : 10 Mei 2023
* Penulis       : Oktaviana Sadama Nur Azizah
* NIM           : 24060121130060
* Deskripsi     : Class programmer yang meng-inherit class pegawai
**/

public class Programmer extends Pegawai {
    protected int bonus = 450000;
    
    public Programmer(String nama) {
        this.nama = nama;
    }
    
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}