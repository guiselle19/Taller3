
package Ejercicio2;

import java.util.Scanner;




public class Ejercicio2 {
    static Scanner entrada = new Scanner (System.in);
    static void ingresousuarios(){
    int limitepermitido=500000;
    System.out.println("ingrese el monto a inicios de mes: ");
    int saldoinicial= entrada.nextInt();
    
    System.out.println("Total aplicado en deducciones: 1000000");
    int dedu=1000000;
    
    System.out.println("ingrese el total de dinero abonado en el mes");
    int abonomensual = entrada.nextInt(); 

    int balance=(saldoinicial+abonomensual)-dedu;
  
    if(balance<0){
        System.out.println("Se excedió del limite de crédito");
    
    }else{
        System.out.println("Se ha renovado su crédito");
    }
}
    
static void usuarios(){
    int personas=0;
    
    do{
        System.out.println(
            "Elija su nombre de usuario\n"
            +"1. edwin \n"
            +"2. German \n"
            +"3. alexander \n"
            +"4. Salir\n");
        personas=entrada.nextInt();
        switch(personas){
            case 1:
                System.out.println("Adelante"); 
                ingresousuarios();
                break;
                    case 2:
                        System.out.println("Adelante"); 
                        ingresousuarios();
                        break;
                            case 3:
                                System.out.println("Adelante"); 
                                ingresousuarios();
                                break;
                                    case 4:
                                            personas=4;
                                                    System.out.println("Vuelva pronto"); 
                                                    break;
                                                        default:
                                                            System.out.println("Opción incorrecta");
                                                            break;
        }

    }while(personas!=4);
    
}
   
    
    public static void main(String[] args) {
      usuarios();  
    }
}
    

