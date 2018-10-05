/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aganinggar
 */
public class BiggestNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 23;
        int num3 = 5;
        int bigest;

        bigest = num1;

        if (bigest<num2){
            bigest = num2;
            }
        if (bigest<num3){
            bigest= num3;
            }
        
System.out.println("number 1 = " + num1);
System.out.println("number 2 = " + num2);
System.out.println("number 3 = " + num3);
System.out.println("Nilai tertingginya adalah angka = " + bigest);
    }
}
