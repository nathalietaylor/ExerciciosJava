/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosa1_1;
import java.util.Scanner;

/**
 *
 * @author nathalietaylor
 */
public class ExerciciosA1_1 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Exercício: Escreva um aplicativo que solicite ao usuário inserir dois inteiros,
    obtenha dele esses números e imprima sua soma, produto, diferença e quociente (divisão).
    
    declarar scanner entrada
    declarar duas variáveis: num1 e num2 (int)
    pedir que digite 2 numeros inteiros (sout)
    calcular soma num1+num2
    imprimir soma (sout)
    calcular produto num1*num2
    imprimir produto (sout)
     idem para diferenca e quociente
    
    */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        
        System.out.println("Ola! Vamos realizar algumas operacoess matematicas simples, para isso preciso que voce digite dois numeros inteiros");
        
        System.out.println("Digite o primeiro numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        num2 = entrada.nextInt();
        
        int soma = num1 + num2;
        System.out.println("A soma destes numeros e4: " + soma);
        
        int produto = num1 * num2;
        System.out.println("O produto destes numeros e: " + produto);
        
        int diferenca = num1 - num2;
        System.out.println("A diferenca destes numeros e: " + diferenca);
        
        int quociente = num1 / num2;
        System.out.println("O quociente destes numeros e: " + quociente);
        
        entrada.close();
        
               
        
        
        
        
        
        
        
        
    }
    
}
