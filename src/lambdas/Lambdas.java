/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lambdas;

/**
 *
 * @author alan_
 */
public class Lambdas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str2 = "radar";
        // Instanciando Pálindromo
               Palindromo palindromo = str -> str.equals(new StringBuilder(str).reverse().toString());

        System.out.println(palindromo.verificaPalindromo("radar"));  // Resultado: true
        System.out.println(palindromo.verificaPalindromo("java"));
        System.out.println((new StringBuilder(str2).reverse()));
    }
    
}
