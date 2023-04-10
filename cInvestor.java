/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author randy
 */
public class cInvestor {
    private String nama, kwn, alamat; //buat class reksadana untuk menampung jumlah reksadana yang dia miliki
    private int age;
    private double uang;
    cInvestor(String s, String k, String a, int u, boolean r){
       //r merupakan referral u => umur
       nama = s;
       kwn = k;
       alamat = a;
       age = u;
       if(r == true){
           uang = 25000;
       }
    }
    public void setNama (String s){
        nama = s;
    }
    public void setKwn (String s){
        kwn = s;
    }
    public void setAlamat (String s){
        alamat = s;
    }
    public void setAge (int i){
        age = i;
    }    
    public void setUang (double d){
        uang = d;
    }
    public String getNama(){
        return nama;
    }
    public String getKwn(){
        return kwn;
    }
    public String getAlamat(){
        return alamat;
    }
    public int getAge(){
        return age;
    }
    public double getMoney(){
        return uang;
    }
}
