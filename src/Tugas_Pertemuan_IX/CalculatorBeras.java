/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Pertemuan_IX;

/**
 *
 * @author Aganinggar
 */
public class CalculatorBeras implements CalculaorService{


    @Override
    public double Ping(double x, double y) {
        double hasil = 0;
        try {
            hasil = x*y;
        } catch (ArithmeticException | NumberFormatException e){
            System.out.println("Error : "+e.getMessage());

        }
        return hasil;
    }

    @Override
    public double Po(double x, double y) {
        double hasil = 0;
        try {
            hasil = x/y;
        } catch (ArithmeticException | NumberFormatException e){
            System.out.println("Error : "+e.getMessage());

        }
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
