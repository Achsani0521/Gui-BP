
package pUMKM;


public class cPembeli {
    private String nama;
     private String alamat;
     cPembeli (){
         System.out.println("constructor pembeli...");
     }
     cPembeli(String n){
         nama=n;
         System.out.println(nama+ " Dibuat...");
     }
     cPembeli(String n, String a){
         nama=n; alamat=a;
         System.out.println(nama + "["+alamat+"] dibuat...");
         
}
public String getNama(){return nama;}
public String getAlamat (){return alamat;}
}
