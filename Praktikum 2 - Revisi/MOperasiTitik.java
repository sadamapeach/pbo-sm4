/**
* Nama File	: MOperasiTitik.java 
* Tanggal	: 1 Maret 2023
* Penulis	: Oktaviana Sadama Nur Azizah
* NIM		: 24060121130060
* Deskripsi	: Kelas Titik
**/

public class MOperasiTitik {
	//template wajib di java untuk print
	public static void main(String[] args) {
		Titik t = new Titik(4,4);
		OperasiTitik(o) = new OperasiTitik();
			
		System.out.println("Titik("+t.getAbsis()+","+t.getOrdinat()+")");
		o.refleksiX(t);
		System.out.println("Titik("+t.getAbsis()+","+t.getOrdinat()+")");
		o.refleksiY(t);
		System.out.println("Titik("+t.getAbsis()+","+t.getOrdinat()+")");
	}
}