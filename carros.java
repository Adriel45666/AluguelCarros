/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aluguelcarros;

/**
 *
 * @author SKA
 */

public class carros {
      public String marca;
      public String modelo; 
      public boolean disponivel;
      
      
      
      public void exibirDetalhes(){
          System.out.println("Modelo: " + modelo);
          System.out.println("Marca: " + marca);
          System.out.println("Disponibilidade: " + disponivel + "\n");
          }
      public void alugar(){
          
          if(disponivel == false){
              System.out.println("O carro não esta disponivel!!");
             
          }else{
              System.out.println("o carro esta disponivel!!");
               disponivel = true;
          }
      }
      public void devolver(){
          if(disponivel == false){
              System.out.println("o carro foi devolvido!!");
               disponivel = true;
              
          }else{
              System.out.println("O carro já foi devolvido!!");
          }
      
    }}
  
    
        


