/**
* Nama File	: MLingkaran.java 
* Tanggal	: 26 Maret 2023
* Penulis	: Oktaviana Sadama Nur Azizah
* NIM		: 24060121130060
* Deskripsi	: Implementasi cara menghitung luas lingkaran
**/

public class MLingkaran {
	public static void main(String[] args) {
		Lingkaran lingkaran = new Lingkaran(10.2);
		System.out.println("Luas lingkaran dengan jejari "+
			"10.2 satuan adalah "+lingkaran.hitungLuas());
	}
}