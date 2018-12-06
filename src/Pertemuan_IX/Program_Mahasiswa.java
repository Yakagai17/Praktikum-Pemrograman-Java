/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_IX;

/**
 *
 * @author Aganinggar
 */
public class Program_Mahasiswa {
    public static void main(String[] args) {
        try {
            Mahasiswa mahasiswa1 = new Mahasiswa();
            mahasiswa1.setNim(null);
        } catch (ExceptionHandling_Mahasiswa e) {
            System.out.print("Ups terjadi error : ");
            System.out.println(e.getMessage());
        }
    }
    
}
