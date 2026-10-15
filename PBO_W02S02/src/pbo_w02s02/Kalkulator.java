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
 * Nama: Grace Yulia Sidabutar
 */


public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();
        
        System.out.println("tambah: " + (a + b));
        System.out.println("kurang: " + (a - b));
        System.out.println("Kali: " + (a * b));
        System.out.println("Bagi: " + ((double) a / b));
    }
}

/*
Praktek 1 : Apa perbedaan nilai asli double dengan hasil casting int?
Jawab     : Presisi data dan cara menyimpan di memori. Nilai asli dari double
            adalah bilangan pecahan/berkoma, dan hasil casting akan menjadi bilangan bulat
            namun bukan membulatkan melainkan memotong angka dibelakang koma.
Praktek 2 : Mengapa pembagian int perlu di-casting ke double?
Jawab     : Karena sebagian besar bahasa pemrograman menggunakan pembagian integer
            jika kedua angka yang dioperasikan bertipe bilangan bulat.Dalam pembagian integer,
            hasil akan dipotong menjadi bilangan bulat.
Praktek 3 : Apa risiko jika pembagi = 0?
Jawab     : terjadi kesalahan fatal dalam sistem komputasi/runtime error dan ketidakpastian logis dalam matematika.
*/
