package com.alfan.modul2.no2;

public class Burung {
    // Deklarasi
    public String nama;
    public String terbang;

    // Constructor
    public Burung(String nama) {
        this.nama = nama;
    }

    // Cetak Nama Binatang
    public void getNama(){
        System.out.println("Binatang: " + nama);
        Binatang.Makan("Jagung");
        Binatang.Tidur("Berdiri");
    }
    // Cetak Tingkah laku
    public void terbang(){
        System.out.println("Tingkah Laku: Terbang");
    }
}
