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
public class CagrıMerkezi {

    public Operator teknolojiyeBakan;
    public Operator sosyalSorunlaraBakan;

    public void enCokCalisanOperator() {
        if(teknolojiyeBakan==null&&sosyalSorunlaraBakan!=null){
            System.out.println("şuan sadece sosyal sorunlara bakan operator bulunuyor");   
        }
        else if(teknolojiyeBakan==null&&sosyalSorunlaraBakan==null){
            System.out.println("iki operator de bulunmuyor ");
        }
        else if(teknolojiyeBakan!=null&sosyalSorunlaraBakan==null){
            System.out.println("şuan sadece teknolojiye bakan operator bulunuyor");
        }
        
        else{
        
        
        
        if (teknolojiyeBakan.kayıtlar.size() > sosyalSorunlaraBakan.kayıtlar.size()) {

            System.out.println("teknolojiye bakan operatorumuz daha çok çalışıyor maaşına zam yapıldı");
            teknolojiyeBakan.zamYap();

        } else if (teknolojiyeBakan.kayıtlar.size() < sosyalSorunlaraBakan.kayıtlar.size()) {

            System.out.println("sosyal soruna bakan operatorumuz daha çok çalışıyor maaşına zam yapıldı");
            sosyalSorunlaraBakan.zamYap();
        } else {
            System.out.println("iki operator de aynı seviyede çalışıyor");

        }
        }
    }

    public void teknolojiyeBakanOperatorOlustur(String isim, String cinsiyet, int yas, int maas) {
        if (teknolojiyeBakan == null) {
            if (yas < 18) {
                System.out.println("yas 18'den küçük olduğu için operator oluşturulmadı!!!");

            } else {
                teknolojiyeBakan = new Operator(isim, cinsiyet, yas, "teknolojik", maas);
                System.out.println("teknolojiye bakan operator oluşturuldu");
            }
        } else {
            System.out.println("operator zaten mevcut");
        }
    }

    public void sosyalSorunlaraBakanOperatorOlustur(String isim, String cinsiyet, int yas, int maas) {
        if (sosyalSorunlaraBakan == null) {
            if (yas < 18) {
                System.out.println("yas 18'den küçük olduğu için operator oluşturulmadı!!!");

            } else {
                sosyalSorunlaraBakan = new Operator(isim, cinsiyet, yas, "sosyal", maas);
                System.out.println("sosyal sorunlara bakan operator oluşturuldu");
            }
        } else {
            System.out.println("operator zaten mevcut");
        }
    }

    //************************************teknolojiye bakanı ilgilendiren
    public void teknolojikOperatoruSil() {

        teknolojiyeBakan = null;
        System.out.println("operator silindi");

    }

    public void teknolojiBilgisiyarKayıtEkle(String ismi, String markası, String modeli,String SorunSebeb) {
        if (teknolojiyeBakan == null) {
            System.out.println("Operator bulunmuyor lütfen operator ekleyiniz");
        } else {
            teknolojiyeBakan.kayıtlar.add(new Bilgisiyar(ismi, markası, modeli,SorunSebeb));
        }
    }

    public void teknolojiKayıtSil(int seriNo) {
        if (teknolojiyeBakan == null) {
            System.out.println("Operator bulunmuyor lütfen operator ekleyiniz");
        } else {
            for (int i = teknolojiyeBakan.kayıtlar.size() - 1; i >= 0; i--) {
                if (teknolojiyeBakan.kayıtlar.get(i).seriNo == seriNo) {

                    teknolojiyeBakan.kayıtlar.remove(i);

                }
            }
        }

    }

    public void teknolojiyeBakanOperatorunKayıtları() {
        if (teknolojiyeBakan == null) {
            System.out.println("Operator bulunmuyor lütfen operator ekleyiniz");
        } else {
            for (SorunTakip tekno : teknolojiyeBakan.kayıtlar) {
                if (tekno instanceof TeknolojikSorun) {

                    System.out.println("ismi: " + tekno.sorunuBirakanKisininAdi);
                    if (tekno instanceof Bilgisiyar) {
                        System.out.println("tür: bilgisiyar");
                    } else {
                        System.out.println("tür: radyo");
                    }

                }
            }
        }

    }

    public void teknolojiRadyoKayıtEkle(String ismi, String markası, int frekansı,String SorunSebeb) {
        if (teknolojiyeBakan == null) {
            System.out.println("Operator bulunmuyor lütfen operator ekleyiniz");
        } else {
            teknolojiyeBakan.kayıtlar.add(new Radyo(ismi, markası, frekansı,SorunSebeb));
        }
    }

    public void teknelojiyeBakanOperatunBilgileri() {
        if (teknolojiyeBakan == null) {
            System.out.println("teknolojiye bakan operator bulunmuyor");
        } else {
            teknolojiyeBakan.operatorBilgi();
        }
    }

