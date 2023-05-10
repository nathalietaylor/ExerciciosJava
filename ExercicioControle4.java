/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioControle4;

/**
 *
 * @author nmtza
 */
public class ExercicioControle4 {
    
    /*
    Escreva um aplicativo Java que utiliza um loop para imprimir a seguinte tabela de valores:

        N	10*N	100*N	1000*N
        1	10	100	1000
        2	20	200	2000
        3	30	300	3000
        4	40	400	4000
        5	50	500	5000
    
    criar matriz [5][4];
    FOR
    
    */
    
     public static void main(String[] args){ 
       int[][] tabela = new int [5][4];
         System.out.print("N" + "10*N" + "100*N" + "1000*N" );
         System.out.println(); // para deixar em linhas separadas
         
         for (int i = 0; i < 5; i++){
             tabela[i][0] = i + 1;
             tabela[i][1] =(i+1)*10;
             tabela[i][2] = (i+1)*100;
             tabela[i][3] = (i+1)*1000;
             
             
             for (int k=0; k<4; k++){
                 System.out.print(tabela[i][k] + " ");
             
             
             }
             System.out.println();
          
         
            }
          
     
     
     
     
     }
}
