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
public class Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num,soma = 0;
       double media;
       
       for(int i = 0; i <5;i++){
           System.out.println("Informe o numero");
           num= input.nextInt();
           
           soma += num;
           }
       
        media = soma/5;
        
        System.out.println("A soma e "+soma);
        System.out.println("A media e "+media);
            input.close();
    }
    
}
