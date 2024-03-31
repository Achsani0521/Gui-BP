
package pUMKM;

import javax.swing.*;
public class cobacoba {
     public static void main(String[]args){
           JFrame jf = new JFrame();
 System.out.println("Mulai GUI");
 String nama = JOptionPane.showInputDialog(jf, 
 "Masukkan Nama");
 String thn = JOptionPane.showInputDialog(jf, 
 "Masukkan Tahun Lahir");
 int t = Integer.parseInt(thn);
 int umur = 2021 - t;
     JOptionPane.showMessageDialog(jf, nama+" –"+umur+" tahun");
 jf.dispose();
 System.out.println("Selesai GUI");
     
     }
}
