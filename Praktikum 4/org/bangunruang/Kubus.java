/**
* Nama File	: Kubus.java 
* Tanggal	: 15 Maret 2023
* Penulis	: Oktaviana Sadama Nur Azizah
* NIM		: 24060121130060
* Deskripsi	: Kelas Kubus
**/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
	private BujurSangkar permukaan;
	
	public Kubus(BujurSangkar permukaan) {
		this.permukaan = permukaan;
	}
	
	public double hitungVolume() {
		double sisi = permukaan.getSisi();
		return sisi * sisi * sisi;
	}
	
	public double hitungLuasAlas() {
		double sisi = permukaan.getSisi();
		return sisi * sisi;
	}
}
