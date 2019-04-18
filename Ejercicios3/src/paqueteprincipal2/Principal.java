/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal2;
//import paquetedatos2. *;
import paquetedatos2.Variable;
import paquetedatos2.Variabledos;

/**
 *
 * @author Usuario iTC
 */
public class Principal {
    public static void main(String[] args) {
    double resultado;
    resultado = Variable.numero1 + Variable.numero2;
    
    System.out.printf("El resultado es: %.1f\n", resultado);
    
    resultado = Variable.numero1 + Variabledos.numero3;
    
    System.out.printf("El resultado es: %.1f\n", resultado);
    
    }
    
}
