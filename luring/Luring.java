/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luring;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Luring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Masukkan angka 1 sampai 5");
        Scanner input = new Scanner (System.in);
        String Hasil = input.nextLine();
        int Hasil1 = Integer.parseInt(Hasil);
       if(Hasil1 == 1){
           System.out.println("Tulungagung");
       }else if(Hasil1==2) {
           System.out.println("Blitar");
       }else if(Hasil1==3) {
           System.out.println("Malang");
       }else if(Hasil1==4) {
           System.out.println("Kediri");
       }else if(Hasil1==5) {
           System.out.println("Jombang");
       }else{
           System.out.println("Inputan salah");
       }

    }
    
}
