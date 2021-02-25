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
public class NumerosIguales {
    public static void main(String[]args)
    {
        double numero1,numero2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Capture el primer valor");
        numero1 = scanner.nextDouble();
        System.out.println("Capture el segundo valor");
        numero2 = scanner.nextDouble();
        if(numero1 == numero2)
        {
            System.out.println("Los numeros son iguales");
        }
        else
        {
            System.out.println("Los numero no son iguales");
        }
        
    }
    
}
