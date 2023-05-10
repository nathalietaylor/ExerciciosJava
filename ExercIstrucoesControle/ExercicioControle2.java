/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioControle2;
import java.util.Scanner;


/**
 *
 * @author nmtza
 */
public class ExercicioControle2 {
    
    /*
    Uma grande empresa paga seu pessoal de vendas com base em comissões. 
    O pessoal de vendas recebe R$ 200 por semana mais 9% de suas vendas brutas durante esse período. 
    Por exemplo, um vendedor que realiza um total de vendas de mercadorias de R$ 5.000 em uma semana recebe R$ 200 mais 9% de R$ 5.000,  um total de R$ 650.
    Foi-lhe fornecida uma lista dos itens vendidos por cada vendedor. Os valores desses itens são como segue:

        Item	Valor
        1	239.99
        2	129.75
        3	99.95
        4	350.89

    Desenvolva um aplicativo Java que recebe entrada de itens vendidos por um vendedor durante a última semana e 
    calcula e exibe os rendimentos do vendedor. Não existe nenhum limite para o número de itens que pode ser vendido.
     
    
    
    
    */
    
    
    public static void main(String[] args){ 
            Scanner entrada = new Scanner (System.in);
            
            double salFixo = 200;
            int item = 0; 
            double valorVenda = 0;
            double somaVenda = 0;
            
        
            
            System.out.println("Insira aqui o codigo do item vendido:");
            item = entrada.nextInt();
            
            do {
            switch (item) {
                case 1: 
                    valorVenda = 239.99;
                    break;
                    
                case 2: 
                    valorVenda = 129.75;
                    break;
                
                case 3: 
                    valorVenda = 99.95;
                    break;
                    
                 case 4: 
                    valorVenda = 350.89;
                    break;
                    
                 default:
                     System.out.println("Codigo invalido");
                  
            }
           
            
            somaVenda = somaVenda + valorVenda;
                
            // System.out.println(somaVenda);
            
            System.out.println(" Caso possua uma outra venda, digite o codigo do item, caso contrario, digite 0: ");
            item = entrada.nextInt();
            
            }while (item != 0);
            
            double bonus = 0.09 * somaVenda;
            
            double rendimento = salFixo + bonus; 
            
            System.out.println("O valor total de seu rendimento foi de " + rendimento + "reais");
    
    
    
    
            entrada.close();
    
    }
    
}
