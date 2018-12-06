/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_IX;

/**
 *
 * @author Aganinggar
 */
public class Mahasiswa {
private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) throws ExceptionHandling_Mahasiswa
    {
        if (nim==null) {
            throw new ExceptionHandling_Mahasiswa("NIM harus diisi. ");
        }
        this.nim = nim;
    }

}
