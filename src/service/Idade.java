/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Calendar;

public class Idade {
    public static int calcularIdade(int diaNasc, int mesNasc, int anoNasc){
        int idade;
        Calendar cal = Calendar.getInstance();
        
        int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
        int mesAtual = cal.get(Calendar.MONTH);
        int anoAtual = cal.get(Calendar.YEAR);
        
        idade = anoAtual - anoNasc;
        
        if (mesAtual < mesNasc &&  diaAtual < diaNasc ){
           idade = idade - 1; 
        }
        return idade;
    }
}
