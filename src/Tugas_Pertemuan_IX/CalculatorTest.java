/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Pertemuan_IX;
import java.util.Scanner;
/**
 *
 * @author Aganinggar
 */
public class CalculatorTest {
    public static void main(String[] args) {
       
        int pil, sub_pil;
        double a,b;
        CalculaorService cal_sed = new CalculatorBeras();
        CalculatorAdvanceService cal_adv = new CalculatorBagus();
        
        Scanner input = new Scanner(System.in);
        
        do {
            menu_calculator();
            pil = input.nextInt();  

            
            switch (pil) {
                case 1:
                    System.out.print("Masukan nilai ke-1 : ");
                    a = input.nextDouble();
                    System.out.print("Masukan nilai ke-2 : ");
                    b = input.nextDouble();
                    System.out.println("Hasil : "+cal_sed.Ping(a, b));
                    break;
                case 2:
                    System.out.print("Masukan nilai ke-1 : ");
                    a = input.nextDouble();
                    System.out.print("Masukan nilai ke-2 : ");
                    b = input.nextDouble();
                    System.out.println("Hasil : "+cal_sed.Po(a, b));
                    break;
                case 3:
                    System.out.print("Masukan nilai ke-1 : ");
                    a = input.nextDouble();
                    System.out.print("Masukan nilai ke-2 : ");
                    b = input.nextDouble();
                    System.out.println("Hasil : "+cal_sed.Lan(a, b));
                    break;
                case 4:
                    System.out.print("Masukan nilai ke-1 : ");
                    a = input.nextDouble();
                    System.out.print("Masukan nilai ke-2 : ");
                    b = input.nextDouble();
                    System.out.println("Hasil : "+cal_sed.Do(a, b));
                    break;
                case 5:
                    menu_advCalculator();
                    sub_pil = input.nextInt();
                    switch (sub_pil) {
                        case 1:
                            System.out.print("Masukan nilai ke-1 : ");
                            a = input.nextDouble();
                            System.out.println("Hasil : "+cal_adv.Akar(a));
                            break;
                        case 2:
                            System.out.print("Masukan nilai ke-1 : ");
                            a = input.nextDouble();
                            System.out.print("Masukan nilai ke-2 : ");
                            b = input.nextDouble();
                            System.out.println("Hasil : "+cal_adv.Pangkat(a,b));
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Masukan Pilihan [1...3]");
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Masukan Pilihan [1...6]");
            }
            
        } while (pil!=6);
        
    }
    
    public static void menu_calculator(){
        System.out.println(">>>> Consloe Calcultor Application <<<<");
        System.out.println("=======================================");
        System.out.println("             Daftar Menu               ");
        System.out.println("=======================================");
        System.out.println("");
        System.out.println("1. Menu Perkalian");
        System.out.println("2. Menu Pembagian");
        System.out.println("3. Menu Pertambahan");
        System.out.println("4. Menu Pengurangan");
        System.out.println("5. Menu Advance Calculator");
        System.out.println("6. Exit");
        System.out.println("=======================================");
        System.out.print("Masukan Pilihan [1..6] : ");       
    }
    
    public static void menu_advCalculator(){
        System.out.println(">>>>    Advance Calculator Mode    <<<<");
        System.out.println("=======================================");
        System.out.println("             Daftar Menu               ");
        System.out.println("=======================================");
        System.out.println("");
        System.out.println("1. Menu Akar");
        System.out.println("2. Menu Pangkat");
        System.out.println("3. Kembali");
        System.out.println("=======================================");
        System.out.print("Masukan Pilihan [1..3] : ");   
    }
}
