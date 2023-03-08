/**
* Nama File	: OperasiTitik.java 
* Tanggal	: 1 Maret 2023
* Penulis	: Oktaviana Sadama Nur Azizah
* NIM		: 24060121130060
* Deskripsi	: Kelas Titik
**/

public class OperasiTitik{
	
	private void refleksiSumbuX(Titik titik) { // Harus Private
		double y;
		y = titik.getOrdinat();
		y *= -1;
		titik.setOrdinat(y);
	}
	
	private void refleksiSumbuY(Titik titik) { // Harus Private
		double x;
		x = titik.getAbsis();
		x *= -1;
		titik.setAbsis(x);
	}
	
	public Titik refleksiX(Titik titik){
		// TODO 1
	}
	
	public Titik refleksiY(Titik titik){
		// TODO 2
	}
}

	
