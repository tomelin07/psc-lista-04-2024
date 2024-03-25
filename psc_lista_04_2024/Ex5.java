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
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
                
        
        int cont = 0 ;
        double popA; 
        double popB;
        double taxaA;
        double taxaB;
       
        boolean valido = false;
        
        valido=false;
        do{
            System.out.println("Qual a população A?");
            popA=input.nextDouble();
             
        if(popA>0){
            valido=true;
        }else{
            System.out.println("Invalido");
        }
         
        } while(!valido);
    
        valido=false;
        do{
            System.out.println("Qual a população B?");
            popB=input.nextDouble();
       
                
        if(popB>0){
            valido=true;
        }else{
            System.out.println("Invalido");
        }
         
        } while(!valido);
    
    valido=false;
    do{
            System.out.println("Qual a Taxa da população A?");
            taxaA=input.nextDouble();
       
                
        if(taxaA>0){
            valido=true;
        }else{
            System.out.println("Invalido");
        }
         
    }while(!valido);
    
    
    valido=false;
    do{
            System.out.println("Qual a Taxa da população B?");
            taxaB=input.nextDouble();
       
                
        if(taxaB>0){
            valido=true;
        }else{
            System.out.println("Invalido");
        }
         
    }while(!valido);
    
    
    while(popA < popB){
        
        popA +=(popA/100)*taxaA;
        popB +=(popB/100)*taxaB;
        cont++;
                }
    
        System.out.println("População A = "+popA);
        System.out.println("População B = "+popB);
        System.out.println("Anos = "+cont);
    
    
        input.close();
    }
    
    }
    