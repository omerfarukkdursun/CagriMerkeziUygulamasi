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
public class Bilgisiyar extends TeknolojikSorun{

    public String modeli;
    public String sorunSebeb;
    
    public Bilgisiyar(String ismi, String markası,String modeli,String sorunSebeb) {
        super(ismi, markası);
        this.modeli=modeli;
        this.sorunSebeb=sorunSebeb;
        this.tür="bilgisiyar";
        
    }
        public Bilgisiyar(String ismi, String markası) {
        super(ismi, markası);
        this.modeli="bilinmiyor";
        this.tür="bilgisiyar";
    }
    
    
    
}
