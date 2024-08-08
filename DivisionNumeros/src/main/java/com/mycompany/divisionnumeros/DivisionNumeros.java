/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divisionnumeros;

import java.util.*;

public class DivisionNumeros {
    
    public static int Division(int n1, int n2){
        return n1/n2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int resultado = Division(numero1, numero2);
        System.out.println("El resultado es: "+resultado);
    }
}
