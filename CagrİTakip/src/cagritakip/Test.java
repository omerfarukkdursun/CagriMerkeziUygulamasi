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
public class Test {

    public static void main(String[] args) {
        CagrıMerkezi cagrıMerkezi = new CagrıMerkezi();
        cagrıMerkezi.butunKayitlariBastir();
        
        cagrıMerkezi.teknolojiyeBakanOperatorOlustur("omer", "dursun", 29, 1000);
        cagrıMerkezi.sosyalSorunlaraBakanOperatorOlustur("Ahmet", "Ak", 25, 2000);
       
       cagrıMerkezi.teknolojiBilgisiyarKayıtEkle("Ömer Faruk Dursun", "Acer", "Nitro", "Ekran Kartı Bozuk");
       cagrıMerkezi.sosyalÇevreselSorunEkle("Çöp", "Furkan", "çöp kutusu mahallede eksik");
        cagrıMerkezi.BilgisiyarSorunlarıGoster();
        
        cagrıMerkezi.toplamKayıtSayısınıBastır(); 
        
        cagrıMerkezi.teknolojiyeBakanOperatorunKayıtları();
       cagrıMerkezi.sosyalSorunlaraBakanOperatorunKayıtları();
       cagrıMerkezi.butunKayitlariBastir();
        cagrıMerkezi.enCokCalisanOperator();
       cagrıMerkezi.enCokOlanSorunTuru();
       
        cagrıMerkezi.teknolojikOperatoruSil();
        
        
       
    }
}
