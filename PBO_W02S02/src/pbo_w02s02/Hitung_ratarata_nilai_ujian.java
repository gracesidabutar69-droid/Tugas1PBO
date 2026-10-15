/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w02s02;

import java.util.Scanner;

/**
 *
 * @author grace
 * 
 * Nama : Grace Yulia Sidabutar
 * NIM : 41425053
 */
public class Hitung_ratarata_nilai_ujian {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
                System.out.print("Nilai 1: ");

        System.out.print("Nilai 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Nilai 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Nilai 3: ");
        double n3 = sc.nextDouble();
        
        double rata = (n1 + n2 + n3) / 3;
        System.out.println("Rata-rata: " + rata);
    }
}
