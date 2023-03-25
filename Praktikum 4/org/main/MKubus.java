/**
* Nama File	: MKubus.java 
* Tanggal	: 15 Maret 2023
* Penulis	: Oktaviana Sadama Nur Azizah
* NIM		: 24060121130060
* Deskripsi	: Driver class untuk bujur sangkar dan kubus
**/

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus {
	public static void main(String[] args) {
		BujurSangkar bujursangkar = new BujurSangkar(4);
		// TODO Gunakan method hitungLuasAlas untuk mencari luas permukaan kubus
		System.out.println("Luas Permukaan Kubus dengan panjang sisi 4 satuan : "+bujursangkar.hitungLuas());
		
		Kubus kubus = new Kubus(bujursangkar);
		System.out.println("Volume Kubus dengan panjang sisi 4 satuan : "+kubus.hitungVolume());
	}
}
