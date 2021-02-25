/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.Ejercicios;
import java.util.Scanner;
/**
 *
 * @author misae
 */
public class Circunferencia {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        double radio, circunferencia;
        System.out.println("Capture el radio del circulo:");
        radio = scanner.nextDouble();
        circunferencia = 2 * radio * Math.PI;
        System.out.println("La circunferencia del circulo es:" +circunferencia);
        
    }
}
