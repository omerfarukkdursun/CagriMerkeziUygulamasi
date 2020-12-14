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
public class ÇevreselSorun extends SosyalSorun{
    public String cevreselSorunSebebi;

    public ÇevreselSorun(String cevreselSorunSebebi, String ismi, String aciklama) {
        super(ismi, aciklama);
        this.cevreselSorunSebebi = cevreselSorunSebebi;
        this.tür="Çevresel Sorun";
    }
    
    
    
}
