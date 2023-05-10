/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosa1_4;
import java.util.Scanner;


/**
 *
 * @author nmtza
 */
public class ExerciciosA1_4 {
    /*
    Exercícios: Escreva um aplicativo que leia cinco inteiros, 
    além de determinar e imprimir o maior e o menor inteiro no grupo.
    
    variavel menorValor e maior Valor;
    contador;
    fazer a comparação ENQUANTO contador nao chegar até 5;
    
    
    */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int contador = 0;
        int menorValor = 0;
        int maiorValor = 0;

        System.out.println("Digite 5 numeros e saiba qual e o maior e o menor");
        
        while (contador < 5) {
            System.out.println("Digite um numero");
            numero = entrada.nextInt();

            if (contador == 0) {
                menorValor = numero;
            }

            if (menorValor > numero) {
                menorValor = numero;
            }
            
            if (maiorValor < numero) {
                maiorValor = numero;
            }
            
            contador++;
        }
        
        System.out.println("O menor numero e " + menorValor);
        System.out.println("O maior numero e " + maiorValor);

        entrada.close();
    }
    
    
    
    
}
