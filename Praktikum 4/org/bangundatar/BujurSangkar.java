/**
* Nama File	: BujurSangakar.java 
* Tanggal	: 15 Maret 2023
* Penulis	: Oktaviana Sadama Nur Azizah
* NIM		: 24060121130060
* Deskripsi	: Representasi dari objek bujur sangkar,
		  turunan kelas poligon
**/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
	private double sisi;
	
	public BujurSangkar(double sisi) {
		this.jumlahSisi = 4;
		this.sisi = sisi;
	}
	
	public double hitungLuas() {
		return sisi * sisi;
	}
	
	public double getSisi() {
		return this.sisi;
	}
}
