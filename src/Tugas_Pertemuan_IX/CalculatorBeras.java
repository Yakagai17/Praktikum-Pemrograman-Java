/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Pertemuan_IX;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aganinggar
 */
public class CalculatorBeras implements CalculaorService{


    @Override
    public double Ping(double x, double y) {
        double hasil = 0;
        try {
            if ((x==0)&&(y==0)) {
                throw new Exception_Zero_Number("Masukan angka selain 0 ");
            }
        } catch (Exception_Zero_Number e){
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, e);
        }
        
        hasil = x*y;
        return hasil;
    }

    @Override
    public double Po(double x, double y) {
        double hasil = 0;
        try {
            if ((x==0)&&(y==0)) {
                throw new Exception_Zero_Number("Masukan angka selain 0 ");
            }
        } catch (Exception_Zero_Number e){
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, e);
        }
        hasil = x/y;
        return hasil;
    }

    @Override
    public double Lan(double x, double y) {
        double hasil = 0;
        try {
            hasil = x+y;
        } catch (ArithmeticException | NumberFormatException e){
            System.out.println("Error : "+e.getMessage());

        }
        return hasil;
    }

    @Override
    public double Do(double x, double y) {
        double hasil = 0;
        try {
            hasil = x-y;
        } catch (ArithmeticException | NumberFormatException e){
            System.out.println("Error : "+e.getMessage());

        }
        return hasil;
    }    
}
