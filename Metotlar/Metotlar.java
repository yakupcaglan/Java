/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metotlar;

/**
 *******************************************************************
 * @author yakup                                                   *
 * Java'da metotlar böl-parçala-yönet şeklinde kullanılırlar.      * 
 * Metotlar görevleri yerine getiren kod bloklarıdır.              *
 * Parametreli ve Paramatresiz metotlar olarak ikiye ayrılırlar.   *  
 *******************************************************************/
public class Metotlar {
    public static void main(String[] args) {
        int sayi1,sayi2,sonuc;
                
        parametresizMetot(); // Şeklinde mainde cağrılarak kullanılırlar.
        // Döndürülen sonuç bir değişkene atanır.
        sonuc = parametreliMetot_sayilariCarp(5,6); 
        System.out.println("Çarpım sonucu : "+sonuc);
        // Bir değişkene atılmadanda kullanılabilir. Okunabilirlik açısından tavsiye edilmez.
        System.out.println("Hoşgeldiniz , "+adiniYaz("Yakup"));
   
    }

//Parametresiz metotlar void ile başlar ve herhangi bir değer geriye döndürmezler
public static void parametresizMetot(){     
    System.out.println("Ben bir parametresiz metodum.");
        }
public static int parametreliMetot_sayilariCarp(int sayi1,int sayi2){
        return sayi1*sayi2;
    }
public static String adiniYaz(String ad){
     return ad;
    }
}
 
