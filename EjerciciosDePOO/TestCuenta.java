/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDePOO;
/**
 *
 * @author misae
 */
public class TestCuenta {

    public static void main(String[] args) throws Exception {
        Cuenta pedro = new Cuenta("Pedro", 300);
        Cuenta fernando = new Cuenta("Fernando", 300);
        
        pedro.ingresar(300);
        fernando.ingresar(400);

        pedro.retirar(500);
        fernando.retirar(100);

        System.out.println("-----");

        System.out.println(pedro);
        System.out.println(fernando);

    }

}