package com.mycompany.matematika;

public class Matematika {

     int mat;
     double mat2;
     String operasi;
        //TAMBAH
        void pertambahan(int a, int b){
            mat = a + b;
            operasi = "+";
        }
        void pertambahan(int a, int b, int c){
            mat = a + b + c;
            operasi = "+";
        }
        void pertambahan(double a, double b){
            mat2 = a + b ;
            operasi = "+";
        }
        void pertambahan(double a, double b, double c){
            mat2 = a + b + c ;
            operasi = "+";
        }
        
        //KURANG
        void pengurangan(int a, int b){
            mat = a - b;
            operasi = "-";
        }
        void pengurangan(int a, int b, int c){
            mat = a - b - c;
            operasi = "-";
        }
        void pengurangan(double a, double b){
            mat2 = a - b;
            operasi = "-";
        }
        void pengurangan(double a, double b, double c){
            mat2 = a - b - c;
            operasi = "-";
        }
        
        //KALI
        void perkalian(int a, int b){
            mat = a * b;
            operasi = "x";
        }
        void perkalian(int a, int b, int c){
            mat = a * b * c;
            operasi = "x";
        }
        void perkalian(double a, double b){
            mat2 = a * b;
            operasi = "x";
        }
        void perkalian(double a, double b, double c){
            mat2 = a * b * c;
            operasi = "x";
        }
        
        //BAGI
        void pembagian(int a, int b){
            mat = a / b;
            operasi = ":";
        }
        void pembagian(int a, int b, int c){
            mat = a / b / c;
            operasi = ":";
        }
        void pembagian(double a, double b){
            mat2 = a / b;
            operasi = ":";
        }
        void pembagian(double a, double b, double c){
            mat2 = a / b / c;
            operasi = ":";
        }
                
}
