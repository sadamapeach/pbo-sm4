/**
* Nama File	: StokException.java 
* Tanggal	: 07 April 2023
* Penulis	: Oktaviana Sadama Nur Azizah
* NIM		: 24060121130060
* Deskripsi	: Stok eksepsi, menolak jumlah barang yang melebihi stok
**/

public class StokException extends Exception {
    public StokException(Barang barang) {
		super("Stok "+barang.getNama()+" ("+barang.getId()+") tidak cukup!");
    }
}

