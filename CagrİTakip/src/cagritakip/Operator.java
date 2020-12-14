/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cagritakip;

import java.util.ArrayList;

/**
 *
 * @author Fatih
 */
public class Operator {
    public final int enDusukMaas=1500;
    public String isim;
    public int yas;
    public int maas;
    public String cinsiyet;
    public String Departman;
    public ArrayList<SorunTakip> kayıtlar=new ArrayList<>();
    
    
    public Operator(String isim,String cinsiyet,int yas,String Departman,int maas){
        this.isim=isim;
        this.cinsiyet=cinsiyet;
        this.yas=yas;

        this.Departman=Departman;
       
        
        
        if(maas<=1500){
            System.out.println("Operatorun maaşı  en küçük maaştan(1500 tl) küçük olamaz maas varsayılan olan 1500 olarak ayarlandı");
            this.maas=enDusukMaas;
        }
        else{
        this.maas=maas;
        }
        
    }
    
    public void zamYap(){
    maas=maas+200;
    }
    
    
    public void operatorBilgi(){
        System.out.println("isim: "+isim);
        System.out.println("cinsiyet: "+cinsiyet);
        System.out.println("yas: "+yas);
        System.out.println("maas: "+maas);
        System.out.println("Departman: "+Departman);
        System.out.println("Tuttuğu Kayıt sayısı:+"+kayıtlar.size());
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
              
        if(maas<=0){
            System.out.println("Operatorun maaşı  en küçük maaştan(1500 tl) küçük olamaz maas varsayılan olan 1500 olarak ayarlandı");
            this.maas=enDusukMaas;
        }
        else{
        this.maas=maas;
        }
        
       
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getDepartman() {
        return Departman;
    }

    public void setDepartman(String Departman) {
        this.Departman = Departman;
    }

    
    
    public void butunSorunlariGoster(){
        
        for(SorunTakip sorun:kayıtlar){
        
            System.out.println("kaydın ismi: "+sorun.sorunuBirakanKisininAdi+" kaydın türü: "+sorun.tür);
        
        }

}
    
    
    
    
    
    
    
    
}
