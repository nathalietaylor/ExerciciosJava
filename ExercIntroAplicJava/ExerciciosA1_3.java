/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosa1_3;
import java.util.Scanner;
/**
 *
 * @author nathalietaylor
 */
public class ExerciciosA1_3 {
    /*
    Exercício: Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma, média, produto
    e os números menores e maiores.
    
    scanner entrada;
    variaveis num1 num e num3;
    sout + entradas;
    soma + sout;
    media + sout;
    produto + sout;
    SE num1>num2 && num1>num3, num1 é maior 
    SE num1>num2 && num1<num3, num3 é maior
    SE num1<num2 && num2>num3, num2 é maior
    
    SE num1>num2 && num2<num3, num2 é menor
    SE num1<num2 && num1<num3, num1 é menor
    SE num1<num2 && num1>num3, num3 é menor
    
    */
    
    public static void main(String[] args) {
     
         Scanner entrada = new Scanner (System.in);
         
         int num1 = 0;
         int num2 = 0;
         int num3 = 0;
         
         
         System.out.println("Digite 3 numeros inteiros para saber a soma, produto, media e comparaçao");
         
         System.out.println("Digite o primeiro numero:");
         num1 = entrada.nextInt();
         System.out.println("Digite o segundo numero:");
         num2 = entrada.nextInt();
         System.out.println("Digite o terceiro numero:");
         num3 = entrada.nextInt();
         
         //operaçoes
         
         int soma = num1 + num2 + num3;
         int produto = num1 * num2 * num3;
         int media = produto/3;
         
         System.out.println("A soma e: " + soma);
         System.out.println("O produto e: " + produto);
         System.out.println("A media e: " + media);
         
         // comparacao maior
         
         if ((num1>num2) && (num1>num3)){
             System.out.println("O maior numero e " + num1);
         
         }else{if ((num1<num2) && (num2>num3)){
             System.out.println("O maior numero e " + num2);
         
         }else {
             System.out.println("O maior numero e " + num3);
         }
         
         }
         
         // comparação menor
         
         if ((num1<num2) && (num1<num3)){
             System.out.println("O menor numero e " + num1);
         } else { if ((num1>num2) && (num2<num3)){
             System.out.println("O menor numero e " + num2);
         } else {
             System.out.println("O menor nuemro e " + num3);
         }
         }

    
    entrada.close();
    
    }
}
