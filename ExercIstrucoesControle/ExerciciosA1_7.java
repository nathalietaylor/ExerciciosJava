/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosa1_7;
import java.util.Scanner;

/**
 *
 * @author nmtza
 */
public class ExerciciosA1_7 {
    /*
    Exercicio: Escreva um aplicativo que insira um número consistindo em cinco dígitos a partir do usuário,
    separe o número em seus dígitos individuais e imprima os dígitos separados uns dos outros por três espaços. 
    Por exemplo, se o usuário digitar o número 42339, o programa deve imprimir

        4	2	3	3	9

    Suponha que o usuário insira o número correto de dígitos. 
    O que acontece quando você insere um número com mais de cinco dígitos? 
    O que acontece quando você insere um número com menos de cinco dígitos? 
    [Dica: você precisará tanto das operações de divisão como das de resto para “selecionar” cada dígito.]

    scanner entrada;
    numero (String- lembrar que char é '' e string "");
    pedir numero (sout);
    criar vetor digitos com os caracteres (toCharArray);
    FOR (sei o numero de vezes que vou fazer) 
    system.out.print(sem o ln) digito + ___;
    
    */
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        String numero = "";
        
        System.out.println("Digite um numero de 5 digitos: ");
        numero = entrada.next();
        char[] digitos = numero.toCharArray();
        
        for(int i =0; i<5; i ++){
            System.out.print(digitos[i] + "   ");
        }
        entrada.close();
        
        
        
        
    }
}
