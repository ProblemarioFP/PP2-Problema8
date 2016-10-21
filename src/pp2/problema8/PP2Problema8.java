/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema8;
import java.util.*;
/**
 *
 * @author Miguel
 */
public class PP2Problema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double catetoOp,catetoAd,Hipo;    // Declaracion de variables
    
    catetoOp=pedirDato();           //Declaracion de metodos
    catetoAd=pedirDato();
    Hipo= calcularHipo(catetoOp,catetoAd);
    mostrarResultado(catetoOp,catetoAd,Hipo);
    }
    public static double pedirDato() {  //Metodo que pide datos de cateto por teclado
        double dato;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca cateto");
        dato = entrada.nextDouble();
        return dato;
    }
    public static double calcularHipo(double x,double y) { //metodo que devuelve la hipotenusa a partir de dos catetos
        double hip;
        hip = Math.sqrt((x*x)+(y*y));
        return hip;
    }
    public static void mostrarResultado(double x, double y, double z) {     //Metodo que muestra el valor de la hipotenusa
        System.out.println("La hipotenusa de los catetos "+x+ " y "+ y+" es "+z+".");
    }
    
}
