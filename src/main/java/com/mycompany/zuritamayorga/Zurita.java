/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zuritamayorga;

/**
 *
 * @author zurit
 */
public class Zurita {
    public void saludar(){
        System.out.println("hola");
    }
    public int multiplicar(int n1,int n2){
        return n1*n2;
    }
    public int dividir(int n1,int n2){
        if(n2 != 0){
            return n1/n2;
        }
        return 0;
    }
}
