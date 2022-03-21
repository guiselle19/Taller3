
package Ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {
    static int[] ventas;
    
    
    
    
    static void casoA(){
        int suma =0;
        int val1=0, val2 = 0, val3, val4, val5, val6, val7;
        for (int e=0; e<ventas.length; e++){
            suma= suma + ventas[e];
            val1= (int) (suma*0.09);
        } 
        
        if (suma>3000 && suma<5000){
        val2=(int) (suma*0.05);
        val3=suma+val1+val2+200;
            System.out.println("El pago semanal de este trabajador para la categoria A es de: "+val3);     
        }
        
        else if(suma>=5000 && suma<=7000){
        val4=(int)(suma*0.07);
        val5=suma+val1+val4+200;
            System.out.println("El pago semanal de este trabajador para la categoria A es de: "+val5);
        }
        
        else if(suma>7000){
        val6=(int)(suma*0.1);
        val7=suma+val1+val6+200;
            System.out.println("El pago semanal de este trabajador para la categoria A es de: "+val7);                 
        }
        
        else if(suma<3000){
            System.out.println("Las ventas de la semana no fueron suficientes para alcanzar la categoria A");
        }
        
    }
    static void casoB(){
    int suma =0;
    int val1=0, val2 = 0, val3, val4, val5, val6, val7;
        for (int e=0; e<ventas.length; e++){
            suma= suma + ventas[e];
            val1= (int) (suma*0.09);         
        } 
    if (suma>5000 && suma<10000){   
        val2=(int) (suma*0.07);
        val3=suma+val1+val2+200;
        System.out.println("El pago semanal de este trabajador para la categoria B es de: "+val3);
    }
    else if(suma>=10000 && suma<=15000){
        val4=(int)(suma*0.1);
        val5=suma+val1+val4+200;
        System.out.println("El pago semanal de este trabajador para la categoria B es de: "+val5);
    }
    else if(suma>15000){
        val6=(int)(suma*0.13);
        val7=suma+val1+val6+200;
        System.out.println("El pago semanal de este trabajador para la categoria B es de: "+val7);                 
    }
    else if(suma<5000){
        System.out.println("Las ventas de la semana no fueron suficientes para alcanzar la categoria B");
    }
        
    }
    
    static void ingresodatos(){
         
        String vendedor;
        Scanner lector=new Scanner(System.in);
        ventas = new int [8];
        
        System.out.println("Ingrese su nombre");
        vendedor=lector.nextLine();
        
        for (int e = 1; e <ventas.length; e++) {
            System.out.println("Ingrese el valor de sus ventas del dia " +e);
            ventas[e]=lector.nextInt();
        }
    
        casoA();
        casoB();
    }   
    public static void main(String[] args) {
        ingresodatos();
    }
}
    

