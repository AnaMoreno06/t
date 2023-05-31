/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Teoria_P2;

/**
 *
 * @author Ana
 */
public class Palindromos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Cadena = "aabaa";
        int aux = Cadena.length() / 2;
        String SubCadena1 = Cadena.substring(0, aux);
        String SubCadena2 = Cadena.substring(aux, Cadena.length());
        char letra1, letra2;
        int size1 = SubCadena1.length();
        int size2 = SubCadena2.length();
        boolean condicion = size1 == size2;

        System.out.println("s1 " + SubCadena1);
        System.out.println("s2 " + SubCadena2);

        for (int i = 0, j = size1 - 1; condicion && i < size1; i++, j--) {
            System.out.println("i " + SubCadena1.charAt(i));
            System.out.println("j " + SubCadena2.charAt(j));
            condicion = SubCadena1.charAt(i) == SubCadena2.charAt(j);
        }

        System.out.println("" + condicion);
    }

}
