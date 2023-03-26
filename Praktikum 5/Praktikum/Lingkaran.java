/**
* Nama File	: Lingkaran.java 
* Tanggal	: 26 Maret 2023
* Penulis	: Oktaviana Sadama Nur Azizah
* NIM		: 24060121130060
* Deskripsi	: Kelas implementasikan IArea berupa cara 
			  menghitung luas lingkaran
**/

import static java.lang.Math.PI;

class Lingkaran implements IArea {
	private double jejari;
	
	public Lingkaran(double r) {
		jejari = r;
	}
	
	public double hitungLuas() {
		return PI * jejari * jejari;
	}
}