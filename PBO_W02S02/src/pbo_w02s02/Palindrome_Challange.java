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
public class Palindrome_Challange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = sc.nextLine().toLowerCase();

        // Palindrome
        String balik = new StringBuilder(kata).reverse().toString();

        if (kata.equals(balik)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Bukan palindrome");
        }

        // Hitung vokal
        int vokal = 0;
        for (int i = 0; i < kata.length(); i++) {
            char c = kata.charAt(i);
            if ("aiueo".indexOf(c) != -1) {
                vokal++;
            }
        }

        System.out.println("Jumlah vokal: " + vokal);
    }
}
