/**
* Nama File	: Titik.java 
* Tanggal	: 22 Februari 2023
* Penulis	: Oktaviana Sadama Nur Azizah
* NIM		: 24060121130060
* Deskripsi	: Kelas Titik
**/

class Titik{

	double absis;
	double ordinat;
	static int counterTitik; //penghitung objek titik yang telah dibuat
	
	Titik() {
		counterTitik++; //hitung banyak titik
		absis = 0;
		ordinat = 0;
	}
	
	Titik(double a, double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	
	void setAbsis(double a){
		absis = a;
	}
		
	void setOrdinat(double o){
		ordinat = o;
	}
		
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}
}