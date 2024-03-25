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
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num;
       int maior = Integer.MIN_VALUE;
       
       for(int i = 0; i <5;i++){
           System.out.println("Informe o numero");
           num= input.nextInt();
           
           if(num>maior){
               maior = num;
           }
       }
        System.out.println("O maior numero digitado foi "+ maior);
        
        input.close();
    }
}

