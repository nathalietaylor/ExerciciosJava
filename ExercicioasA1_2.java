/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosa1_2;
import java.util.Scanner;

/**
 *
 * @author nathalietaylor
 */


public class ExercicioasA1_2 {
  /*
Exercício: Escreva um aplicativo que solicite ao usuário inserir dois inteiros,
obtenha dele esses números e exiba o número maior seguido pelas palavras “É maior". 
Se os números forem iguais, imprima a mensagem “Estes números são iguais".

criar entrada;
criar variaveis num1 e num2 (int);
solicitar numeros (sout);
comparar num1 e num2;
SE num1>num2, sout num1 + "é maior"; 
SENAO, SE num1<num2, sout num2 + "é maior";
SENAO num1 = num2, sout "os numeros são iguais";

*/

     public static void main(String[] args) {
     
         Scanner entrada = new Scanner (System.in);
         
         int num1 = 0;
         int num2 = 0;
         
         System.out.println("Digite dois numeros inteiros para saber qual e o maior");
         System.out.println("Digite o primeiro numero:");
         num1 = entrada.nextInt();
         System.out.println("Digite o segundo numero:");
         num2 = entrada.nextInt();
         
         
         if (num1>num2){
             System.out.println(num1 + " e o maior numero");
         } else { 
             if (num1<num2){
                 System.out.println(num2 + " e o maior numero");
             } else {
                 System.out.println("Os dois numeros sao iguais");
             }
         }
         
         entrada.close();
     
     
     
     
     
     
     
     
     }
    
}
