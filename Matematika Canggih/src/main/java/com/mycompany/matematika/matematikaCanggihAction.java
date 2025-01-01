package com.mycompany.matematika;

public class matematikaCanggihAction {
    
    public static void main(String[] args) {
        
        matematikaCanggih hitungCanggih = new matematikaCanggih();
        
        hitungCanggih.pertambahan(23, 24);
        hitungCanggih.display();
        hitungCanggih.pertambahan(12, 28, 14);
        hitungCanggih.display();
        hitungCanggih.pertambahan(3.4, 4.9);
        hitungCanggih.display2();
        hitungCanggih.pertambahan(12.5, 28.7, 14.2);
        hitungCanggih.display2();
        
        hitungCanggih.pengurangan(102, 4);
        hitungCanggih.display();
        
        hitungCanggih.perkalian(102, 4);
        hitungCanggih.display();
        
        hitungCanggih.pembagian(102, 4);
        hitungCanggih.display();
        
        hitungCanggih.setmodulus(102, 4);
        hitungCanggih.display();
    }
    
}
