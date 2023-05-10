/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercParte1_1;
import java.util.Scanner;

/**
 *
 * @author nmtza
 */
public class ExercControle_1 {
    /*
    Os motoristas se preocupam com a quilometragem obtida por seus automóveis. 
    Um motorista monitorou várias viagens registrando a quilometragem dirigida e 
    a quantidade de combustível em litros utilizados para cada tanque cheio. 
    Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e 
    os litros de gasolina consumidos (ambos como inteiros) para cada viagem. 
    O programa deve calcular e exibir o consumo em quilômetros/litro para cada viagem e 
    imprimir a quilometragem total e a soma total de litros de combustível consumidos até esse ponto 
    para todas as viagens. 
    Todos os cálculos de média devem produzir resultados de ponto flutuante. 
    Utilize classe Scanner e repetição controlada por sentinela para obter os dados do usuário.

    
    scanner; 
    KMdirigidos (int), Lconsumidos (int);
    calcular consumo KM/L + sout consumo - para cada viagem;
    somaKM de todas as viagens (acumulador);
    somaL de total as viagens (acumulador);
    
    
    */
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int KMdirigidos = 0;
        int Lconsumidos = 0;
        int somaKM = 0;
        int somaL = 0;
             
        
        
        System.out.println("Digite a seguir a quilometragem dirigita e total de litros gastos nesta viagem");
        System.out.println("Quilometragem dirigida - caso nao haja nova viagem a inserir, digite 0 ");
        KMdirigidos = entrada.nextInt();
        
        while (KMdirigidos != 0){
        
       
        
        System.out.println("Litros consumidos:");
        Lconsumidos = entrada.nextInt();
        
        float consumo = (float) KMdirigidos / Lconsumidos; // float entre paranteses para que considere as casas decimais do resultado
        System.out.println(" O consumo desta viagem em KM/L foi de : " + consumo);
        
               
        somaKM = KMdirigidos + somaKM;
        somaL = Lconsumidos + somaL;
        
        System.out.println("A quilometragem total percorrida foi de " + somaKM);
        System.out.println("O consumo total de litros foi de " + somaL);
         
        System.out.println("Digite a seguir a quilometragem dirigita e total de litros gastos nesta viagem");
        System.out.println("Quilometragem dirigida - caso nao haja nova viagem a inserir, digite 0 ");
        KMdirigidos = entrada.nextInt();
        
        }
        
        entrada.close();
        
    }
    
    
    
    
    
    
    }

