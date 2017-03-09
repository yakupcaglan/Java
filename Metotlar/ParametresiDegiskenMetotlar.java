/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parametresi.degisken.metotlar;

/********************************************************************************
 * @author yakup                                                                *
 * Parametre sayısı belli olmayan metot yazmak için veri tipi yazıldıktan sonra *
 * üç nokta konur. Bu şekilde verilen paramtre sayısına göre bir diziymiş gibi  * 
 * davranılır.                                                                  *
 ********************************************************************************/
public class ParametresiDegiskenMetotlar {
    public static void main(String[] args) {
      
        sayilariCarp(9,3);
        sayilariCarp(75,28,37,42);
        
    }
public static void sayilariCarp(int... sayilar){ // Sanki sayilar adında bir dizi oluşturulmuş gibi düşünülebilir.
    int carpim=1;
    for(int i:sayilar)
        {   
            carpim*=i;
            }
    System.out.println("Carpim sonucu :"+carpim);
    }
}
