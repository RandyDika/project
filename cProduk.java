/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author randy
 */
public class cProduk {
    private String nama, jp;
    private double hargaPerUnit, minPem;
    //rtn dalam persentase per tahun;
    //minPem = minimum pembelian;
    //jp = jenis produk
    cProduk(){
        hargaPerUnit = 1000;
        minPem = 5000;
    }
    public void setNama(String s){
        nama = s;
    }
    public void setJp(String s){
        jp = s;
    }
    public void setHarga(double d){
        hargaPerUnit = d;
    }
    public void setNama(double d){
        minPem = d;
    }
    public String getNama(){
        return nama;
    }
    public String getJp(){
        return jp;
    }
    public double getHarga(){
        return hargaPerUnit;
    }
    public double getMinPem(){
        return minPem;
    }
    public String beli(String n, double u){
        String text;
        if(u > minPem){
            double unit = u/hargaPerUnit; //potensi untuk dibuatkan kelas
            text = "Investor " + n + " membeli produk " + nama + "sebanyak " + unit;
        }else{
            text = "Uang anda tidak cukup";
        }
        return text;
    }
    
    
}
