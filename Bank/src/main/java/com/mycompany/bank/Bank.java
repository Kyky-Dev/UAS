package com.mycompany.bank;

public class Bank {
    int saldo;
    public Bank (int saldo) {
        
        this.saldo = saldo;
    }
    void getSaldo (int saldo){
        System.out.println("selamat datang");
        System.out.println("saldo saat ini = " + saldo);
    }
    void simpanUang(int simpanUang){
        saldo += simpanUang;
        System.out.println("simpan uang = " + simpanUang);
        System.out.println("saldo saat ini = " + saldo);
    }
    void ambilUang (int ambilUang){
        saldo -= ambilUang;
        System.out.println("ambil uang = " + ambilUang);
        System.out.println("saldo saat ini = " + saldo);
}
}