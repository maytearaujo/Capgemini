/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio_12_Custo_Carro_Novo;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float custoFabrica, custoImpostos, custoConsumidor;
        
        System.out.println("Digite o custo de f�brica");
        custoFabrica = leitor.nextFloat();
        
        custoImpostos = custoFabrica + ((custoFabrica * 45) / 100);
        
        custoConsumidor = custoImpostos + ((custoImpostos * 28) / 100);
        
        System.out.println("O custo ao consumidor �: " + custoConsumidor);
    }
}
