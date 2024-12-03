/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

/**
 *
 * @author alan_
 */
public class TestaDivisao {

    public static void main(String[] args) {

        IDivisao iDivisao = (new IDivisao() {
            @Override
            public int metodoDivide(int a, int b) {
                try {
                    return a / b;
                } catch (ArithmeticException e) {
                    System.out.println("Nao pode dividir por zero." + e.getMessage());
                }
                return 0;
            }
        });

        System.out.println(iDivisao.metodoDivide(8, 2));
        System.out.println(iDivisao.metodoDivide(8, 0));

    }
}
