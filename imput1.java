package calculadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author CESAR
 */
public class imput1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        
        int selectoperacion = 0;
        double numero1 = 0;
        double numero2 = 0;
        double resultado = 0;
        
        do{
            
            System.out.println("\n");
            System.out.println("Seleccione un numero de operacion a realizar");
            System.out.println("1. -SUMA");
            System.out.println("2. -RESTA");
            System.out.println("3. -MULTIPLICACION");
            System.out.println("4. -DIVISION");
            System.out.println("5. -FUNCION TRIGONOMETRICA SEN");
            System.out.println("6. -FUNCION TRIGONOMETRICA COS");
            System.out.println("7. -FUNCION TRIGONOMETRICA TAN");
            System.out.println("8. -RAIZ ENESIMA");
            System.out.println("9. -POTENCIA ENESIMA");
            System.out.println("10. -PORCENTAJE IVA");
            System.out.println("11. -SALIR");
            selectoperacion = leer.nextInt();
            
            
            if(selectoperacion !=11){
                System.out.println("Para raiz enesima el indice sera el numero1 y radicando numero2");
                System.out.println("Para potencia numero1 es base y numero 2 exponente");
                System.out.println("Para funciones trigonometricas cada numero digitado contara como calculo aparte");
                System.out.println("Para calculo de IVA, numero1 es precio sin IVA y numero2 es el valor del IVA sin porcentaje");
                System.out.println("Inserte primer número: ");
                numero1 = leer.nextInt();
                System.out.print("Inserte segundo número: ");
                numero2 = leer.nextInt();
            }
            switch(selectoperacion){
                case 1:
                    selectoperacion = 1;
                    resultado = numero1 + numero2;
                    System.out.println("El resultado de la suma es:" + resultado);
                    break;
                 case 2:
                    selectoperacion = 2;
                    resultado = numero1 - numero2;
                    System.out.println("El resultado de la resta es:" + resultado);
                    break;
                case 3:
                    selectoperacion = 3;
                    resultado = numero1 * numero2;
                    System.out.println("El resultado de la multiplicación es:" + resultado);
                    break;
                case 4:
                    selectoperacion = 4;
                    resultado = numero1 / numero2;
                    System.out.println("El resultado de la división es:" + resultado);
                    break;
                case 5:
                    selectoperacion = 5;
                    double resultado2 = 0;
                    System.out.println("Digite el angulo, el sistema lo pasara a radianes y se efectuara la operacion");
                    numero1 = numero1 * Math.PI/2;
                    numero2 = numero2 * Math.PI/2;
                    System.out.println(Math.sin(numero1));
                    resultado = leer.nextDouble();
                    System.out.println("La respuesta de la funcion trigonometrica SEN para el primer numero es: " + resultado);
                    System.out.println(Math.sin(numero2));
                    resultado2 = leer.nextDouble();
                    System.out.println("La respuesta de la funcion trigonometrica SEN para el segundo numero es: " + resultado2);
                    break;
                case 6:
                    selectoperacion = 6;
                    double resultado3 = 0;
                    System.out.println("Digite el angulo, el sistema lo pasara a radianes y se efectuara la operacion");
                    numero1 = numero1 * Math.PI/2;
                    numero2 = numero2 * Math.PI/2;
                    System.out.println(Math.cos(numero1));
                    resultado = leer.nextDouble();
                    System.out.println("La respuesta de la funcion trigonometrica SEN para el primer numero es: " + resultado);
                    System.out.println(Math.cos(numero2));
                    resultado2 = leer.nextDouble();
                    System.out.println("La respuesta de la funcion trigonometrica SEN para el segundo numero es: " + resultado3);
                    break;
                case 7:
                    selectoperacion = 7;
                    double resultado4 = 0;
                    System.out.println("Digite el angulo, el sistema lo pasara a radianes y se efectuara la operacion");
                    numero1 = numero1 * Math.PI/2;
                    numero2 = numero2 * Math.PI/2;
                    System.out.println(Math.tan(numero1));
                    resultado = leer.nextDouble();
                    System.out.println("La respuesta de la funcion trigonometrica SEN para el primer numero es: " + resultado);
                    System.out.println(Math.tan(numero2));
                    resultado2 = leer.nextDouble();
                    System.out.println("La respuesta de la funcion trigonometrica SEN para el segundo numero es: " + resultado4);
                    break;
                case 8:
                    selectoperacion = 8;
                    resultado = (float) Math.pow(numero2, 1 / numero1);
                    System.out.println("La raiz " + numero1 + " de " + numero2 + " es : " + resultado);
                case 9:
                    selectoperacion = 9;
                    resultado = (float) Math.pow(numero1, numero2);
                    System.out.println("La potencia de" + numero1 + "elevado a" + numero2 + "es : " + resultado);
                case 10:
                    selectoperacion = 10;
                    resultado = (numero1 +((numero2/100)*numero1));      
            }
        }while(selectoperacion != 11);
        System.out.println("Eligio salir de la calculadora, hasta la proxima.");
        
    }
    
}
