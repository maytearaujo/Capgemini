/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio_POO_05_Aluno;
import java.util.Scanner;
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        Aluno objAluno = new Aluno();
        
        objAluno.media("01234", "Mayte", 1.0f,0.0f,10.0f);
        System.out.println("M�dia Final: "+ objAluno.getMedia());
        System.out.println("Nota Minima Exame: " +objAluno.pfinal());
    }
}
