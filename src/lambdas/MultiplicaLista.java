/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alan_
 */
public class MultiplicaLista {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(2,4,6,8);
        numeros.replaceAll(n -> n * 3);
        System.out.println(numeros);

        
    }

}
