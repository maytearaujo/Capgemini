/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio_POO_10_Jogador_Futebol;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        JogadorFutebol objJogadorFutebol = new JogadorFutebol("Marta", "Atacante", 03,12,1983, "Brasileira", 1.65f,72.0f);
        System.out.println("Idade: "+objJogadorFutebol.calcularIdade());
        System.out.println("Tempo Aposentar: "+objJogadorFutebol.tempoAposentar());
    }
}