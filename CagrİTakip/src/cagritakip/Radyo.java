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
public class Radyo extends TeknolojikSorun{
    
    public int frekansı;
    public String sorunSebeb;
    
    public Radyo(String ismi, String markası,int frekansı, String sorunSebeb) {
        super(ismi, markası);
        this.frekansı=frekansı;
        this.sorunSebeb=sorunSebeb;
        this.tür="Radyo";
        
    }
    
    
}
