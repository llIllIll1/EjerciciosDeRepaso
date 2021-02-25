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
public class AdivinaNumero {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        int NumeroAleatorio = (int) ((Math.random()*100)+1);
        
        System.out.println("Trate de adivinar el numero! ");
        int Valor = scanner.nextInt();
        for(int i=1; i<100; i++)
        {
            if(Valor == NumeroAleatorio)
            {
                System.out.println("El numero es idéntico que el número secreto!.."+Valor);
                break;
            }
            else if(Valor > NumeroAleatorio)
            {
                System.out.println("El numero que haz colocado es menor que el número secreto.."+Valor);
            }
            else if(Valor < NumeroAleatorio)
            {
                System.out.println("El numero que haz colocado es mayor que el número secreto.."+Valor);
            }
            if(i>0)
            {
                System.out.println("Intenteló nuevamente :b ");
                Valor = scanner.nextInt();
            }
        }
    }
}
