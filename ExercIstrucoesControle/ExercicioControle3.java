/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioControle3;
import java.util.Scanner;


/**
 *
 * @author nmtza
 */
public class ExercicioControle3 {
 
    /*
    Desenvolva um aplicativo Java que determina o salário bruto de cada um de três empregados. 
    A empresa paga as horas normais pelas primeiras 40 horas trabalhadas por cada funcionário e 
    50% a mais por todas as horas trabalhadas além das 40 horas. Você recebe uma lista de empregados, 
    o número de horas trabalhadas por eles na semana passada e o salário-hora de cada um. 
    Seu programa deve aceitar a entrada dessas informações para cada empregado e, então, 
    determinar e exibir o salário bruto do empregado. 
    Utilize a classe Scanner para inserir os dados.
    
    3 empregados
    hora normal até 40h,  SE acima + 0.5 valor normal;
    lista de empregados, horas trabalhadas e salario-hora;
    
    
    */
    
    public static void main(String[] args){ 
        Scanner entrada = new Scanner(System.in);
        
      
        double horasTrab = 0;
        double valorHora = 0;
        String funcionario = "";
        
        
        for(int i = 0; i<3; i ++){
        System.out.println("Insira o nome do funcionario: ");
        funcionario = entrada.next();
                
        System.out.println(" Insira a quantidade de horas trabalhadas pelo funcionario: ");
        horasTrab = entrada.nextDouble();
        
        System.out.println("Insira o valor de salario-hora do funcionario (usar . como separador): ");
        valorHora = entrada.nextDouble();
        
        if (horasTrab <= 40){
            double salBruto = horasTrab * valorHora;
            System.out.println("Salario Bruto referente ao funcionario " + funcionario + ": " + salBruto);
                    
        } else {
            double horasExtras = horasTrab - 40; 
            double salBase = horasTrab * valorHora; 
            double valorHE = 1.5*valorHora;
            double salExtra = horasExtras * valorHE;
            double salBruto = salBase + salExtra;
            
            System.out.println("Salario Bruto referente ao funcionario " + funcionario + ": " + salBruto);
                        
        }
        
        }
    
    
        entrada.close();
        
    
    
    
    }

    
}
