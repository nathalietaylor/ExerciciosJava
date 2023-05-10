/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosa1_5;
import java.util.Scanner;

/**
 *
 * @author nmtza
 */
public class ExerciciosA1_5 {
    /*
    Exercício: Escreva um aplicativo que leia um inteiro, além de determinar e imprimir se ele é ímpar ou par. 
    [Dica: utilize o operador de resto. Um número par é um múltiplo de 2.
    Qualquer múltiplo de 2 deixa um resto 0 quando dividido por 2.]
    
    scanner entrada;
    variavel num(int);
    sout pedir num;
    SE num/2 == 0, sout par;
    SENAO, sout impar;
    */
    
     public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int num = 0;
        
         System.out.println("Digite um numero inteiro para saber se e par ou impar:");
         num = entrada.nextInt();
         
         // resto=num%2
         
         if (num%2 == 0){
             System.out.println("Este numero e par");
         } else {
             System.out.println("Este numero e impar");
         }
         
     entrada.close();
     
        
        
     }
}
