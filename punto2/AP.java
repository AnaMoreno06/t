/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Teoria_P2;

import java.util.Scanner;

/**
 *
 * @author ANA 
 */
public class AP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" La entrada binaria = ");
        String entrada = sc.next();
        System.out.println("Entrada " + entrada);
        
        int cont = 0, cont2 = 0;
        char n;
        boolean condicion = entrada != "";

        for (int i = 0; condicion && i < entrada.length() - 1; i++) {
            n = entrada.charAt(i);
            condicion = n == '0';
            cont++;
        }
        cont -= 1;
        
        n = entrada.charAt(cont);
        for (int i = cont; n == '1' && i < entrada.length(); i++) {
            cont2++;
            n = entrada.charAt(i);
        }

        condicion = cont2 == cont * 2;
        
        System.out.println(" - " + condicion);
    }

}
