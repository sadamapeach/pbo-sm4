/**
* Nama File	: MBujurSangkar.java 
* Tanggal	: 26 Maret 2023
* Penulis	: Oktaviana Sadama Nur Azizah
* NIM		: 24060121130060
* Deskripsi	: Kelas yang mengimplementasikan cara menghitung
		  luas bujur sangkar
**/

import java.util.Scanner;

class MBujurSangkar {
	public static void main(String[] args) {
		// memasukkan input nilai
		Scanner scan = new Scanner(System.in);
		BujurSangkar bujursangkar = new BujurSangkar();
		System.out.print("Masukkan sisi bujur sangkar : ");
		
		double sisi = scan.nextDouble();
		System.out.println("Luas bujur sangkar dengan sisi "
			+sisi+" satuan adalah "+bujursangkar.hitungLuas(sisi));		
	}
}
