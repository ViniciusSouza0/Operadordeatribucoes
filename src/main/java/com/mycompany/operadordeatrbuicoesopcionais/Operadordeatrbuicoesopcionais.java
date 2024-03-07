package com.mycompany.operadordeatrbuicoesopcionais;

import java.util.Locale;
import java.util.Scanner;

public class Operadordeatrbuicoesopcionais {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner (System.in);
        
        int minutos = teclado.nextInt();
        double conta = 50.0;
        
        if (minutos>100){
            conta = conta + (minutos - 100) * 2.0 + (+5);
        }
        System.out.println("Valor da conta = R$" + conta);
        
       
        //Operador de atribuções cumulativas
        
        //Locale.setDefault(Locale.US);
        //Scanner teclado = new Scanner (System.in);
        
        //int minutos = teclado.nextInt();
        //double conta = 50.0;
        
        //if (minutos>100){
        //     conta += (minutos - 100) * 2.0;
        //}
        // System.out.println("Valor da conta = R$" + conta); 
        
           
    }
}
