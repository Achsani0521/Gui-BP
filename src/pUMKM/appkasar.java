
package pUMKM;

import java.util.Scanner;
public class appkasar {
    public static void main(String[]args){
        cProduk p = new cProduk();
        cProduk p2 = new cProduk("Sepatu", 150000 , 10);
        cPembeli pb = new cPembeli("Budi","Surabaya");
        cTransaksi tr = new cTransaksi();
        cPakaian pkn = new cPakaian();
        
        pkn.kode= "abc";
        Scanner sc = new Scanner(System.in);
        cProduk produk[]=new cProduk [3] ;
        produk[0]= new cProduk("Sepatu", 15000, 5);
        produk[1]= new cProduk("Sandal", 15000, 5);
        produk[2]= new cProduk("Tas", 15000, 5);
        
        
        
        int pilih =0;
        do{
            System.out.println("\nMENU APP");
            System.out.println("1. Produk ");
            System.out.println("2. Pembeli ");
            System.out.println("3. Transaksi ");
            System.out.println("4. Exit ");
            System.out.print("Pilih =  ");
            pilih = sc.nextInt();
            switch (pilih){
                case 1 :
                    System.out.println("<<Produk>>");
                    System.out.println(" 1. Tambah");
                    System.out.println(" 2. Ubah");
                    System.out.println(" 3. Hapus");
                    System.out.println(" 4. Detil ");
                    System.out.print("pilih = ");
                    int pilih2 =sc.nextInt();
                    switch (pilih2){
                        case 1 : 
                            System.out.print("  Nama = ");
                            String nm=sc.next();
                            System.out.print("  Harga = ");
                            int hg =sc.nextInt();
                            System.out.print("  Stok = ");
                            int st=sc.nextInt();
                            p2 = new cProduk (nm, hg, st);
                            break;
                        case 2 : 
                            System.out.print("Stok baru = ");
                            st=sc.nextInt();
                            System.out.println("Yakin ubah ? ");
                            System.out.println("1. Ya");
                            System.out.println("2. Batal");
                            System.out.println("Jawab = ");
                            int jwb=sc.nextInt();
                            if (jwb==1){
                                p2.setStok(st);
                                System.out.println("  Ubah stok berhasil...");
                            }else{
                                System.out.println("  Ubah stok batal ! ");
                            }
                            break;
                        case 3 :
                            System.out.print("  Nama = ");
                            nm=sc.next();
                            if (nm.equalsIgnoreCase(p2.getNama())){
                                System.out.println("Yakin hapus ? ");
                                System.out.println("1. Ya");
                                System.out.println("2. Tidak");
                                System.out.print("Jawab = ");
                                jwb=sc.nextInt();
                                if(jwb==1){
                                p2=null;
                                System.out.println("Hapus sukses..");
                            }else{
                                System.out.println("Produk tidak ada !");
                            }
                            }
                            break;
                        case 4 : 
                            if (p2!=null)
                            System.out.println(p2.ToString());
                            else System.out.println("Object Kososng! ");
                    }
                    
                    break;
                case 2 : 
                    System.out.println("<<Pembeli>>");
                    break;
                case 3 :
                    System.out.println("<<TRANSAKSI>>");
                    System.out.println("    1. Tambah");
                    System.out.println("    2. Ubah");
                    System.out.println("    3. Hapus");
                    System.out.println("    4. Cetak");
                    System.out.print("    Pilih = ");
                    pilih2=sc.nextInt();
                    switch (pilih2){
                        case 1: 
                            System.out.print("Nama  = ");
                            String n=sc.next();
                            pb = new cPembeli(n);
                            tr.setPembeli(pb);
                            String pr;
                            int j, pilih3=1;
                            do {
                                System.out.println("Produk");
                                System.out.println("1. sepatu");
                                System.out.println("2. sandal");
                                System.out.println("3. tas");
                                System.out.println("4. Selesai ");
                                System.out.print("Pilih = ");
                                pilih3=sc.nextInt();
                                switch (pilih3){
                                    case 1 :
                                        System.out.println("Jumlah... ");
                                        tr.tambahProduk(produk[0]);
                                        System.out.println("Tambah Sukses....");
                                        break;
                                    case 2 :
                                         tr.tambahProduk(produk[1]);
                                        System.out.println("Tambah Sukses....");
                                        break;
                                    case 3 :
                                         tr.tambahProduk(produk[2]);
                                        System.out.println("Tambah Sukses....");
                                        break;
                                    case 4 : 
                                        System.out.println("Kembali...");
                                        break;
                                }
                            }while(pilih3!=4);
                            
//                            System.out.print("Produk  = ");
//                            String pr = sc.next();
//                            System.out.print("Jumlah  = ");
//                            int j= sc.nextInt();
//                            if (pr.equalsIgnoreCase(p2.getNama())){
//                                
//                                int t = j*p2.getHarga();
//                                tr.setPembeli(pb);
//                                tr.setProduk(p2);
//                                tr.setJumlah(j);
//                                tr.setTotal(t);
//                                System.out.println("Transaksi sukses..");
//                            }
                            break;
                        case 2: 
                             //dikasih if kalau pr null maka program akan kembali
                            System.out.print("Nama Produk = ");
                            pr = sc.next();
                            for (int i = 0; i < tr.getidxprd(); i++) {
                                
                                if (pr.equalsIgnoreCase(tr.getProduk()[i].getNama())){
                                    System.out.println("Jumlah Baru = ");
                                j = sc.nextInt();
                                    System.out.println("Apakah Yakin diubah ? ");
                                    System.out.println("1. ya\n2. batal");
                                    System.out.println("Jawab = ");
                                    int jwb= sc.nextInt();
                                    if(jwb==1){
                                        tr.setJumlah(j);
                                        tr.setTotal(j*tr.getProduk()[i].getHarga());
                                        System.out.println("Ubah sukses...");
                                        break;
                                    }else System.out.println("Ubah Batal...");
                                }else System.out.println("Produk Tidak ada !");
                            }
                                break;
                        case 3:
                            System.out.print("Nama Produk = ");
                            pr=sc.next();
                            tr.hapusproduk(pr);
                            break;
                        case 4:
                            if (tr!=null){
                                System.out.println("pembeli : " + tr.getPembeli().getNama());
                                tr.lihatTransaksi();
                                //System.out.println("Produk  : "+tr.getProduk().getNama());
                                //System.out.println("jumlah  : "+tr.getJumlah());
                                //System.out.println("Harga   : "+tr.getProduk(). getHarga());
                                //System.out.println("Total   : "+ tr.getTotal());
                                
                                
                            }
                            break;
                            
                    }
                    
                    break;
                case 4 :
                    System.out.println("Terima Kasih...");
            }
        }while(pilih!=4);
        
    }
    
}
