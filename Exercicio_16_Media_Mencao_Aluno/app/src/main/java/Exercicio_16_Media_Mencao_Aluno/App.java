/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio_16_Media_Mencao_Aluno;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        int n1, n2, n3;
        float media;
        
        System.out.println("Informe o nome do aluno");
        nome = leitor.nextLine();
        
        System.out.println("Informe a nota 1");
        n1 = leitor.nextInt();
        
        System.out.println("Informe a nota 2");
        n2 = leitor.nextInt();
        
        System.out.println("Informe a nota 3");
        n3 = leitor.nextInt();
        
        media = (n1 + n2 + n3) / 3;
        
        System.out.println("Nome: " + nome);
        System.out.println("M�dia: " + media);
        
        if ( media >= 7 ){
            System.out.println("Men��o: Aprovado(a)");
        }else{
            if ( media <= 5 ){
                System.out.println("Men��o: Reprovado(a)");
            }
            else{
                if ( media >= 5.1 && media <= 6.9){
                    System.out.println("Men��o: Recupera��o");
                }
            }
        }
    }
}
