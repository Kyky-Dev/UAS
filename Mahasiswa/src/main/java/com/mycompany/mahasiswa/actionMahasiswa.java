package com.mycompany.mahasiswa;

public class actionMahasiswa {
    
     public static void main(String[] args) {
        
        Mahasiswa kiki = new Mahasiswa();
        kiki.nama = "KIKI";
        kiki.semester = 1;
        kiki.membaca = "Gak suka baca dia";
        kiki.modifikasi = "PC";
        kiki.nyontek = "Tidak Menyontek";
        kiki.ipk = 3.9;
        kiki.lulus = "Lulus";
        kiki.display();
        
        System.out.println("                            ");
        System.out.println("======= INI PEMBATAS =======");
        System.out.println("                            ");

        Mahasiswa kaka = new Mahasiswa();
        kaka.nama = "KAKA";
        kaka.semester = 3;
        kaka.membaca = "Buku Dasar Infrastruktur";
        kaka.modifikasi = "Jaringan FTI";
        kaka.nyontek = "Tidak Menyontek";
        kaka.ipk = 3.7;
        kaka.lulus = "Lulus";
        kaka.display();

        System.out.println("                            ");
        System.out.println("======= INI PEMBATAS =======");
        System.out.println("                            ");
         
        Mahasiswa kuku = new Mahasiswa();
        kuku.nama = "KUKU";
        kuku.semester = 5;
        kuku.membaca = "Resep Masakan";
        kuku.modifikasi = "Makanan";
        kuku.nyontek = "Menyontek";
        kuku.ipk = 2.8;
        kuku.lulus = "Tidak Lulus";
        kuku.display();
    }
}