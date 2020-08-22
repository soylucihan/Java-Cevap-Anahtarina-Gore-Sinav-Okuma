package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Homework {

    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
       
        System.out.println("cevap anahtarı gir");
        String anahtar=s.next();
        String ad="";
        String soyad="";
        String o="";
        int puan=0;
        Map<String,Integer> isimnot = new HashMap<String, Integer>();
        Map<String,Integer> ortu = new HashMap<String, Integer>();
        Map<Integer,Integer> kar = new HashMap<Integer, Integer>();
        Map<Integer,String> adlar = new HashMap<Integer, String>();
      int toplam=0;
     for(int i=0;i<3;i++){
         System.out.println("ad gir");
         ad=s.next();
         System.out.println("soyad gir");
         soyad=s.next();
         System.out.println("cevap gir");
         o=s.next();
         
         String[] dizic=new String[10];
         String[] dizi=new String[10];
         for(int e=0;e<10;e++){
             dizi[e]=anahtar.substring(e,e+1);
             dizic[e]=o.substring(e,e+1);
             
         }
         for(int k=0;k<10;k++){
             
             if(dizi[k].equals(dizic[k])==true){
                 puan+=10;
             }
         }
         isimnot.put(ad+","+soyad, puan);
         kar.put(i, puan);
         adlar.put(i,ad+","+soyad);
         toplam+=puan;
         puan=0;
         
         
     }
     int ortalama=toplam/5;
     for(int y=0;y<isimnot.size();y++){
         if(kar.get(y)>ortalama){
             ortu.put(adlar.get(y),isimnot.get(adlar.get(y)));
             
         }
         
     }
        System.out.println("Notlar= "+String.valueOf(isimnot));
        System.out.println("ortalama= "+ortalama);
        System.out.println("ortalamayı geçen ögrenciler *** "+ortu);
        
        
    }
}
