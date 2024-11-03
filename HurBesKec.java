package pert6;

import java.util.Scanner;

public class HurBesKec {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

     
        System.out.println("==== Hasil Formatting ====");
        System.out.println("Huruf besar: " + kalimat.toUpperCase());
        System.out.println("Huruf kecil: " + kalimat.toLowerCase());
    }
}

