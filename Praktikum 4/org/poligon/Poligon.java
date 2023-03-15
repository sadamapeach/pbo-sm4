/**
* Nama File	: Poligon.java 
* Tanggal	: 15 Maret 2023
* Penulis	: Oktaviana Sadama Nur Azizah
* NIM		: 24060121130060
* Deskripsi	: Representasi dasar dari objek poligon (segi banyak)
**/

package org.poligon;

public class Poligon {
	protected int jumlahSisi;
	
	public Poligon() {
		this.jumlahSisi = 0;
	}
	
	public void setJumlahSisi(int jumlahSisi) {
		this.jumlahSisi = jumlahSisi;
	}
	
	public int getJumlahSisi() {
		return this.jumlahSisi;
	}
}