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
public class Exception_Handling_Test {
    public static void main(String[] args) {
        try {
            System.out.println(args[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Expection Caught !!");
        }
    }
    
}
