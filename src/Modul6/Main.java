/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6;

import static Modul6.Operasi.op_dasar_konst;

/**
 *
 * @author MSi-GAMING
 */
public class Main {
 
    public static void main(String[] args) {
        String kons= op_dasar_konst;
        System.out.println(kons);
        Kalkulator kalkulator = new Kalkulator(16.0, 3.0);
       
        System.out.println("Demo Kalkulator");
        System.out.println("Nilai x = " +kalkulator.getX());
        System.out.println("Nilai Y = " +kalkulator.getY());
        System.out.println("=========================");
        System.out.println("Operasi Dasar Aritmatika");
        System.out.println("x + y = " +kalkulator.penjumlahan());
        System.out.println("x - y = " +kalkulator.pengurangan());
        System.out.println("x * y = " +kalkulator.perkalian());
        System.out.println("x / y = " +kalkulator.pembagian());
        System.out.println("=========================");
        System.out.println("Operasi Scientific");
        System.out.println("akar x = " +kalkulator.akar());
        System.out.println("x ^ y = " +kalkulator.pangkat());
        System.out.println("x mod y = " +kalkulator.modulus());
    }
   
}
