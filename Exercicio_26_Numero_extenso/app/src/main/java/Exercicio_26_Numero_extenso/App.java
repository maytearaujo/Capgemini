/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio_26_Numero_extenso;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n;
        
        System.out.println("Digite 1 n�mero de 1 a 5");
        n = leitor.nextInt();
        
        switch(n){
            case 1:
                System.out.println("Um");
                break;
                
            case 2:
                System.out.println("Dois");
                break;
                
            case 3:
                System.out.println("Tr�s");
                break;
                
            case 4:
                System.out.println("Quatro");
                break;
            
            case 5:
                System.out.println("Cinco");
                break;
                
            default:
                System.out.println("N�mero Inv�lido");
        }
    }
}
