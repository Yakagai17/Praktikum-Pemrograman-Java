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
public class Latihan_Switch {
    public static void main(String[] args) {
        
        int grade = 92;
        switch (grade) {
            case 100:
                System.out.println("Excelent ");
                break;
            case 90:
                System.out.println("Good Job ");
                break;
            case 80:
                System.out.println("Study Harder ");
            default:
                System.out.println("Sorry, you failed ");
        }
    }    
}
