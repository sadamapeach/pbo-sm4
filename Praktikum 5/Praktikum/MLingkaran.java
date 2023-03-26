/**
* Nama File	: MLingkaran.java 
* Tanggal	: 26 Maret 2023
* Penulis	: Oktaviana Sadama Nur Azizah
* NIM		: 24060121130060
* Deskripsi	: Implementasi cara menghitung luas lingkaran
**/

import java.util.Scanner;

public class MLingkaran {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan jari-jari lingkaran : ");
		double jejari = scan.nextDouble();
		
		Lingkaran lingkaran = new Lingkaran(jejari);
		System.out.println("Luas lingkaran dengan jejari "
			+jejari+" satuan adalah "+lingkaran.hitungLuas());
		
	}
}