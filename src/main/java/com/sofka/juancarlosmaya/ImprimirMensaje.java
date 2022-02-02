package com.sofka.juancarlosmaya;

import java.util.Scanner;

public class ImprimirMensaje {
    public static void main(String[] args)
    {
        String nombreUsuario;
        String edad;
        String celular;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        nombreUsuario = teclado.nextLine();

        System.out.println("Ingrese su edad");
        edad = teclado.nextLine();

        System.out.println("Ingrese su celular");
        celular = teclado.nextLine();

        System.out.println("Bienvenido señor "+nombreUsuario+", es un placer para nosotros contar con " +
                "una persona de "+edad+" años.\nPróximamente nos comunicaremos con usted al numero "+celular+
                ".\nFeliz día");
    }
}
