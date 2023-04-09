/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author randy
 */
import java.util.Scanner;
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        cInvestor inv = null;
        cProduk prd = null;
        int pilih, pilih2;
        
        do{
            System.out.println("SELAMAT DATANG DI APLIKASI BOBOT");
            System.out.println("================================");
            System.out.println("TEMPATNYA INVESTASI BODONG");
            System.out.println("\nMENU BOBOT");
            System.out.println("1. Investor");
            System.out.println("2. Beli Produk");
            System.out.println("3. Exit");
            pilih = sc.nextInt();
            System.out.println("");
            switch(pilih){
                case 1: //coba beri perintah do
                    do{
                    System.out.println("Sub Menu Investor");
                    System.out.println("1. Tambah Investor");
                    System.out.println("2. Hapus Investor");
                    System.out.println("3. Update Data");
                    System.out.println("4. Cetak Data");
                    System.out.println("5. Query");
                    System.out.println("Pilih : ");
                    pilih2 = sc.nextInt();
                    switch(pilih2){
                        case 1:
                            System.out.println("1. Menu Tambah Investor");
                            System.out.println("Masukkan Nama : ");
                            String nama = sc.next();
                            System.out.println("Masukkan Kewarganegaraan : ");
                            String kwn = sc.next();
                            System.out.println("Masukkan Alamat : ");
                            String alamat = sc.next();
                            System.out.println("Masukkan Umur : ");
                            int age = sc.nextInt();
                            System.out.println("Apakah anda memiliki referral code? : ");
                            System.out.println("yes/no : ");
                            String ans = sc.next();
                            if(ans == "yes"){
                                inv = new cInvestor(nama, kwn, alamat, age, true);
                                System.out.println("Data berhasil terdaftar");
                            }else{
                                inv = new cInvestor(nama, kwn, alamat, age, false);
                                System.out.println("Data berhasil terdaftar");
                            }
                            break;
                        case 2:
                            System.out.println("2. Menu Hapus Investor");
                            System.out.println("Masukkan Nama : ");
                            sc = new Scanner(System.in);
                            nama = sc.nextLine();
                            if(nama != null && inv.getNama().equalsIgnoreCase(nama)){
                                System.out.println("Data ditemukan");
                                System.out.println("Apakah data akan dihapus?"); //ganti sistem pake angka
                                ans = sc.next();
                                String s1 = "yes";
                            if(ans.equalsIgnoreCase(s1)){
                                inv = null;
                                System.out.print("Data dihapus");
                                for(int i=0; i<3; i++){
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                }
                            }else{
                                System.out.println("Data batal dihapus");
                            }
                            }else{
                                System.out.println("Data tidak ditemukan");
                            }
                            break;
                }
                break;
                }while(pilih2!=3);
                    
            }
        }while(pilih!=4);
        
        
        
    }
    
}
