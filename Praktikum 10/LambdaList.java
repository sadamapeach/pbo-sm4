/**
 * File         : LambdaList.java
 * Nama         : Oktaviana Sadama Nur Azizah
 * Tanggal      : 2023-05-31
 * Deskripsi    : Implementasi lambda pada list, digunakan sebagai parameter pada method
**/

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");
        
        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}