/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w02s02;

import java.util.Scanner;

/**
 *
 * @author grace
 */
public class OperasiString {
   public static void main(String [] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan nama lengkap: ");
       String nama = input.nextLine();
       
       System.out.println("Panjang string: " + nama.length());
       System.out.println("Huruf pertama: " + nama.charAt(0));
       System.out.println("Mengandung spasi? " + nama.contains(" "));
   } 
}
   /*
   Bagaimana jika nama yang diinput lebih dari satu spasi?
   Jawab: Input nama lebih dari satu spasi biasanya akan mengakibatkan
          format penulisan yang tidak rapi atau error pada sistem pengisian data tertentu.
   */

