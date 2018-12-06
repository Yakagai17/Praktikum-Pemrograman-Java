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
public class Exception_Finally {
    public static void main(String[] args) {
        try {
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.setNim(null);            
        } catch (ExceptionHandling_Mahasiswa e) {
            System.out.print("Terjadi Error : ");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Pasti Dijalankan");
        }
    }
    
}
