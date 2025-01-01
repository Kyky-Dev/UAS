package com.mycompany.handphone;

public class actionHandphone {
    
    public static void main(String[] args){
    
        Handphone handphoneku = new Handphone();
        handphoneku.pemilik = "Kyky";
        handphoneku.merek = "Xiaomi";
        handphoneku.no = 012345;
        
        handphoneku.printHandphone();

        Handphone handphoneMu = new Handphone();
        handphoneMu.pemilik = "Kamu";
        handphoneMu.merek = "Oppo";
        handphoneMu.no = 54321;

        handphoneMu.printHandphone();
    
    }
    
}