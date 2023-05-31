/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Teoria_P2;

import java.util.Scanner;

/**
 *
 * @author Ana
 */
public class Moore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar = "";

        do {
            System.out.print("Numero = ");
            String num = sc.next();

            for (int i = 0; i < num.length() - 1; i = i + 2) {
                //System.out.println("" + num.substring(i, i+2));
                if ((num.substring(i, i + 2)).equals("01")) {
                    System.out.println("a");
                }
            }

            System.out.print("Desea continuar? (y/n) = ");
            continuar = sc.next();

        } while (continuar.equals("y"));
        
    }
}
