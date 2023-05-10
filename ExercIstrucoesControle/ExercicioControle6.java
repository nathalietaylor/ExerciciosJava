/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioControle6;
import java.util.Scanner;

/**
 *
 * @author nathalietaylor 1252224816
 */
public class ExercicioControle6 {
    
    /*
    Escreva um aplicativo que lê três valores diferentes de zero inseridos pelo usuário, 
    determina e imprime se eles poderiam representar os lados de um triângulo.
    
    para ser triangulo, a soma de dois dos lados tem que ser maior que o terceiro
    
    SE lado1+lado2>lado3 && lado2+lado3>lado1 && lado1+lado3>lado2
    
    */
    
     public static void main(String[] args){ 
         
         Scanner entrada = new Scanner (System.in);
         int lado1 = 0;
         int lado2 = 0;
         int lado3 = 0;
                 
         System.out.println("Digite 3 numeros inteiros para saber se e possivel formar um triangulo com estas dimensoes");
         System.out.println("Primeiro numero:");
         lado1=entrada.nextInt();
         System.out.println("Segundo numero:");
         lado2=entrada.nextInt();
         System.out.println("Terceiro numero:");
         lado3=entrada.nextInt();
         
         if((lado1+lado2>lado3) && (lado2+lado3>lado1) && (lado1+lado3>lado2)){
             System.out.println("E possivel representar um triangulo");
         } else {
             System.out.println("Nao e possivel representar um trinagulo");
         }
         
     entrada.close();
     
     
     
     
     
     
     
     
     
     
     
     
     
     }
    
}
