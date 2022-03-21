
package Ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {
    static String[]E;
    static int[]H;
    static int[]T;
    
    static int n;
    
    static void calcularSueldo(int H[],int T[],String  E[]){
        double Sueldo;
        for (int i=0; i<E.length; i++){
            if(H[i]<=40){
                Sueldo=H[i]*T[i];
            }
            else{
                Sueldo=(40*T[i])+(H[i]-40)*(T[i]*1.5);
                

            }
            System.out.println("El sueldo del empleado " +E[i] +" es: " +Sueldo);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner lector= new Scanner (System.in);
        System.out.println("cuantos empleados desea ingresar");
        n = lector.nextInt();
        E= new String[n];
        H= new int[n];
        T= new int[n];
         
        for (int i=0; i<E.length; i++){
            System.out.println("ingrese el nombre del empleado " +i );
            E[i]=lector.next();
                    
            
            System.out.println("ingrese las horas trabajadas");
            H[i]=lector.nextInt();
            
            System.out.println("ingrese la tarifa por horas del empleado:");
            T[i]=lector.nextInt();
            
           calcularSueldo(H,T,E);
           
        }
}
}
