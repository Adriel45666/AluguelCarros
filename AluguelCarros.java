/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aluguelcarros;

/**
 *
 * @author SKA
 */
import java.util.Scanner;
public class AluguelCarros {
      
    public static void main(String[] args) {
       
        carros carro1 = new carros(); 
        carros carro2 = new carros(); 
        carros carro3 = new carros(); 
        
        carro1.marca = "VW";
        carro1.modelo = "Fusca";
        carro1.disponivel = false;
        
        carro2.marca = "Hyundai";
        carro2.modelo = "Creta";
        carro2.disponivel = false;
        
        carro3.marca = "Peugeot";
        carro3.modelo = "Bomba";
        carro3.disponivel = true;
       

    
    
    
    
        Scanner ler = new Scanner(System.in);
        
        
        System.out.println("-->MENU<--");
        System.out.println("Digite 1 para exibir detalhes");
        System.out.println("Digite 2 para alugar um carro");
        System.out.println("Digite 3 para devolver um carrro");
        System.out.println("Digite 4 para sair");
        
        System.out.print("Digite uma opção: ");
        int num = ler.nextInt();
       
        switch (num){
            case 1 :
                    carro1.exibirDetalhes();
                    carro2.exibirDetalhes();
                    carro3.exibirDetalhes();
                    break;
             
            case 2 :
                    carro1.alugar();
                    carro2.alugar();
                    carro3.alugar();
                    break;
                    
            case 3 :
                    carro1.devolver();
                    carro2.devolver();
                    carro3.devolver();
                    break;
                    
            case 4 :
                System.out.println("Saindo...");
                    break;
      }
     }
    }
  
    
        


