import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aganinggar
 */
public class TestingCode {
    public static void main(String[] args) {
        
      BufferedReader data_Masuk = new BufferedReader(new InputStreamReader(System.in));
      
      String nama ="";
        System.out.print("your name : ");
        
        try {
            nama = data_Masuk.readLine();
        } catch (IOException e) {
            System.out.println("Error Input");
        }
        System.out.println("Hello, "+nama);
        
    }
}
