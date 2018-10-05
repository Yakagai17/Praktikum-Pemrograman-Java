/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Pertemuan_III;

import java.util.Scanner;
/**
 *
 * @author Aganinggar
 */
public class Perihitungan_InputScanner {
    
    public static void main(String[] args) {
    
    Scanner inputNumber = new Scanner(System.in);
    int rata = 0;
    
    System.out.println("Masukan 3 Angka yang ingin anda cari rata-ratanya !");
    System.out.print("Number 1      : ");
    int num1 = inputNumber.nextInt();
    System.out.print("Number 2      : ");
    int num2 = inputNumber.nextInt();
    System.out.print("Number 3      : ");
    int num3 = inputNumber.nextInt();
    
    rata=(num1+num2+num3)/3;
    System.out.println("Rata-rata     : "+rata);
    
    }

    
    
}
