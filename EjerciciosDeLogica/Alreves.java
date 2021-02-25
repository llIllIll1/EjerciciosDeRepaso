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
public class Alreves {
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero del 0 al 9999");
        String Numero,AlReves = "";
        Numero = scanner.nextLine();
        
        for(int x = Numero.length() ; x !=0 ;x --)
        {
            AlReves += Numero.substring(x-1,x);
        }
        System.out.println("Numero al reves :" + AlReves);
        
    }
    
}
