/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pertemuan_III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Aganinggar
 */
public class Latihan_BufferReader {
    public static void main(String[] args) {
        //Input from console Interface
        /*BufferedReader dataMasukan = new BufferedReader(new InputStreamReader(System.in));
        String nama = "";
        System.out.print("Please input your name : ");
        try {
        nama = dataMasukan.readLine();
        } catch (IOException e) {
        System.out.println("Error!");
        }
        System.out.println("Hallo "+nama);*/
        
        LatihanInputPersegi();
    }
    
            //Inputan yang diubah type variabelnya.   
        public static void LatihanInputPersegi(){
            int panjang =0;
            int lebar =0;
            int luas =0;
            BufferedReader pjg = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader lbr = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Silahkan masukan ukuran Panjang (meter) : ");
            try {
                panjang = Integer.parseInt(pjg.readLine());
            } catch (IOException e) {
                System.out.println("Error masukan Panjang !");
            }
            
            System.out.print("Silahkan masukan ukuran Lebar (meter) : ");
            try {
                lebar = Integer.parseInt(lbr.readLine());
            } catch (IOException e) {
                System.out.println("Error masukan Lebar !");
            }
            
            System.out.println("Ukuran Panjang adalah : "+panjang);
            System.out.println("Ukuran Lebar adalah   : "+lebar);
            
            luas = panjang*lebar;
            System.out.println("Luas Bangun Tersebut adalah : "+luas+" (meter)");
        }

}
