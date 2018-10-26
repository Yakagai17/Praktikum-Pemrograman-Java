/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Aganinggar
 */
public class CaseOf_Calender {
    public static void main(String[] args) throws IOException {
               
    int day     = 0;
    int mounth  = 0;
    int year    = 0;
    String nama_bulan = "";
    
    BufferedReader hari = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader bulan = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader tahun = new BufferedReader(new InputStreamReader(System.in));
    
        System.out.println("Program menampilkan Tanggalan :");
        System.out.print("Masukan Hari : ");  
        
        //masukan Hari
        do{
            try {
                day = Integer.parseInt(hari.readLine());
            } catch (IOException e) {
                System.out.println("Error, Input bukan angka!");
            }
        }while(day<0||day>31);
        
        //masukan Bulan
        System.out.print("Masukan Bulan : ");           
        do{
            try {
                mounth = Integer.parseInt(bulan.readLine());
            } catch (IOException e) {
                System.out.println("Error, Input bukan angka!");
            }
            System.out.println("Salah, Silahkan masukan angka Bulan 1-12");
        }while(mounth<0||mounth>12);
        
        switch (mounth){
            case 1:
                nama_bulan ="Januari";
                break;
            case 2:
                nama_bulan ="Februari";
                break;
            case 3:
                nama_bulan ="Maret";
                break;
            case 4:
                nama_bulan ="April";
                break;
            case 5:
                nama_bulan ="Mei";
                break;
            case 6:
                nama_bulan ="Juni";
                break;
            case 7:
                nama_bulan ="Juli";
                break;            
            case 8:
                nama_bulan ="Agustus";
                break;
            case 9:
                nama_bulan ="September";
                break;
            case 10:
                nama_bulan ="Oktober";
                break;
            case 11:
                nama_bulan ="November";
                break;
            case 12:
                nama_bulan ="Desember";
                break;
        
        //masukan Tahun
        }
        System.out.print("Masukan Tahun : ");           
        try {
            year = Integer.parseInt(tahun.readLine());
        } catch (IOException e) {
            System.out.println("Error, Input bukan angka!");
        }        

        System.out.println("Tanggal yang anda masukan adalah : "+day+" "+nama_bulan+" "+year);         
    } 
    
}
