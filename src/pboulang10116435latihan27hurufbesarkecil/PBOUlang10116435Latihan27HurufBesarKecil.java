/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang10116435latihan27hurufbesarkecil;
import java.util.Scanner;

/**
 *
 * @author Luthfi
 * NAMA : Luthfi Aziz Al PAqih
 * NIM  : 10116435
 */
public class PBOUlang10116435Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cbr ;
        
                
          System.out.print("Masukkan Kalimat : " );
        Scanner sc = new Scanner (System.in);
        cbr = sc.nextLine();
          
          System.out.println("\n"+"====Hasil Fomatting====");
          System.out.println("Huruf Besar :  " + cbr.toUpperCase());
          System.out.println("Huruf Kecil :  " + cbr.toLowerCase());
    
    }
    
}
