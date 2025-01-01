package com.mycompany.matematika;

public class Matematika {

     int mat;
     double mat2;
     String operasi;
        //TAMBAH
        void pertambahan(int a, int b){
            mat = a + b;
        }
        
        //KURANG
        void pengurangan(int a, int b){
            mat = a - b;
        }

        //KALI
        void perkalian(int a, int b){
            mat = a * b;
        }
        
        //BAGI
        void pembagian(int a, int b){
            mat = a / b;
        }
        
        int getOperasi(){
            return mat;
        }

}
