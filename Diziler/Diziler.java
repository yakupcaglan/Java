/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziler;

/****************************************************************************
 * @author yakup                                                            *
 * Dizilerin nasıl kullanılır? Dizilere değer atama.Döngüler içersinde      *
 * müdahale etme ve gelişmiş for döngüsüyle diziler hakkında bilgiler içerir*
 ****************************************************************************/
public class Diziler {

  
    public static void main(String[] args) {
       // Tanım 1
       // veriTipi [] diziAdı = new veriTipi[Elaman Sayısı]
       // int tipinde 5 elanlı dizi oluşturalım.
         int [] sayilar = new int[5];
       
       // Tanım 2
       // Dizi tanımlanırken elamanları belirleyebiliriz.
       int [] sayilar2 = {4,8,10,20};
       // Dizi elamanlarına değiştirebiliriz.
      
     
       
       // Dizi uzunluğuna diziAdi.length komutu ile ulaşabiliriz.
       // Bir dizi elamanlarına sırayla ulaşmanın en güzel yolu gelişmiş for döngüsüdür.
       for(int i:sayilar2)
                System.out.println(i);
       
     sayilar2[3] = 5;
     System.out.println("Dizin 4. elamanı: "+sayilar2[3]); // Görüldüğü üzere değer değişti.
     
     // Bir for döngüsü ile diziye elaman atayalım
      int yeniDizi[] = new int[6]; //6 elamanlı bir dizi oluşturduk.
        for (int i = 0; i < yeniDizi.length; i++) {
            yeniDizi[i]=i*2; // sırayla her bir elaman 2 ile çarptık.
            System.out.println("Dizinin "+(i+1)+". Elamanı"+yeniDizi[i]);
        }

    }
    
}
