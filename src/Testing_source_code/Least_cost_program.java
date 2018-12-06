/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing_source_code;
import java.util.Scanner;
import java.util.Arrays; 
import java.util.Collections; 
/**
 *
 * @author Aganinggar
 */
public class Least_cost_program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j;        
        int[] supply, demand;
        int[][] cost;
        int[][] value;
        int total_sup, total_dem, total_cost=0;
        
        System.out.println("Masukan Jumlah Supplay dan Demand : ");
        j = input.nextInt();
        
        supply = new int[j];
        demand = new int[j];
        cost = new int[j][j];
        value = new int[j][j];
        
        System.out.println("===================== Nilai Supplay =====================");
        for (int i = 0; i < j; i++) {
            System.out.println("Masukan Nilai Supplay ke-"+i+" : ");
            supply[i] = input.nextInt();
        }
        total_sup = jumlahSupDem(supply);
        
        
        System.out.println("===================== Nilai Demand =====================");
        for (int i = 0; i < j; i++) {
            System.out.println("Masukan Nilai Denabd ke-"+i+" : ");
            demand[i] = input.nextInt();
        }
        total_dem = jumlahSupDem(demand);
        
        for (int i = 0; i < j; i++) {
            for (int k = 0; k < j; k++) {
                System.out.println("Masukan Cost untuk Supplay ke-"+i+" dan Demand ke-"+j+" : ");
                cost[i][k] = input.nextInt();
            }
        while ((total_sup!=0)&&(total_dem!=0)) {                
            for (int k = 0; k < j; k++) {
                for (int l = 0; l < j; l++) {
                    
                }
            }
        }
        
            
        }
        
    }
    
        public static int jumlahSupDem(int[] sup){
        int total = 0;
        for(int num:sup){
            total +=num;
        }       
        return total;
    }

        
}
