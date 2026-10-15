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
public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Celsius: ");
        double c = sc.nextDouble();
        double f = (c * 9/5) + 32;

        System.out.println(c + " C = " + f + " F");

        System.out.print("Fahrenheit: ");
        double f2 = sc.nextDouble();
        double c2 = (f2 - 32) * 5/9;

        System.out.println(f2 + " F = " + c2 + " C");
    }
}
