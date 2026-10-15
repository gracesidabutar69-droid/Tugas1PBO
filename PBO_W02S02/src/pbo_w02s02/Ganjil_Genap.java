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
public class Ganjil_Genap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " adalah bilangan Genap");
        } else {
            System.out.println(n + " adalah bilangan Ganjil");
        }

        sc.close();
    }
}