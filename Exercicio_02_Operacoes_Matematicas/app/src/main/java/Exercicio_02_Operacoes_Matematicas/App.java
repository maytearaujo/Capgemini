/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio_02_Operacoes_Matematicas;

import java.util.Scanner;
        
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        int n1, n2, soma, subtracao, multiplicacao;
        float divisao;
        
        Scanner leitor = new Scanner(System.in);
                
        System.out.println("Digite o 1� n�mero");
        n1 = leitor.nextInt();
        
        System.out.println("Digite o 2� n�mero");
        n2 = leitor.nextInt();
        
        soma = n1 + n2;
        subtracao = n1 - n2;
        multiplicacao = n1 * n2;
        divisao = n1 / n2;
        
        System.out.println("Opera��es Matem�ticas de " + n1 +" e " + n2);
        System.out.println(n1 +" + " + n2 + " = " + soma);
        System.out.println(n1 +" - " + n2 + " = " + subtracao);
        System.out.println(n1 +" x " + n2 + " = " + multiplicacao);
        System.out.println(n1 +" / " + n2 + " = " + divisao);
    }
}
