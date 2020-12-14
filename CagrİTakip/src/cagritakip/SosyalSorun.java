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
public class SosyalSorun extends SorunTakip {

    public String acıklama;

    public SosyalSorun(String ismi,String aciklama) {
        super(ismi);
        this.acıklama=aciklama;
        seriNo = sayac;
        this.tür="Sosyal Sorun";
        sayac++;
    }

    public void hangiSorun(String tür) {
        tür = this.tür;
        System.out.println("Sosyal Sorun Türü : " + tür);
    }
}
