/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan22;

import java.util.Scanner;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Perhitungan Lingkaran
 */

public class Latihan22 {

    public static void main(String[] args) {
        int nilai;
        int jari2;
        double luasLingkaran;
        double kelilingLingkaran;
        String validasi;     
        boolean valid = true;
                 
        do{
            //input
            System.out.println("==========Perhitungan Lingkaran==========");
            System.out.print("Masukkan Nilai Diameter Lingkaran         : ");
            Scanner input = new Scanner(System.in);
            validasi = input.nextLine();
        
            //output
            if (validasi.matches("[0-9]*")) {
                System.out.print("Masukkan Nilai Diameter Lingkaran Kembali : ");
                nilai = input.nextInt();
                jari2 = nilai / 2;
                luasLingkaran = 3.14 * jari2 * jari2 ;
                kelilingLingkaran = 3.14 * nilai;
                System.out.println("");
                System.out.println("==========Hasil Perhitungan Lingkaran==========");
                System.out.println("Jari-Jari Lingkaran\t= " + jari2 + " cm");
                System.out.println("Luas Lingkaran\t\t= " + luasLingkaran + " cm");
                System.out.println("Keliling Lingkaran\t= " + kelilingLingkaran + " cm");
                System.out.println("");
                System.out.println("Developed by : Zaenal Anzarry");
                valid = false;
                break;
             } 
            else {
                System.out.println("Nilai Diameter Tidak Sesuai");
                System.out.println("");
             }
        }while(valid = true);
    }
    
}
