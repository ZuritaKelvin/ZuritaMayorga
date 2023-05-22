/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zuritamayorga;

/**
 *
 * @author zurit
 */
public class Mayorga {
    public void despedir(){
        System.out.println("adios");
    }
        public int multiplicar(int n1,int n2){
        return n1*n2;
    }
    public int dividir(int n1,int n2){
        if(n2 != 0){
            return n1/n2;
        }
        return 0;
    public int suma(int n1,int n2){
        return n1+n2;
    }
    public int resta(int n1,int n2){
        return Math.abs(n1-n2);
    }
}
