
package GUI;


public class cPembelian {
     private cPelanggan pelanggan;
 private cBarang barang;
 private String kode;
 cPembelian(String k, cPelanggan p, cBarang b){
 pelanggan=p;
 barang =b;
 kode=k;
 System.out.println("Object pembelian dibuat...");
 }
 public String ToString(){
 String t="";
 t=t+barang.getNama()+"\t";
 t=t+barang.getHarga()+"\n";
 return t;
 }
 public void setBarang(cBarang brg){
 barang=brg;
 }
 public void setPelanggan(cPelanggan plg){
 pelanggan=plg;
}
 public void setKode(String kd){
 kode=kd;
 }
 public cBarang getBarang(){
 return barang;
 }
 public cPelanggan getPelanggan(){
 return pelanggan;
 }
 public String getKode(){
  return kode;
}

}
