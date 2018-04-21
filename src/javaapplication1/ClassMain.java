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
public class ClassMain {

    public static void main(String[] args){
        int pil;
        
        System.out.println("Pilih Menu : ");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.print("Masukan Pilihan Anda : ");
        Scanner input = new Scanner (System.in);
        pil = input.nextInt();
        
        switch (pil){
            case 1 :
                Persegi abc = new Persegi();
                Persegi.main(args);
                break;
            case 2 :
                PersegiPanjang def = new PersegiPanjang();
                PersegiPanjang.main(args);
                break;
        }
    }
}
