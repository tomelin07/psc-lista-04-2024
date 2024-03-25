/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.psc_lista_04_2024;

import java.util.Scanner;

/**
 *
 * @author Lorena
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        
        while(true){
        
        System.out.println("Insira um valor entre 1 e 5");
        
        num = input.nextInt();
        
        
        if(num>=1 && num<=5){
            System.out.println("Seu numero e  "+num+" dentro dos parametros");
            break;
                  
        }
        System.out.println("Erro");
        
        }
        
        input.close();
    }

}
