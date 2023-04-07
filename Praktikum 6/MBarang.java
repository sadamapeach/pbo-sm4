/**
* Nama File	: MBarang.java 
* Tanggal	: 07 April 2023
* Penulis	: Oktaviana Sadama Nur Azizah
* NIM		: 24060121130060
* Deskripsi	: Program penggunaan exception 'throw' dan 'throws'
**/

public class MBarang {
    public static void beliBarang(Barang barang, int jumlah) throws StokException {
        if (jumlah > barang.getStok()) {
	    throw new StokException(barang);            
        } else {
            System.out.println("Anda berhasil membeli "+jumlah+" "+barang.getNama());
	    barang.kurangiStok(jumlah);
        }
    }
    
    public static void main(String[] args) {
        Barang barang = new Barang("B003", "Indomie", 25);
        try {
            beliBarang(barang, 15);
	    beliBarang(barang, 10);
	    beliBarang(barang, 5);
        } catch (StokException e) {
            System.out.println(e.getMessage());
	    System.out.println("Mohon maaf, stok barang tidak mencukupi.");
        }
    }

}
