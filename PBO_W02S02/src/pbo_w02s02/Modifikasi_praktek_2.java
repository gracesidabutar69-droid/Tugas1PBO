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
public class Modifikasi_praktek_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double a = sc.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double b = sc.nextDouble();

        System.out.print("Pilih operator (+, -, *, /, %, ^): ");
        char op = sc.next().charAt(0);

        double hasil;

        switch(op) {
            case '+': hasil = a + b; break;
            case '-': hasil = a - b; break;
            case '*': hasil = a * b; break;
            case '/': hasil = a / b; break;
            case '%': hasil = a % b; break;
            case '^': hasil = Math.pow(a, b); break;
            default:
                System.out.println("Operator tidak valid");
                return;
        }

        System.out.println("Hasil: " + hasil);
}
}
