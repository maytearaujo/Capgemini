/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio_POO_09_Voo;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Voo objVoo = new Voo(00001, "05/04/2022","18:00:00",100);
        
        objVoo.ocupa(10);
        objVoo.verifica(10);
        
        System.out.println("Proxima Poltrona Livre: "+ objVoo.ProximoLivre());
        System.out.println("Quantidade Poltronas Livre: "+ objVoo.vagas());
        System.out.println("N� Voo: "+ objVoo.getVoo());
    }
}
