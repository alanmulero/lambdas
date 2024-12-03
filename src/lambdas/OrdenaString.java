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
public class OrdenaString {
    public static void main(String[] args) {
        
        List<String>  listaNomes = Arrays.asList("neny", "pituca","Alan","Ana","Didi");
        listaNomes.sort((a,b) -> a.compareTo(b));
        System.out.println(listaNomes);
    }
    
}
