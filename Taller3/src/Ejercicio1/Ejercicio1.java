
package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 { 
    
     static int[] A;
     static int[] B;
     static int[] C;
     
     static void prodVendidos (int C[]){
         int suma=0;
         for(int i=0; i<E; i++){
             suma=suma+C[i];
             
         }
         System.out.println("El total de productos vendidos en el dia fué de :" +suma);
     }
      static void ingreVentas (int B[],int C[]){
         int Total=0,SubTotal=0;
         for(int i=0; i<B.length; i++){
             SubTotal=(B[i]*C[i]);
             Total= SubTotal;
         }
             System.out.println("El total de ingresos del día fué de: " + Total);
         }
         static void masVendido (int A[],int C[]){
         int masVendido=C[0];
         for(int i=0; i<C.length; i++){
             if (C[i]>masVendido){
                 masVendido = A[i];
                 
         }
         }
             System.out.println("El producto mas vendido fué el de código: " + masVendido); 
             
             
     }
     static void masCostoso (int A[],int B[]){
         int masCostoso=B[0];
         for(int i=0; i<B.length; i++){
             if (B[i]>masCostoso){
                 masCostoso = A[i];
                 
         }
         }
             System.out.println("El producto mas costoso vendido fué el de código: " +masCostoso);
             
     }
     static int E;
    public static void main(String[] args) {
        
        Scanner lector= new Scanner (System.in);
        System.out.println("cuantos productos que desea ingresar");
        E = lector.nextInt();
        A= new int[E];
        B= new int[E];
        C= new int[E];
         
        for (int i=0; i<A.length; i++){
            System.out.println("ingrese el código del producto");
            A[i]=lector.nextInt(); 
            
            System.out.println("ingrese el valor de venta del producto");
            B[i]=lector.nextInt();
            
            System.out.println("ingrese la cantidad de unidades vendidas del producto");
            C[i]=lector.nextInt();
        }                                         
        prodVendidos(C);
        ingreVentas(B,C);
        masVendido(A,C);
        masCostoso(A,B);
            
    }
    
}
