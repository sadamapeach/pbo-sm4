/**
* Nama File     : BangunDatarGeneric.java
* Tanggal       : 17 Mei 2023
* Penulis       : Oktaviana Sadama Nur Azizah
* NIM           : 24060121130060
* Deskripsi     : Kelas kontruksi generic untuk BagunDatar
**/

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;
    
    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }
    
    public T get() {
        return bangunDatar;
    }
    
    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}