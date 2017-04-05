/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pincipal;

import Factorial.FactorialN;

/**
 *
 * @author merco_000
 */
public class Principal {
    public static void main(String[] arg){
        mostrarFactorial();
       }
    public static void mostrarFactorial (){
        FactorialN fac=new FactorialN();
        fac.asignarValor(3);
        int res=fac.obtenerFactorial();
        System.out.println("El factorial es: "+res);
         
         }
}
