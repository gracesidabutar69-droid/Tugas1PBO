/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w02s02;

import java.util.Scanner;

/**
 *
 * @author grace
 * NIM:41425053
 * Nama : Grace Yulia Sidabutar
 */
public class Lingkaran {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;
        
        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();
        
        if ( r < 0){
            System.out.println("Error: jari-jari tidak boleh negatif.");
        } else{
            double luas = PI * r* r;
            double keliling = 2* PI * r;
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);
        }
    }
}


/*
1. Mengapa kita perlu validasi r<0?
Jawab: Untuk mencegah kesalahan logika, error pada program,
       dan hasil yang tidak realistis
2. Dalam aplikasi nyata, di mana validasi input sangat penting?
Jawab: di sisi backend(server-side) untuk keamanan sistem 
       dan sisi frontend (client-side) untuk kenyamanan pengguna

*/