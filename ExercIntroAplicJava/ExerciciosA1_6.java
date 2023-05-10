/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosa1_6;
import java.util.Scanner;
/**
 *
 * @author nmtza
 */
public class ExerciciosA1_6 {
    /*
    Exercicio: Escreva um aplicativo que leia dois inteiros, 
    além de determinar se o primeiro é um múltiplo do segundo e imprimir o resultado.
    [Dica: utilize o operador de resto.] 
    
    scanner entrada; 
    int1 e int2 (int);
    divisão int1%int2;
    SE resto = 0, sout multiplo; 
    SENAO, nao multiplo;
    
    */
    
     public static void main(String[] args) {
         
         Scanner entrada = new Scanner (System.in);
         int int1 = 0;
         int int2 = 0;
         
         System.out.println("Digite dois numeros inteiros para saber se o primeiro e multiplo do segundo");
         System.out.println("Digite o primeiro numero:");
         int1 = entrada.nextInt();
         System.out.println("Digite o segundo numero:");
         int2 = entrada.nextInt();
         
         int resto = int1%int2;
         
         if (resto==0){
             System.out.println(int1 + " e multiplo de " + int2);
         }else{
             System.out.println(int1 + " nao e multiplo de " + int2);
         }
     
     
     
     
     
     }
}