    public void BilgisiyarSorunlarıGoster() {
        if (teknolojiyeBakan == null) {
            System.out.println(" teknoloji sorunlara bakan Operator bulunmuyor lütfen operator ekleyiniz");
        } else {

            for (SorunTakip sorun : teknolojiyeBakan.kayıtlar) {

                if (sorun instanceof Bilgisiyar) {

                    System.out.println("Bİlgisayar sorunu bırakan kişinin adı: " + sorun.sorunuBirakanKisininAdi);
                    System.out.println("sorunun seri no'su: " + sorun.seriNo);
                    System.out.println("tür: " + sorun.tür);
                    System.out.println("markası : " + ((Bilgisiyar) sorun).markası);
                    System.out.println("modeli : " + ((Bilgisiyar) sorun).modeli);

                }

            }
        }

    }

    public void RadyoSorunlarıGoster() {

        if (teknolojiyeBakan == null) {
            System.out.println(" teknoloji sorunlara bakan Operator bulunmuyor lütfen operator ekleyiniz");
        } else {

            for (SorunTakip sorun : teknolojiyeBakan.kayıtlar) {

                if (sorun instanceof Radyo) {

                    System.out.println("Radyo sorunu bırakan kişinin adı: " + sorun.sorunuBirakanKisininAdi);
                    System.out.println("sorunun seri no'su: " + sorun.seriNo);
                    System.out.println("tür: " + sorun.tür);
                    System.out.println("markası : " + ((Radyo) sorun).markası);
                    System.out.println("frekansı : " + ((Radyo) sorun).frekansı);

                }

            }
        }

    }

    //**********************************sosyal sorunlara bakanı ilgilendiren
    public void sosyalSorunlaraBakanOperatoruSil() {
        sosyalSorunlaraBakan = null;
        System.out.println("opeartor silindi");
    }

    public void ŞiddetSorunlarıGoster() {
        if (sosyalSorunlaraBakan == null) {
            System.out.println(" sosyal sorunlara bakan Operator bulunmuyor lütfen operator ekleyiniz");
        } else {

            for (SorunTakip sorun : sosyalSorunlaraBakan.kayıtlar) {

                if (sorun instanceof SiddetSorun) {

                    System.out.println("Şiddet sorununu bırakan kişinin adı: " + sorun.sorunuBirakanKisininAdi);
                    System.out.println("sorunun seri no'su: " + sorun.seriNo);
                    System.out.println("tür: " + sorun.tür);
                    System.out.println("aciklama: " + ((SiddetSorun) sorun).acıklama);
                    System.out.println("olay: " + ((SiddetSorun) sorun).olay);
                    System.out.println("şiddet sorun sebebi: " + ((SiddetSorun) sorun).şiddetsorunsebebi);
                    System.out.println("şiddet seviyesi: " + ((SiddetSorun) sorun).şiddetSeviyesi);

                }

            }
        }
    }

    public void CevreselSorunlarıGoster() {
        if (sosyalSorunlaraBakan == null) {
            System.out.println("Operator bulunmuyor lütfen operator ekleyiniz");
        } else {

            for (SorunTakip sorun : sosyalSorunlaraBakan.kayıtlar) {

                if (sorun instanceof ÇevreselSorun) {

                    System.out.println("Çevresel sorunu bırakan kişinin adı: " + sorun.sorunuBirakanKisininAdi);
                    System.out.println("sorunun seri no'su: " + sorun.seriNo);
                    System.out.println("tür: " + sorun.tür);
                    System.out.println("aciklama: " + ((ÇevreselSorun) sorun).acıklama);
                    System.out.println("çevresel sorun sebebi: " + ((ÇevreselSorun) sorun).cevreselSorunSebebi);

                }

            }
        }

    }

    public void sosyalŞiddetSorunEkle(String ismi, String aciklama, String olay, String şiddetsorunsebebi, int şiddetSeviyesi) {
        if (sosyalSorunlaraBakan == null) {
            System.out.println("Operator bulunmuyor lütfen operator ekleyiniz");
        } else {
            sosyalSorunlaraBakan.kayıtlar.add(new SiddetSorun(ismi, aciklama, olay, şiddetsorunsebebi, şiddetSeviyesi));
        }
    }

    public void sosyalÇevreselSorunEkle(String cevreselSorunSebebi, String ismi, String aciklama) {
        if (sosyalSorunlaraBakan == null) {
            System.out.println("Operator bulunmuyor lütfen operator ekleyiniz");
        } else {
            sosyalSorunlaraBakan.kayıtlar.add(new ÇevreselSorun(cevreselSorunSebebi, ismi, aciklama));
        }
    }

