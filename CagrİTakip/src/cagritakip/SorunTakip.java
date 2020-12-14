/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cagritakip;

/**
 *
 * @author Fatih
 */
public class SorunTakip {

    public String sorunuBirakanKisininAdi;
    public String tür;
    public int seriNo;
    public static int sayac = 1;
    
    


    public SorunTakip(String ismi) {
        this.sorunuBirakanKisininAdi = ismi;
        seriNo = sayac;
        

    }

    public SorunTakip() {
        seriNo = sayac;
        sayac++;
    }

    public SorunTakip(String ismi, String tür) {
        this.sorunuBirakanKisininAdi = ismi;
        this.tür = tür;
        seriNo = sayac;
        sayac++;
    }

}
