/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.psc_lista_04_2024;

import java.util.Scanner;

/**
 *
 * @author Lorena
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         
        String nome,senha;
        while(true){
       
            System.out.println("Qual o seu nome");
            nome = input.next();
     
        
            System.out.println("Qual a sua senha?");
            senha = input.next();
            
            if(!(senha == null ? nome != null : !senha.equals(nome))){
             
            System.out.println("Senha igual ao nome");
                
            } else {
                System.out.println("Autorizado");
                break;
             }
                
            
        }input.close();
    }
    
}
