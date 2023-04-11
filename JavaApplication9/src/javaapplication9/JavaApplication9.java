package javaapplication9;


import java.util.Scanner;
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        cUser user = null;
        cProduk prd1 = new cProduk("Sucorinvest Money Market Fund", "Pasar Uang", 2000, 100000);
        cProduk prd2 = new cProduk("Batavia Dana Kas Maxima", "Pasar Uang", 1500, 10000);
        cProduk prd3 = new cProduk("Manulife Obligasi Unggulan", "Obligasi", 1000, 50000);
        cProduk prd4 = new cProduk("ABF Indonesia Bond Index Fund", "Obligasi", 800, 20000);
        cProduk prd5 = new cProduk("BNI-AM Indeks IDX30", "Saham", 1200, 30000);
        int pilih, pilih2;
        
        do
        {
            System.out.println("SELAMAT DATANG DI APLIKASI BOBOT");
            System.out.println("================================");
            System.out.println("TEMPATNYA INVESTASI BODONG");
            System.out.println("\nMENU BOBOT");
            System.out.println("1. Akun");
            System.out.println("2. Beli Produk");
            System.out.println("3. Top Up");
            System.out.println("4. Exit");
            pilih = sc.nextInt();
            System.out.println("");
            switch(pilih)
            {
                case 1: //coba beri perintah do
                    System.out.println("Sub Menu Akun");
                    System.out.println("1. Registrasi Akun");
                    System.out.println("2. Hapus Akun");
                    System.out.println("3. Update Data Akun");
                    System.out.println("4. Cetak Data");
                    System.out.println("5. Cek Saku Akun");
                    System.out.println("6. Exit");
                    System.out.println("Pilih : ");
                    pilih2 = sc.nextInt();
                    switch(pilih2)
                    {
                        case 1:
                            if(user == null)
                            {
                                System.out.println("1. Menu Registrasi Akun");
                                System.out.println("Masukkan Nama : ");
                                String nama = sc.next();
                                System.out.println("Masukkan Kewarganegaraan : ");
                                System.out.println("1. WNI");
                                System.out.println("2. WNA");
                                String kwn = null; 
                                int ans = sc.nextInt();
                                switch(ans){
                                    case 1:
                                        kwn = "WNI";
                                        break;
                                    case 2:
                                        kwn = "WNA";
                                        break;
                                }                                
                                System.out.println("Masukkan Alamat : ");
                                String alamat = sc.next();
                                System.out.println("Masukkan Umur : ");
                                int age = sc.nextInt();
                                System.out.println("Apakah anda memiliki referral code? : ");
                                System.out.println("1. Yes : ");
                                System.out.println("2. No");
                                ans = sc.nextInt();
                                switch(ans)
                                {
                                    case 1:
                                        user = new cUser(nama, kwn, alamat, age, true);
                                        System.out.println("Data berhasil terdaftar");
                                        for(int i=0; i<2; i++)
                                        {
                                            Thread.sleep(1000);
                                            System.out.print(".");
                                        }    
                                        System.out.println("\n");   
                                        break;
                                    case 2:
                                        user = new cUser(nama, kwn, alamat, age, false);
                                        System.out.println("Data berhasil terdaftar");
                                        for(int i=0; i<2; i++)
                                        {
                                            Thread.sleep(1000);
                                            System.out.print(".");
                                        }    
                                        System.out.println("\n");   
                                        break;
                                }
                            }else
                            {
                                System.out.println("Maaf anda hanya dapat mendaftar satu akun");
                                System.out.println("\n");
                            }
                            break;
                        case 2:
                            System.out.println("2. Menu Hapus Akun");
                            System.out.println("Masukkan Nama : ");
                            sc = new Scanner(System.in);
                            String nama = sc.nextLine();
                            if(nama != null && user.getNama().equalsIgnoreCase(nama))
                            {
                                System.out.println("Data ditemukan");
                                System.out.println("Apakah data akan dihapus?"); //ganti sistem pake angka
                                System.out.println("1. Yes : ");
                                System.out.println("2. No");
                                int ans = sc.nextInt();
                                switch(ans)
                                {
                                    case 1:
                                        user = null;
                                        System.out.print("Data dihapus");
                                        for(int i=0; i<3; i++)
                                        {
                                            Thread.sleep(1000);
                                            System.out.print(".");
                                        }
                                        System.out.println("\n");
                                        break;
                                    case 2:
                                        System.out.println("Data batal dihapus");
                                        System.out.println("\n");
                                        break;
                                }
                            }
                            else
                            {
                                System.out.println("Data tidak ditemukan");
                                System.out.println("Mengarahkan kembali ke menu utama");                                
                                for(int i=0; i<2; i++)
                                {
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                }                                     
                            }
                            break;
                        case 3:
                            try 
                            {
                                System.out.println("3. Menu Update Data Akun");
                                System.out.println("Masukkan Nama : ");
                                sc = new Scanner(System.in);
                                nama = sc.nextLine();
                                if(nama != null && user.getNama().equalsIgnoreCase(nama))
                                {
                                    System.out.println("Data ditemukan");
                                    System.out.println("Data apa yang akan di Update?"); //ganti sistem pake angka
                                    System.out.println("1. Nama");
                                    System.out.println("2. Kewarganegaraan");
                                    System.out.println("3. Alamat");
                                    System.out.println("4. Umur");
                                    System.out.println("5. Exit");
                                    int ans = sc.nextInt();
                                    switch(ans)
                                    {
                                        case 1:
                                            System.out.println("Masukkan nama baru");
                                            nama = sc.next();
                                            user.setNama(nama);
                                            System.out.print("Data dirubah");
                                            for(int i=0; i<3; i++)
                                            {
                                                Thread.sleep(1000);
                                                System.out.print(".");
                                            }
                                            System.out.println("\n");
                                            break;
                                        case 2:
                                            System.out.println("Masukkan kewarganegaraan baru");
                                            System.out.println("1. WNI");
                                            System.out.println("2. WNA");
                                            String kwn = null; 
                                            int jwb = sc.nextInt();
                                            switch(jwb){
                                                case 1:
                                                    kwn = "WNI";                                            
                                                    break;
                                                case 2:
                                                    kwn = "WNA";
                                                    break;
                                            }
                                            user.setKwn(kwn);
                                            System.out.print("Data dirubah");                                                   System.out.print("Data dirubah");
                                            for(int i=0; i<3; i++)
                                            {
                                                Thread.sleep(1000);
                                                System.out.print(".");
                                            }
                                            System.out.println("\n");
                                            break;
                                        case 3:
                                            System.out.println("Masukkan alamat baru");
                                            String alamat = sc.next();
                                            user.setAlamat(alamat);
                                            System.out.print("Data dirubah");
                                            for(int i=0; i<3; i++)
                                            {
                                                Thread.sleep(1000);
                                                System.out.print(".");
                                            }
                                            System.out.println("\n");
                                            break;
                                        case 4:
                                            System.out.println("Masukkan umur baru");
                                            int umur = sc.nextInt();
                                            user.setAge(umur);
                                            System.out.print("Data dirubah");
                                            for(int i=0; i<3; i++)
                                            {
                                                Thread.sleep(1000);
                                                System.out.print(".");
                                            }
                                            System.out.println("\n");
                                            break;
                                        case 5:
                                            System.out.println("Mengarahkan kembali ke menu utama");                                
                                            for(int i=0; i<2; i++)
                                            {
                                                Thread.sleep(1000);
                                                System.out.print(".");
                                            }    
                                            System.out.println("\n");                      
                                                break;                                                
                                        
                                    }
                                }
                                else
                                {
                                    System.out.println("Data tidak ditemukan");
                                }

                                
                            } catch (Exception e) 
                            {
                                System.out.println("Tidak ada data akun");
                                System.out.println("Mengarahkan kembali ke menu utama");                                
                                for(int i=0; i<2; i++)
                                {
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                }    
                                System.out.println("\n");
                            }

                            break; 
                        case 6:
                        System.out.println("Mengarahkan kembali ke menu utama");                                
                        for(int i=0; i<2; i++)
                        {
                            Thread.sleep(1000);
                            System.out.print(".");
                        }    
                        System.out.println("\n");                      
                            break;
                    }
                    break;
                          
            }
        }while(pilih!=4);
        
        
        
    }
    
}
