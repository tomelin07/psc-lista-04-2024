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
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1,num2;
        
        System.out.println("Qual o primeiro numero?");
        num1 = input.nextInt();
        
        System.out.println("Qual o segundo numero?");
        num2 = input.nextInt(); 
        
        for(int i=num1;i<=num2;i++){
            System.out.println(i);
    
        }
        input.close();
    }
    
    
}
