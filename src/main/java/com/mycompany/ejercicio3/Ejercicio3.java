
package com.mycompany.ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        // comparación de dos números
        System.out.println("Comparación de dos números");
        System.out.println("Ingrese un número");
        double num1 = sp.nextDouble();
        System.out.println("Ingrese otro número");
        double num2 = sp.nextDouble();
        if (num1==num2) {
            System.out.println("Los números son iguales: " + num1+ " = "+ num2);     
        }else {
            System.out.println("Los números no son iguales: " + num1 + " != " + num2);}
        // número positivo o negativo
        System.out.println("Identificación de número positivo o negativo" );
        System.out.println("Ingreso cualquier numero");
        double num3 = sp.nextDouble();
        if (num3 >= 0) {
            System.out.println("El número es positivo");
        }else {
            System.out.println("El número es negativo");}
        // número mayor
        System.out.println("Impresión de mayor a menor de 2 números");
        System.out.println("Ingrese un número");
        double num4 = sp.nextDouble();
        System.out.println("Ingrese otro número");
        double num5 = sp.nextDouble();
        if (num4<num5) {
            System.out.println("Los números ordenados de mayor a menos son: "+ num5 + " , "+ num4);        
        }   else if (num4>num5){
            System.out.println("\"Los números ordenados de mayor a menos son: "+ num4 + " , "+ num5);}
        else{
            System.out.println("los números son iguales");}
        // 3 números mayores
        System.out.println("Impresión de mayor a menor de 3 números");
        System.out.println("Ingrese un número");
        double num6 = sp.nextDouble();
        System.out.println("Ingrese un segundo número");
        double  num7 = sp.nextDouble();
        System.out.println("Ingrese un tercer número");
        double  num8 = sp.nextDouble();
        if ((num6>num7) && (num7>num8)) {
            System.out.println("Los números ordenados de mayor a menor son: "+ num6 +","+num7+","+num8);
        }   else if ((num6>num8) && (num8>num7)) {
            System.out.println("Los números ordenados de mayor a menor son: "+ num6 +","+num8+","+num7);
        }   else if ((num7>num6) && (num6>num8)) {
            System.out.println("Los números ordenados de mayor a menor son: "+ num7 +","+num6+","+num8);
        }   else if ((num8>num6) && (num6>num7)) {
            System.out.println("Los números ordenados de mayor a menor son: "+ num8+","+num6+","+num7);
        }   else if ((num8>num7) && (num7>num6)) {
            System.out.println("Los números ordenados de mayor a menor son: "+ num8+","+num7+","+num6);
        }   else if ((num7>num8) && (num8>num6)) {
            System.out.println("Los números ordenados de mayor a menor son: "+ num7+","+num8+","+num6);
        }
        // día mes año1
        System.out.println("Impresión de fecha");
        System.out.println("Ingrese el día en números:");
        int dia =sp.nextInt();
        System.out.println("Ingrese el mes en números:");
        int mes = sp.nextInt();
        System.out.println("Ingrese el año en números");
        int ano =sp.nextInt();
        if ((dia<1) || (dia>31)) {
            System.out.println("Dato erroneo para dia");
        } else if ((mes<1) || (mes>12)) {
            System.out.println("Dato erroneo para mes");
        } else if ((ano<1) || (ano>9999)) {
            System.out.println("Dato erroneo para año");
        } else if ((mes == 2) && (dia >28)){
            System.out.println("Febrero no puede tener más de 28 días");
        } else if ((mes == 4) || (mes == 6) || (mes == 9 ) || (mes == 11) && (dia == 31)) {
            System.out.println("Los meses de Abril, Junio, Septiembre y Noviembre no pueden tener 31 días");
        } else
        switch (mes){
            case 1:
                System.out.println("La fecha ingresada es: " + dia + " de Enero " + "del "+ ano);
                break;
            case 2:
                System.out.println("La fecha ingresada es: " + dia + " de Febrero " + "del "+ ano);
                break;
            case 3:
                System.out.println("La fecha ingresada es: " + dia + " de Marzo " + "del "+ ano);
                break;
            case 4:
                System.out.println("La fecha ingresada es: " + dia + " Abril " + "del "+ ano);
                break;
            case 5:
                System.out.println("La fecha ingresada es: " + dia + " de Mayo " + "del "+ ano);
                break;
            case 6:
                System.out.println("La fecha ingresada es: " + dia + " de Junio " + "del "+ ano);
                break;
            case 7:
                System.out.println("La fecha ingresada es: " + dia + " de Julio " + "del "+ ano);
                break;
            case 8:
                System.out.println("La fecha ingresada es: " + dia + " de Agosto " + "del "+ ano);
                break;
            case 9:
                System.out.println("La fecha ingresada es: " + dia + " de Septiembre " + "del "+ ano);
                break;
            case 10:
                System.out.println("La fecha ingresada es: " + dia + " de Octubre " + "del "+ ano);
                break;
            case 11:
                System.out.println("La fecha ingresada es: " + dia + " de Noviembre " + "del "+ ano);
                break;
            case 12:
                System.out.println("La fecha ingresada es: " + dia + " de Diciembre " + "del "+ ano);
                break;    
        }  
   
    }
}
    

