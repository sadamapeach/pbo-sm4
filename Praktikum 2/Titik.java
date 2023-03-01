/**
* Nama File	: Titik.java 
* Tanggal	: 1 Maret 2023
* Penulis	: Oktaviana Sadama Nur Azizah
* NIM		: 24060121130060
* Deskripsi	: Kelas Titik
**/

class Titik{

	private double absis;
	private double ordinat;
	private static double counterTitik; //penghitung objek titik yang telah dibuat
	
	public Titik() {
		counterTitik++; //hitung banyak titik
		absis = 0;
		ordinat = 0;
	}
	
	public Titik(double a, double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	
	public void setAbsis(double a){
		absis = a;
	}
		
	public void setOrdinat(double o){
		ordinat = o;
	}
		
	public double getAbsis(){
		return absis;
	}
	
	public double getOrdinat(){
		return ordinat;
	}
	
	public double getCounterTitik(){
		return counterTitik;
	}
}