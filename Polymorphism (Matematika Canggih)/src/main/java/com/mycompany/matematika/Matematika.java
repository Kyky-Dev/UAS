package com.mycompany.matematika;

public class Matematika {

     int mat;
     double mat2;
     String operasi;
        //TAMBAH
        void pertambahan(int a, int b){
            mat = a + b;
        }
        void pertambahan(int a, int b, int c){
            mat = a + b + c;
        }
        void pertambahan(double a, double b){
            mat2 = a + b ;
        }
        void pertambahan(double a, double b, double c){
            mat2 = a + b + c ;
        }
        
        //KURANG
        void pengurangan(int a, int b){
            mat = a - b;
        }
        void pengurangan(int a, int b, int c){
            mat = a - b - c;
        }
        void pengurangan(double a, double b){
            mat2 = a - b;
        }
        void pengurangan(double a, double b, double c){
            mat2 = a - b - c;
        }
        
        //KALI
        void perkalian(int a, int b){
            mat = a * b;
        }
        void perkalian(int a, int b, int c){
            mat = a * b * c;
        }
        void perkalian(double a, double b){
            mat2 = a * b;
        }
        void perkalian(double a, double b, double c){
            mat2 = a * b * c;
        }
        
        //BAGI
        void pembagian(int a, int b){
            mat = a / b;
        }
        void pembagian(int a, int b, int c){
            mat = a / b / c;
        }
        void pembagian(double a, double b){
            mat2 = a / b;
        }
        void pembagian(double a, double b, double c){
            mat2 = a / b / c;
        }
        
        int getOperasi(){
            return mat;
        }

        double getOperasi2(){
            return mat2;
        }
        
}
