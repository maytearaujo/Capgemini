/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio_POO_08_Data;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        Data objData = new Data(04, 03, 2013);        
        
        System.out.println(objData.compara(04, 04, 2022));
        
        System.out.println("M�s Atual: "+ objData.GetMesExtenso());
        
        System.out.println(objData.IsBissexto());
        
         System.out.println(objData.clone());
        
        
    }
}
