/**
* Nama File	: OperasiTitik.java 
* Tanggal	: 1 Maret 2023
* Penulis	: Oktaviana Sadama Nur Azizah
* NIM		: 24060121130060
* Deskripsi	: Kelas Titik
**/

public class OperasiTitik{
	
	public void refleksiSumbuX(Titik titik) {
		double y;
		y = titik.getOrdinat();
		y *= -1;
		titik.setOrdinat(y);
	}
	
	public void refleksiSumbuY(Titik titik) {
		double x;
		x = titik.getAbsis();
		x *= -1;
		titik.setAbsis(x);
	}
}

	