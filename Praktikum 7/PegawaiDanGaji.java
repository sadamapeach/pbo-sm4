/**
* Nama File     : PegawaiDanGaji.java
* Tanggal       : 10 Mei 2023
* Penulis       : Oktaviana Sadama Nur Azizah
* NIM           : 24060121130060
* Deskripsi     : Main class PegawaiDanGaji
**/

public class PegawaiDanGaji {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");
        
        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}