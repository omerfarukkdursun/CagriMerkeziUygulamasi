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
public class TeknolojikSorun extends SorunTakip {

    String markası;

    public TeknolojikSorun(String ismi, String markası) {
        super(ismi);
        this.markası = markası;
        this.tür="Teknolojik Sorun";
        seriNo = sayac;
        sayac++;
    }

    public void hangiSorun(String tür) {
        tür = this.tür;
        System.out.println("Teknolojik Sorun Türü : " + tür);
    }

}
