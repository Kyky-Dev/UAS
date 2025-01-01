package com.mycompany.matematika;

public class actionMatematika {
    public static void main(String[] args) {
        Matematika hitung = new Matematika();

        hitung.pertambahan(12, 30);
        System.out.println("Hasil Pertambahan = " + hitung.getOperasi());
        hitung.pengurangan(55, 10);
        System.out.println("Hasil Pengurangan = " + hitung.getOperasi());
        hitung.perkalian(8, 16);
        System.out.println("Hasil Perkalian = " + hitung.getOperasi());
        hitung.pembagian(100, 4);
        System.out.println("Hasil Pembagian = " + hitung.getOperasi());
    }
}