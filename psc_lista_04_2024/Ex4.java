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
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int popA = 80000;
        int popB = 200000;
        int cont = 0;
        
        while(popA < popB){
        
        popA +=(popA/100)*3;
        popB +=(popB/100)*1.5;
        cont++;
                }
    
        System.out.println("População A = "+popA);
        System.out.println("População B = "+popB);
        System.out.println("Anos = "+cont);
        
}
}