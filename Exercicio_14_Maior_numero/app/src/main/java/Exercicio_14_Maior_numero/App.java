/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio_14_Maior_numero;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1,n2;
        System.out.println("Informe o 1� n�mero");
        n1 = leitor.nextInt();
        
        System.out.println("Informe o 2� n�mero");
        n2 = leitor.nextInt();
        
        if( n1 > n2){
            System.out.println(n1 + " � o maior");
        }else{
            if( n2 > n1){
                System.out.println(n2 + " � o maior");
            }else{
                System.out.println(n1 +" = " + n2);
            }
        }
    }
}
