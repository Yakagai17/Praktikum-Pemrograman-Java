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
public class MatriksArray {
    public static void main(String[] args) {
       
        int [][] matrik2Dimension = {{10,14,0,1},{12,1,3,5},{4,25,35,50},{0,0,9,10}};
        for (int[] matrik2Dimension1 : matrik2Dimension) {
            System.out.print("| ");
            for (int j = 0; j < matrik2Dimension.length; j++) {
                System.out.print(matrik2Dimension1[j] + " ");
            }
            System.out.println("|");
        }
    }
    

}
    