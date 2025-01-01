package com.mycompany.matematika;

public class Matematika {
    
    int mat;
    
    void pertambahan (int a, int b){
        mat = a + b;
    }
    void pengurangan(int a, int b){
        mat = a - b;
    }
    void perkalian(int a, int b){
        mat = a * b;
    }
    void pembagian(int a, int b){
        mat = a / b;
    }
    
    int getOperasi (){
        return mat;
    }
}