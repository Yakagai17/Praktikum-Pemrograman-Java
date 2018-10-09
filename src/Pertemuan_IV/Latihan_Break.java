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
public class Latihan_Break {
     public static void main(String[] args) {
        String names[] = {"Beah","Bianca","Lance","Belle","Nico","Yza","Gem","Ethan"};
        String searchName = "Yza";
        boolean found = false;
        
        for (String name : names) {
            if (name.equals(searchName)) {
                found = true;
                break;
            }
        }
        
        if (found) {
           System.out.println(searchName+" = Found");
        }
        else{
            System.out.println(searchName+" = Not Found");
        }
    }   
}
