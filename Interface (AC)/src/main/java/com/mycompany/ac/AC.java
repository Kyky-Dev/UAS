package com.mycompany.ac;

public class AC implements Interface {
    
    int statusAC;
    String modeAC = "Normal"; 

    public void tampilkanStatus() {
        String status = (statusAC == KEADAAN_HIDUP) ? "Hidup" : "Mati";
        System.out.println("Status AC >> " + status);
        System.out.println("Mode AC >> " + modeAC);
    }
    
    public void hidupkan() {
        if (statusAC == KEADAAN_MATI) {
            statusAC = KEADAAN_HIDUP;
            System.out.println("Hidupkan AC >> AC Sudah Hidup");
        } else {
            System.out.println("Hidupkan AC >> AC Sudah Hidup bang elahh");
        }
    }

    public void matikan() {
        if (statusAC == KEADAAN_HIDUP) {
            statusAC = KEADAAN_MATI;
            modeAC = "Normal";
            System.out.println("Matikan AC >> AC Mati, Mode kembali ke 'Normal'");
        } else {
            System.out.println("Matikan AC >> AC Sudah Mati om");
        }
    }

    public void dinginkan() {
        if (statusAC == KEADAAN_HIDUP) {
            modeAC = "Dingin";
            System.out.println("Atur Mode AC >> Mode Dingin");
        } else {
            System.out.println("Atur Mode AC >> Hidupkan AC Dulu");
        }
    }

    public void panaskan() {
        if (statusAC == KEADAAN_HIDUP) {
            modeAC = "Panas";
            System.out.println("Atur Mode AC >> Mode Panas");
        } else {
            System.out.println("Atur Mode AC >> Hidupkan AC Dulu");
        }
    }

}