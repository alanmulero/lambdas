/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alan_
 */
public class TesteStreams {
    public static void main(String[] args) {
        // Testes com Streams e Lambdas em conjunto.
        
        List<String> cores = Arrays.asList("branco","amarelo","azul","verde","cinza","preto");
        
        // Chamando o stram(), operações encadeadas.
        cores.stream()
                .sorted() // Ordenando
                .limit(3) // pegando as 3 primeiras cores
                .filter(c -> c.startsWith("a")) // Filtrando nome que inicia com "v"
                .map(n -> n.toUpperCase())
                .forEach(System.out::println); //Imprimindo com lambda
    }
    
}
