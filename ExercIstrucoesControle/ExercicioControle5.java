/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioControle5;
import java.util.Scanner;
/**
 *
 * @author nathalietaylor 1252224816
 */
public class ExercicioControle5 {
    /*
     Escreva um aplicativo que solicita ao usuário que insira o tamanho do lado de um quadrado e, então, 
    exibe um quadrado vazio desse tamanho com asteriscos. 
    Seu programa deve trabalhar com quadrados de todos os comprimentos de lado possíveis entre 1 e 20.
    
    matriz quad;
    se caracter estiver na borda, será um *;
    
    */
    
    public static void main(String[] args){ 
        Scanner entrada = new Scanner (System.in);
        int valorLado = 0; 
        
        System.out.println("Insira o tamanho desejado para o lado de seu quadrado (valores inteiros de 1 a 20):");
        valorLado = entrada.nextInt();
        if (valorLado<1 || valorLado>20){
            System.out.println("Valor invalido. Digite novamente");
            valorLado = entrada.nextInt();
                    }
        
        char[][] quad = new char [valorLado][valorLado];
        for (int i =0; i < valorLado; i ++){
            for (int j=0; j<valorLado; j ++){
                    if(i==0 || j ==0 || i == (valorLado - 1)|| j == (valorLado - 1)){
                        quad[i][j]='*';
                                               
                    }else {
                        quad [i][j]= ' ';
                    }
                    
                    

            }
        }
        
        for (int i = 0; i < valorLado; i++) {
            for (int j = 0; j < valorLado; j++) {
                System.out.print(quad[i][j] + " ");
            }
            System.out.println();
            
        }
         
    
    
    
    }
    
    
}
