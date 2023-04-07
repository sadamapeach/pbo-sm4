/**
* Nama File	: Barang.java 
* Tanggal	: 07 April 2023
* Penulis	: Oktaviana Sadama Nur Azizah
* NIM		: 24060121130060
* Deskripsi	: Program Barang
**/

public class Barang {
	private String id;
	private String nama;
	private int stok;
	
	public Barang(String id, String nama, int stok) {
		this.id = id;
		this.nama = nama;
		this.stok = stok;
    	}
	
	public String getId() {
		return id;
	}
	
	public String getNama() {
		return nama;
	}
	
	public int getStok() {
		return stok;
	}

    	public void kurangiStok(int jumlah) {
        	stok -= jumlah;
    	}
}
