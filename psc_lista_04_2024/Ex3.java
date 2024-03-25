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
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String nome,sexo,civil;
        int idade;
        double salario;
        boolean info = false;
        
        do{
            System.out.println("Qual o nome?");
            nome=input.next();
            
            if(nome.length()>3){
                info = true;
            }else{
                System.out.println("ERRO (minimo 3 caracteres)");
            }
        }while(!info);
        
        info = false;
        
         do{
            System.out.println("Qual a sua idade?");
            idade=input.nextInt();
            
            if(idade>=0 && idade <=150){
                info = true;
            }else{
                System.out.println("ERRO (idade entre 1 e 150)");
            }
        }while(!info);
        
        info = false;
        
         do{
            System.out.println("Qual o salario?");
            salario=input.nextDouble();
            
            if(salario >0){
                info = true;
            }else{
                System.out.println("ERRO (salario maior que 0)");
            }
        }while(!info);
        
        info = false;
        
         do{
            System.out.println("Qual o sexo?");
            sexo=input.next();
            
            if(sexo.equalsIgnoreCase("f")|| sexo.equalsIgnoreCase("m")){
                info = true;
            }else{
                System.out.println("ERRO (sexo f ou m)");
            }
        }while(!info);
        
         info = false;
        
         do{
            System.out.println("Qual o Estado Civil");
            civil=input.next();
            
            if(civil.equalsIgnoreCase("s")|| 
               civil.equalsIgnoreCase("c")||
               civil.equalsIgnoreCase("v")||
               civil.equalsIgnoreCase("d")){
                info = true;
            }else{
                System.out.println("ERRO (Estado civil 's' ou 'c' ou 'd' ou 'v')");
            }
        }while(!info);
         System.out.println("Nome : "+nome);
         System.out.println("Idade : "+idade);
         System.out.println("Salario : "+salario);
         System.out.println("Sexo : "+sexo);
         System.out.println("Estado civil : "+civil);
         
         input.close();
         }
    
         }
    
    
