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
public class Exception_Throwable {
    public static void main(String[] args) {
        try {
            int a =10;
            int b =0;
            int c =10/b;
            System.out.println(c);
        } catch (Throwable e) {
            System.out.print("Ups terjadi error : ");
            System.out.println(e.getMessage());
        }
    }
    
}
