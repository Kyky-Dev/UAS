package com.mycompany.mahasiswa;

public class Mahasiswa {

    String nama, membaca, nyontek, modifikasi, lulus;
    Double ipk;
    int semester;
    
    void display(){
        System.out.println("Nama " + nama + " Mahasiswa Semester " + semester);
        System.out.println("Membaca = " + membaca);
        System.out.println("Memodifikasi = " + modifikasi);
        System.out.println(nyontek);
        System.out.println("Mendapat IPK = " + ipk);
        System.out.println("Mendapat Hasil = " + lulus);
        
    }
}