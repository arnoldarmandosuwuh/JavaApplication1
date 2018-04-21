/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.*;
import java.util.*;

/**
 *
 * @author Arnold
 */
public class PersegiPanjang {
       public static void main (String[] args){
       int pil, p, l;
       Scanner input = new Scanner (System.in);
       System.out.println("\nPilih Menu Persegi Panjang");
       System.out.println("1. Luas Persegi Panjang");
       System.out.println("2. Keliling Persegi Panjang");
       System.out.print("Masukan Pilihan Anda : ");
       pil = input.nextInt();
       
       System.out.print("\nMasukan Panjang : ");
       p = input.nextInt();
       System.out.print("Masukan Lebar : ");
       l = input.nextInt();
       
       switch (pil){
           case 1 :
               luas(p,l);
               break;
           case 2 :
               keliling(p,l);
               break;
       }
         
   } 
   public static void luas (int p, int l){
       int luas;
       luas = p * l;
     System.out.println("Luas Persegi Panjang = " + luas);
   }
   public static void keliling (int p, int l){
       int keliling;
       keliling = 2 * (p+l);
     System.out.println("Keliling Persegi Panjang = " + keliling);
   }
}
