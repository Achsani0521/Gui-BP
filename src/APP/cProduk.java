/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APP;

import java.util.Arrays;

public class cProduk {
    // data
    private String namaProduk;
    private int hargaProduk, stokProduk;

    // constructor
    cProduk() {
        System.out.println("Telah Dibuat");
    }

    cProduk(String n, int s, int h) {
        namaProduk = n;
        hargaProduk = h;
        stokProduk = s;
        System.out.println("Objek " + namaProduk + " Dibuat");
    }

    // method

    // untuk mengedit suatu harga Produk
    public void setHargaProduk(int h) {
        hargaProduk = h;
    }

    // untuk mengedit suatu stok Produk
    public void setStokProduk(int s) {
        stokProduk = s;
    }

    // getter untuk mengambil suatu data
    public String getNamaProduk() {
        return namaProduk;
    }

    public int getHargaProduk() {
        return hargaProduk;
    }

    public int getStokProduk() {
        return stokProduk;
    }

    public String ubahMenjadiKalimat() {
        return namaProduk + "   Stok :  " + stokProduk + "     Rp.     " + hargaProduk;
    }

}