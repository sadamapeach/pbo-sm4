/**
* Nama File	: BangunDatar.java 
* Tanggal	: 26 Maret 2023
* Penulis	: Oktaviana Sadama Nur Azizah
* NIM		: 24060121130060
* Deskripsi	: Kelas abstrak, berisi abstraksi bangun datar
**/

public abstract class BangunDatar {
	protected double luas;
	
	public abstract double hitungLuas(double sisi);
	
	public void setLuas(double luas) {
		this.luas = luas;
	}
	
	public double getLuas() {
		return luas;
	}
}