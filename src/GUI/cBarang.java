
package GUI;


public class cBarang {
     private String kode,nama, harga;
 cBarang(){
 nama=""; harga=""; kode="";
 System.out.println("Object barang dibuat...");
 }
 cBarang(String k, String n, String h){
 kode=k; nama=n; harga=h;
 System.out.println("Object barang dibuat...");
 }
 public void setNama(String nm){
 nama=nm;
 }
 public void setKode(String kd){
 kode=kd;
 }
 public void setHarga(String h){
 harga=h;
 }
 public String getNama(){
 return nama;
 }
 public String getKode(){
 return kode;
 }
 public String getHarga(){
 return harga;
 }

}
