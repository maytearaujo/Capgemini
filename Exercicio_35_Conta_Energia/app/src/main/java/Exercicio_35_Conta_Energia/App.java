/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio_35_Conta_Energia;
import java.util.Scanner;
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char tipoCliente;
        
        float horas, conta=0.0f;
        
        System.out.println("Informe o Tipo Cliente: Resid�ncia | Com�rcio | Ind�stria");
        tipoCliente = leitor.next().charAt(0);
        
        System.out.println("Informe a quantidade de horas");
        horas = leitor.nextFloat();
        
        if (tipoCliente == 'R' || tipoCliente == 'r'){
            conta = horas * 0.6f;
        }else{
            if (tipoCliente == 'C' || tipoCliente == 'c'){
                conta = horas * 0.48f;
            }else{
                if (tipoCliente == 'I' || tipoCliente == 'i'){
                    conta = horas * 1.29f;
                }
            }
        }
        
        System.out.println("Conta de Energia El�trica R$ "+conta);
    }
}
