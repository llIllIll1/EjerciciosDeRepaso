/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeLogica;
import java.util.Scanner;
/**
 *
 * @author misae
 */
public class Ordenar3 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Numero 1: ");
        n1 = scanner.nextInt();
        System.out.println("Numero 2: ");
        n2 = scanner.nextInt();
        System.out.println("Numero 3: ");
        n3 = scanner.nextInt();
        
        
        if(n1>n2 && n1>n3)
        {
            if(n2>n3)
            {
                System.out.println("El orden correcto es:" + n1 + n2 + n3);
            }
            else
            {
                System.out.println("El orden correcto es:" + n1 + n3 + n2);
            }
        }
        else if(n2>n1 && n2>n3)
        {
            if(n1>n3)
            {
                System.out.println("El orden correcto es:" + n2 + n1 + n3);
            }
            else
            {
                System.out.println("El orden correcto es:" + n2 + n3 + n1);
            }
        }
        else if(n1>n2)
        {
            System.out.println("El orden correcto es:" + n3 + n1 + n2);
        }
        else
        {
            System.out.println("El orden correcto es:" + n3 + n2 + n1);
        }
        
    }
}
