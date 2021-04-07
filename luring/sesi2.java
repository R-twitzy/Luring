/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luring;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class sesi2 {
    
    public static void main(String[] args) {
         String input = JOptionPane.showInputDialog("Masukkan Jenis Kelamin = ");
         String nilai = JOptionPane.showInputDialog("Masukkan nilai = ");

         int nilai1 = Integer.parseInt(nilai);

         if (input.equalsIgnoreCase("l")|| nilai1>=90){
             JOptionPane.showMessageDialog(null, "Selamat anda diterima");
         }else{
         JOptionPane.showMessageDialog(null, "Maaf anda tidak diterima");
         }
    }
    
}
