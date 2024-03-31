
package pUMKM;


public class cProduk {
    //data
    private String nama;
    protected String kode;
    private int harga;
    public int stok;
    //method
    cProduk(){
        System.out.println("Constructor default...");
    }
    cProduk(String n, int h, int s){
        nama=n; harga=h; stok=s;
        System.out.println("Objek "+ nama +" Dibuat...");
    }
    public void setHarga(int h){harga=h;}
    public void setStok(int s){stok=s;}
    public String getNama(){return nama;}
    public int getHarga(){return harga;}
    public int getStok (){return stok;}
    public String ToString(){
    return nama +" Harga : "+ harga +" stok : "+stok;
    }
}

