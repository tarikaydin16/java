/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner; 
/**
 *
 * @author at
 */

public class JavaApplication1 {
        static String[] kelimeler = {"televizyon","kagit","kalem","soba","ansiklopedi","masa"};
        static int hangikelime = (int)(Math.random()*(kelimeler.length));
        static String secilenkelime = kelimeler[hangikelime];
        static char[] gosterilendeger = new char[secilenkelime.length()];
        static char[] sorukelimesi = new char[secilenkelime.length()];
        static String[] yeniDizi = new String[kelimeler.length*2]; //boş kelime dizimiz (kelime eklemek için kullanılan)
        static String[] yeniKelimeDizi = null; //asıl kelime dizimiz (oyunda kullanılan)
        static int hata = 0,dogru=0,buldum=0,yeniArry=0;
        static boolean hatavar = false;
        
        public static void main(String[] args) {
       // System.out.println("Seçilen kelime " + secilenkelime);
         while(true) {
            menuGoster();
            Scanner sc = new Scanner(System.in);
            char gir = sc.next().charAt(0);
            if(gir=='b' || gir=='B')
            { System.out.println("oyun başlıyor..");ekran(0);
            }
            if(gir=='e' || gir=='E') ekran(1);
            if(gir=='c' || gir=='C') {System.out.println("Oyundan cıktınız");break;} 
         }
        }
        
        public static void menuGoster(){
            System.out.println("Oyuna Başla (B)");
            System.out.println("Yeni Kelime ekle (E)");
            System.out.println("Çıkış(C)");
        }
        public static void ekran(int mod) {
        if(mod==0) {
      //kelimeler = {"televizyon","kağıt","kalem","soba","ansiklopedi","masa"};
      if(yeniArry ==0) {
      hangikelime = (int)(Math.random()*(kelimeler.length));
      secilenkelime = kelimeler[hangikelime];
      }else 
      {
      hangikelime = (int)(Math.random()*(yeniKelimeDizi.length));
      secilenkelime = yeniKelimeDizi[hangikelime];
          System.out.println("secilen kelime : " +secilenkelime);
      }
      
      gosterilendeger = new char[secilenkelime.length()];
      sorukelimesi = new char[secilenkelime.length()];
      hata = 0; dogru=0;buldum=0;
      hatavar = false;
        for(int i=0; i<secilenkelime.length();i++) {
        sorukelimesi[i] = secilenkelime.charAt(i);
        }
        Scanner s = new Scanner(System.in); 
        for(int i = 0;i<secilenkelime.length();i++)
        {gosterilendeger[i] = '*';}
       
        while(true){
            for(int j = 0;j<secilenkelime.length();j++)
            {System.out.print(gosterilendeger[j]+" ");}
            System.out.println("tahmininiz?");
            String girilen = s.next();
            char tahmin =girilen.charAt(0);
            LSearch(secilenkelime,tahmin);
            //System.out.print("Donen deger" +sorukelimesi +"Tahmin" + tahmin+" ");       
            if(buldum!=1 || girilen.length()>1){
                hata++;
                hatavar = true;
            }
            buldum = 0;
            if(hatavar)
                System.out.println(hata +" hata yaptınız, "+(3-hata)
                        +" hata yapma hakkınız kaldı");
             
            hatavar = false;
                if(hata==3){
                    System.out.println("Oyun bitti");
                    break;
                }
          if(dogru == sorukelimesi.length) {
              System.out.println("Oyun bitti tebrikler :)");
              break;
          }   
        }
        
        
        }
        else if(mod==1) {
            int elemanSayisi=kelimeler.length;
            System.out.println("Yeni kelime ekle");
            Scanner kelime = new Scanner(System.in);
            String kelimeyeni = kelime.next();
          
            for(int a=0; a<kelimeler.length; a++) {
            yeniDizi[a] = kelimeler[a]; //boş dizimize kelimeleri girdik
            } 
            
              
            for(int c=0; c<yeniDizi.length; c++) {
                
                if(yeniDizi[c]==null){
                    yeniDizi[c] = kelimeyeni;
                    elemanSayisi = c; System.out.println("yeniDizi[c] :" + yeniDizi[c]);
                    break;
                }
            }
              yeniKelimeDizi = new String[elemanSayisi+1]; //asıl kelime dizimiz (oyunda kullanılan)
             
             
            for(int c=0; c<yeniDizi.length; c++) {
                if(yeniDizi[c]!=null)  yeniKelimeDizi[c] =yeniDizi[c];//dizi atama işlemi
                else {
                   // yeniKelimeDizi[c] = kelimeyeni;
                   // elemanSayisi = c; 
                    break;
                }
            }
              for(int c=0; c<yeniKelimeDizi.length; c++) {
                  System.out.println("Yeni kelime dizi: "+ yeniKelimeDizi[c]);
            } 
              
              yeniArry = 1;
              System.out.println("yeni dizi güncellendi");
              
        }
            //dizi eşleme
            
            
            
         //kelimeler[kelimeler.length+1] = kelimeyeni
        
        }
        
        
      public static char LSearch(String secilenkelime,char tahmin) {
     char x = ' ';
       for(int i = 0;i<secilenkelime.length();i++){
                if(secilenkelime.charAt(i)==tahmin){
                  gosterilendeger[i] = tahmin;  
                 dogru++;
                 buldum = 1;
                  x= gosterilendeger[i]; 
       }else { x = '*';}
      }
return x;
}
}