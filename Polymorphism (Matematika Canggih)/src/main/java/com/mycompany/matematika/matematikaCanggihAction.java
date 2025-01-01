package com.mycompany.matematika;

public class matematikaCanggihAction {
    
    public static void main(String[] args) {
        
        matematikaCanggih hitungCanggih = new matematikaCanggih();
        
        hitungCanggih.pertambahan(23, 24);
        System.out.println("Hasil Pertambahan int = " + hitungCanggih.getOperasi());
        hitungCanggih.pertambahan(12, 28, 14);
        System.out.println("Hasil Pertambahan int = " + hitungCanggih.getOperasi());
        hitungCanggih.pertambahan(3.4, 4.9);
        System.out.println("Hasil Pertambahan double = " + hitungCanggih.getOperasi2());
        hitungCanggih.pertambahan(12.5, 28.7, 14.2);
        System.out.println("Hasil Pertambahan double = " + hitungCanggih.getOperasi2());
        
        hitungCanggih.pengurangan(102, 4);
        System.out.println("Hasil Pengurangan = " + hitungCanggih.getOperasi());
        
        hitungCanggih.perkalian(102, 4);
        System.out.println("Hasil Perkalian = " + hitungCanggih.getOperasi());
        
        hitungCanggih.pembagian(102, 4);
        System.out.println("Hasil Pembagian = " + hitungCanggih.getOperasi());
        
        hitungCanggih.setmodulus(102, 4);
        System.out.println("Hasil Modulus = " + hitungCanggih.getOperasi());
    }
    
}
