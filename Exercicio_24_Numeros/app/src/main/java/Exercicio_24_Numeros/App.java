/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio_24_Numeros;

import java.util.Scanner;

public class App {    
    
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int n;
        char continuar = 's';
        
        while (continuar == 's' || continuar == 'S'){
            System.out.println("Informe 1 n�mero");
            n = leitor.nextInt();

            if ( n > 0){
                System.out.println("Positivo");
            }else{
                if ( n < 0){
                    System.out.println("Negativo");
                }else{
                    System.out.println("Zero");
                }
            }
            
            System.out.println("Deseja continuar? Sim - S | N�o - N");
            continuar = leitor.next().charAt(0);
        }
    }
}
