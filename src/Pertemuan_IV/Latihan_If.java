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
public class Latihan_If {
    public static void main(String[] args) {
        double  grade = 92.00;
        if (grade>=90) {
            System.out.println("Excelent !!");
        }
        else if ((grade<90)&&(grade>80)) {
            System.out.println("Good Job !!");
        }
        else if ((grade<80)&&(grade>60)) {
            System.out.println("Study Harder !!");
        }
        else  {
            System.out.println("Sorry you failed !!");
        }
    }    
}
