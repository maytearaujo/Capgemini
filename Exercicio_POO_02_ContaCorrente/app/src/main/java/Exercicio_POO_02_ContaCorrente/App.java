/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio_POO_02_ContaCorrente;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        ContaCorrente objContaCorente = new ContaCorrente(12345,"Mayte",300000.0f);
        
        System.out.println("Mudar Nome: "+objContaCorente.alterarNome("Mayte Araujo"));
        System.out.println("Saldo + Deposito = "+objContaCorente.dep�sito(800000.0f));
        System.out.println("Saldo - saque = "+objContaCorente.saque(1000.0f));
        
    }
}
