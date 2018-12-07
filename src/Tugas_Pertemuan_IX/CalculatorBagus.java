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
public class CalculatorBagus implements CalculatorAdvanceService{

    @Override
    public double Akar(double x) {
        double hasil = 0;
        try {
            if (x==0) {
                throw new Exception_Zero_Number("Masukan angka selain 0 ");
            }
        } catch (Exception_Zero_Number e){
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, e);
        }
        hasil = Math.sqrt(x);
        
        return hasil;    }

    @Override
    public double Pangkat(double x, double y) {
        double hasil = 0;
        
        
        
        try {
            if ((x==0)&&(y==0)) {
            throw new Exception_Zero_Number("Masukan angka selain 0 ");
            }       
        } catch (Exception_Zero_Number e){
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, e);
        }
                
        hasil = Math.pow(x, y);
        
        return hasil;
    }

}
