/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_V;

/**
 *
 * @author Aganinggar
 */
public class ArrayAcess {
    public static void main(String[] args) {
       int [] Larik = new int [10];
        for(int i=0; i<10;i++){
            System.out.println(Larik[i]);
            
            //ArrayLength();
            //ArrayMultiDimention();
        } 
    }
    //Panjang Array
    /*public static void ArrayLength() {
        int [] Larik = new int [10];
        for(int i=0; i<Larik.length;i++){
            System.out.println(Larik[i]);
        }
    }
    */
    
    //Array MultiDimensi
    /*
    public static void ArrayMultiDimention() {
     // Elemen 512 x 128 dari integer array
    int[][] twoD = new int[512][128];
    // karakter array 8 x 16 x 24
    char[][][] threeD = new char[8][16][24];
    
    // String array 4 baris x 2 kolom
    String[][] dogs = {{ "terry", "brown" },
                       {"Kristin", "white" },
                       {"toby", "gray"},
                       {"fido", "black"}
                      };
    System.out.print( dogs[0][0] ); 
    }
    */
}
