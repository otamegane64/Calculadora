/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package wsCalculadora.iscrquinter.hotmail.com;

import wsCalculadora.iscrquinter.hotmail.com.Calculadora.Calculadora;

public class App {
    Calculadora c;

    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        ejecutando(c);
    }

    private static void ejecutando(Calculadora c) {
        System.out.println("Calculadora aritmetica (3.0)");
        System.out.println("=============================");
        System.out.println("2+3=" + c.suma(2, 3));
        System.out.println("2-3=" + c.resta(2, 3));
        System.out.println("2*3=" + c.multiplica(2, 3));
        System.out.println("12/4=" + c.divide(12, 4));
        System.out.println("5/0=" + c.divide(5, 0));
        System.out.println("sen 30= "+ c.seno(30));
        System.out.println("cos 90 = "+ c.coseno(90));
        System.out.println("tan 45 = "+ c.tangente(45));
        System.out.println("Autor: Ricardo Rafael Quintero Meza-ITC");
    }
}
