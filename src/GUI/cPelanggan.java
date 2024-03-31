
package GUI;


public class cPelanggan {
    private String id,nama;
 private String alamat;
 cPelanggan(String kd, String n, String a){
 id=kd; nama=n; alamat=a;
 System.out.println("Object pelanggan dibuat...");
 }
 public void setNama(String nm){
 nama=nm;
 }
 public void setID(String i){
 id=i;
 }
 public void setAlamat(String al){
 alamat=al;
 }
 public String getNama(){
 return nama;
 }
public String getID(){
 return id;
 }
 public String getAlamat(){
 return alamat;
 }

}
