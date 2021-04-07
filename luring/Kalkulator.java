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
public class Kalkulator {
     public static void main(String[] args) {
         int input1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai1 = "));
         
         int input2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai2 = "));
         
         JOptionPane.showMessageDialog(null, "Hasil Penjumlahan = "+ (input1+input2));
         JOptionPane.showMessageDialog(null, "Hasil Perkalian = "+ input1*input2);
         }
}
