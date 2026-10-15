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
public class LoginSederhana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Username: ");
        String user = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();

        if (user.equals("admin") && pass.length() >= 6 && pass.matches(".*\\d.*")) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal!");
        }
    }
}
