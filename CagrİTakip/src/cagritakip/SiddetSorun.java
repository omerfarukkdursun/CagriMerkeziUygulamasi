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
public class SiddetSorun extends SosyalSorun{
    public String olay;
    public String şiddetsorunsebebi;
    public int şiddetSeviyesi;

    public SiddetSorun() {
        super(null, null);
    }
    
    public SiddetSorun(String ismi,String aciklama,String olay, String şiddetsorunsebebi, int şiddetSeviyesi) {
        super(ismi,aciklama);
        this.olay = olay;
        this.şiddetsorunsebebi = şiddetsorunsebebi;
        this.şiddetSeviyesi = şiddetSeviyesi;
        this.tür="Şiddet";
    }

    
}
