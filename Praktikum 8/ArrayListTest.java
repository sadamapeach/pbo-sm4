/**
* Nama File     : ArrayListTest.java
* Tanggal       : 17 Mei 2023
* Penulis       : Oktaviana Sadama Nur Azizah
* NIM           : 24060121130060
* Deskripsi     : Program penggunaan objek ArrayList sebagai Collection Class
**/

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //inisialisasi ArrayList yang hanya dapat berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        //menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        //menghapus elemen
        strings.remove("praktikum");
        //iterasi pada keseluruhan ArrayList
        for(String s : strings) {
            System.out.print(s+" ");
        }
    }
}