    public void sosyalSorunSil(int seriNo) {
        if (sosyalSorunlaraBakan == null) {

            System.out.println("Operator bulunmuyor lütfen operator ekleyiniz");
        } else {

            for (int i = sosyalSorunlaraBakan.kayıtlar.size() - 1; i >= 0; i--) {
                if (sosyalSorunlaraBakan.kayıtlar.get(i).seriNo == seriNo) {

                    sosyalSorunlaraBakan.kayıtlar.remove(i);

                }
            }
        }
    }

    public void sosyalSorunlaraBakanOperatorunKayıtları() {
        if (sosyalSorunlaraBakan == null) {
            System.out.println("teknolojiye bakan operator bulunmuyor");
        } else {
            for (SorunTakip sorun : sosyalSorunlaraBakan.kayıtlar) {
                if (sorun instanceof SosyalSorun) {

                    System.out.println("ismi: " + sorun.sorunuBirakanKisininAdi);
                    if (sorun instanceof SiddetSorun) {
                        System.out.println("tür: Şiddet sorun");
                    } else {
                        System.out.println("tür: Çevresel sorun");
                    }

                }
            }
        }
    }

    public void sosyalSorunlaraBakanOperatorunBilgileri() {
        if (sosyalSorunlaraBakan == null) {
            System.out.println("tsosyal sorunlara bakan operator bulunmuyor");
        } else {
            sosyalSorunlaraBakan.operatorBilgi();
        }
    }

    //**********************************ikisini de ilgilendiren
    public void butunKayitlariBastir() {
        if (teknolojiyeBakan != null) {
            for (SorunTakip sorunTakip : teknolojiyeBakan.kayıtlar) {

                System.out.println("sorunu bırakan kişinin adi: " + sorunTakip.sorunuBirakanKisininAdi + "  tür: " + sorunTakip.tür + " seri no: " + sorunTakip.seriNo);

            }
        } else {
            System.out.println("teknolijiye bakan operator oluşmadığı için teknolojiye bakan operatorun kayırları gösterilmedi");
        }
        if (sosyalSorunlaraBakan != null) {
            for (SorunTakip sorunTakip : sosyalSorunlaraBakan.kayıtlar) {

                System.out.println("sorunu bırakan kişinin adi: " + sorunTakip.sorunuBirakanKisininAdi + "  tür: " + sorunTakip.tür + " seri no: " + sorunTakip.seriNo);

            }
        } else {
            System.out.println("sosyal sorunlara bakan operator oluşmadığı için sosyal sorunlara bakan operatorun kayırları gösterilmedi");
        }

    }

    public void toplamKayıtSayısınıBastır() {
        int toplamA = 0;
        int toplamB = 0;
        if (teknolojiyeBakan != null) {
            toplamA = teknolojiyeBakan.kayıtlar.size();
        } else {
            System.out.println("teknolojiye bakan operator bulunmuyor lütfen operator oluşturunuz...");
        }
        if (sosyalSorunlaraBakan != null) {
            toplamB = sosyalSorunlaraBakan.kayıtlar.size();
        } else {
            System.out.println("sosyal sorunlara bakan operator bulunmuyor lütfen operator oluşturunuz...");
        }

        System.out.println("toplam yapılan çağrı kaydı sayısı: " + (toplamA + toplamB));

    }

    public void ButunOperatorunBilgileriniBastir() {
        teknolojiyeBakan.operatorBilgi();
        System.out.println("---------------------------------------------------");
        sosyalSorunlaraBakan.operatorBilgi();
    }

    String[] türler = {"Şiddet","Radyo","Sosyal Sorun","Teknolojik Sorun","Çevresel Sorun","bilgisiyar"};

    public void enCokOlanSorunTuru() {
        String enCokOlanTur = "";
        int sayi = 0;
        if (sosyalSorunlaraBakan == null && teknolojiyeBakan == null) {
            System.out.println("iki operator de bulunmuyor lütffen operatorleri oluşturunuz...");

        } else {
            for (int i = 0; i < türler.length; i++) {
                sayi = sayi > SorunSayısı(türler[i]) ? sayi : SorunSayısı(türler[i]);
            }

            for (String tür : türler) {

                if (SorunSayısı(tür) == sayi) {
                    enCokOlanTur += tür+",";

                }

            }

            System.out.println("en çok çağrı yapılmış sorun türü: " + enCokOlanTur + " sayısı: " + sayi);

        }

    }

    private int SorunSayısı(String SorunTürü) {
        int sorunSayısı = 0;

        if (teknolojiyeBakan != null) {

            for (SorunTakip sorun : teknolojiyeBakan.kayıtlar) {
                if (sorun.tür.equals(SorunTürü)) {
                    sorunSayısı++;
                }
            }

        }
        if (sosyalSorunlaraBakan != null) {

            for (SorunTakip sorun : sosyalSorunlaraBakan.kayıtlar) {
                if (sorun.tür.equals(SorunTürü)) {
                    sorunSayısı++;
                }
            }

        }
        return sorunSayısı;
    }

}
