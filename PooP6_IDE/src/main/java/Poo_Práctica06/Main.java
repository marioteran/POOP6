/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo_Práctica06;

/**
 *
 * @author MarioTeran
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Calse empaquetada desde el IDE");
        System.out.println("La suma es: "+suma(2,2));
        System.out.println("nueva linea");
    }
    /**
     * 
     * Retorna una suma de dos enteros a y b
     * @param a primer número entero
     * @param b segundo número entero
     * @return suma de a mas b
     */
    public static int suma (int a, int b){
        return a+b;
    }
}
