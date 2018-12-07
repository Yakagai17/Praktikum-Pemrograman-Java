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
public class CalculatorBagus implements CalculatorAdvanceService{

    @Override
    public double Akar(double x) {
        double hasil = 0;
        try {
            hasil = Math.sqrt(x);
        } catch (ArithmeticException | NumberFormatException e){
            System.out.println("Error : "+e.getMessage());
        }
        return hasil;    }

    @Override
    public double Pangkat(double x, double y) {
        double hasil = 0;
        try {
            hasil = Math.pow(x, y);
        } catch (ArithmeticException | NumberFormatException e){
            System.out.println("Error : "+e.getMessage());

        }
        return hasil;
    }

}
