/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio_33_Salario_Professor;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        float horasTrabalhadas, salario=0.0f;
        int nivel;
        
        System.out.println("Informe o nome do professor");
        nome = leitor.nextLine();
        
        System.out.println("Informe as horas Trabalhadas");
        horasTrabalhadas = leitor.nextFloat();
        
        System.out.println("Informe o Nivel: 1 | 2 | 3");
        nivel = leitor.nextInt();
        
        switch(nivel){
            case 1:
                salario = horasTrabalhadas * 12;
                break;
                
            case 2:
                salario = horasTrabalhadas * 17;
                break;

            case 3:
                salario = horasTrabalhadas * 25;
                break;                
        }
        System.out.println("O Sal�rio do professor "+nome +" � " +(salario));
    }
}
