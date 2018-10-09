/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_IV;

/**
 *
 * @author Aganinggar
 */
public class LatihanLabeledStatmentContinue {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Inside for(j) loop ");
                    if (j==2) continue outerLoop;                   
            }
            System.out.println("Inside for(i) Loop");
        }
    }    
}
