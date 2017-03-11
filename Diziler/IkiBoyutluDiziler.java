/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikiboyutludiziler;

import static java.lang.Math.random;
import java.util.Scanner;

/**
 *
 * @author yakup
 */
public class IkiBoyutluDiziler {

    public static void main(String[] args) {
    // veriTipi [][] diziAdi = new veriTipi[satirSayisi][sutunSayisi]
    // ikiBoyutluDizi[a].length bize sutun sayısını verir. (a<=satir sayis olmalı).
    
    //İçeriğini bizim dolduracağımız 4e 3lük bir kodlayalım.
     Scanner scanner = new Scanner(System.in);
     int [][]ikiBoyutluDizi = new int[4][3];
 
        for (int satir = 0; satir < ikiBoyutluDizi.length; satir++) {
            for (int sutun = 0; sutun< ikiBoyutluDizi[satir].length; sutun++) {
                System.out.print("Gir :");
                ikiBoyutluDizi[satir][sutun] = scanner.nextInt();
            }
        }

        // İki for döngüsüyle matris içinde gezerek ekrana basıyoruz.
        for (int i = 0; i <ikiBoyutluDizi.length; i++) { // Satir
            for (int j = 0; j < ikiBoyutluDizi[i].length; j++) { // Sutun
                System.out.print(ikiBoyutluDizi[i][j]+" ");
            }
            System.out.println(" ");
        }
        
    }
    
}
