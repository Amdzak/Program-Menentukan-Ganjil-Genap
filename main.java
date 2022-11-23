/**
 *
 * @author Amdzak
 */

package com.main.programganjilgenap;

import java.util.Scanner;

public class ProgramGanjilGenap {
    public static void main(String[] args) {
        //PEMBUATAN OBJEK SACNNER
        Scanner input = new Scanner(System.in);
        
        //TIPE DATA
        int bilangan,hasil;
        
        //INPUT USER
        System.out.println("Program menetukan bilangan ganjil genap");
        System.out.print("Masukan bilangan ' ");
        bilangan = input.nextInt();
        
        //IF ELSE PENCARIAN BILANGAN GANJIL GENAP
        hasil = bilangan % 2;
        
        if(hasil == 0){
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }
    }
}
