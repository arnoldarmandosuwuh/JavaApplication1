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
public class Persegi {
   public static void main (String[] args){
       int s, p;
       Scanner input = new Scanner (System.in);
       System.out.println("\nPilih Menu Persegi");
       System.out.println("1. Luas Persegi");
       System.out.println("2. Keliling Persegi");
       System.out.print("Masukan Pilihan Anda : ");
       p = input.nextInt();
       System.out.print("\nMasukan Sisi : ");
       s = input.nextInt();
       
       switch (p){
           case 1 :
               luas(s);
               break;
           case 2 :
               keliling(s);
               break;
       }
         
   } 
   public static void luas (int s){
       int luas;
       luas = s * s;
     System.out.println("Luas Persegi = " + luas);
   }
   public static void keliling (int s){
       int keliling;
       keliling = 4 * s;
     System.out.println("Keliling Persegi = " + keliling);
   }
}
