
package Ejercicio5;



public class Ejercicio5 {
 static int comuna=5;
    static int cand=4;
    static int [][]votos= new int[comuna][cand];
    
        static int candA=0;
        static int candB=0;
        static int candC=0;
        static int candD=0;
        
        static int com1=0;
        static int com2=0;
        static int com3=0;
        static int com4=0;
        static int com5=0;
    
    static void mostrar(int [][] votos){
        
        System.out.println("Comuna\tCand A\tCand B\tCand C\tCand D");
          int a=1;
         for (int i=0; i < votos.length; i++)
            {  
                System.out.print(a+"     ");
                for (int j=0; j < votos[i].length; j++)
                {
                    String value = String.format("%3s", votos[i][j]);
                    System.out.print("   " + value + "  ");
                }
                
                System.out.println();
                a=a+1;
            }
    }
    
    static void votosCand(){
        
        
        
        for (int i = 0; i <comuna; i++) {
            
            for (int j = 0; j <cand; j++) {
                if (j==0) {
                    candA=candA+votos[i][j];
                }else{} 
                    if (j==1) {
                        candB=candB+votos[i][j];
                    }else{}
                        if (j==2) {
                            candC=candC+votos[i][j];
                        }else{}
                            if (j==3) {
                                candD=candD+votos[i][j];
                            }           
            }
          
        }
        
        float totalVotos = candA+candB+candC+candD;
        float porcencandA=(candA*100)/totalVotos;
        float porcencandB=(candB*100)/totalVotos;
        float porcencandC=(candC*100)/totalVotos;
        float porcencandD=(candD*100)/totalVotos;
        
        System.out.println("\nResumen Votaciones");
        
        System.out.println("\nEl candidato A obtuvo un total de: "+candA+" votos, con un porcentaje del "+porcencandA+"%\n");
        System.out.println("El candidato B obtuvo un total de: "+candB+" votos, con un porcentaje del "+porcencandB+"%\n");
        System.out.println("El candidato C obtuvo un total de: "+candC+" votos, con un porcentaje del "+porcencandC+"%\n");
        System.out.println("El candidato D obtuvo un total de: "+candD+" votos, con un porcentaje del "+porcencandD+"%\n");
        
         System.out.println("\nEl Candidato más votado\n");
        
        
        if(candA>candB && candA>candC && candA>candD ) {            
            System.out.println("\nEl canditato A es el que conto con mas votos, con un toltal de: "+candA+" votos\n");            
         }else{
        if(candB>candA && candB>candC && candC>candD ){
            System.out.println("\nEl candidato B es el que conto con mas votos, con un total de: "+candB+" votos\n");
         }else{
        if(candC>candB && candC>candA && candC>candD ){
            System.out.println("\nEl candidato C es el que conto con mas votos, con un total de: "+candC+" votos\n");
        }else{
        if(candD>candB && candD>candA && candD>candA ){
            System.out.println("\nEl candidato D es el que conto con mas votos, con un total de: "+candD+" votos\n");
                 }
              }
           }
        }
        
        
        if(porcencandA>50){
            System.out.println("\nEl candidato A es el Ganador absoluto con mas del 50% de la votación con el: "+porcencandA+"%\n" );
        }else{
        if(porcencandB>50){
            System.out.println("\nEl candidato B es el Ganador absoluto con mas del 50% de la votación con el: "+porcencandB+"%\n" );
        }else{
        if(porcencandC>50){
            System.out.println("\nEl candidato C es el Ganador absoluto con mas del 50% de la votación con el: "+porcencandC+"%\n" );
        }else{
        if(porcencandD>50){
            System.out.println("\nEl candidato D es el Ganador absoluto con mas del 50% de la votación con el: "+porcencandD+"%\n" );            
        }else{
            System.out.println("\nNo hay ganador absoluto\n" );
             }
        }
    }
  }
}
    static void resulComunas(){
        
        for (int j = 0; j <cand; j++) {
                
             for (int i = 0; i <comuna; i++) {
                if (i==0) {
                    com1=com1+votos[i][j];
                }else{} 
                    if (i==1) {
                        com2=com2+votos[i][j];
                    }else{}
                        if (i==2) {
                            com3=com3+votos[i][j];
                        }else{}
                            if (i==3) {
                                com4=com4+votos[i][j];
                            }else{}
                              if(i==4){
                                 com5=com5+votos[i][j];
                            }
            }
        }
        
        float votoscomu=com1+com2+com3+com4+com5;
        
        float porcencomuna1=(com1*100)/votoscomu;
        float porcencomuna2=(com2*100)/votoscomu;
        float porcencomuna3=(com3*100)/votoscomu;
        float porcencomuna4=(com4*100)/votoscomu;
        float porcencomuna5=(com5*100)/votoscomu;
        
        System.out.println("\nVotos por Comunas\n");
        
        System.out.println("La comuna 1 obtuvo un total de: "+com1+" votos, con un porcentaje del: "+porcencomuna1+"%\n");
        System.out.println("La comuna 2 obtuvo un total de: "+com2+" votos, con un porcentaje del: "+porcencomuna2+"%\n");
        System.out.println("La comuna 3 obtuvo un total de: "+com3+" votos, con un porcentaje del: "+porcencomuna3+"%\n");
        System.out.println("La comuna 4 obtuvo un total de: "+com4+" votos, con un porcentaje del: "+porcencomuna4+"%\n");
        System.out.println("La comuna 5 obtuvo un total de: "+com5+" votos, con un porcentaje del: "+porcencomuna5+"%\n");
        
        if(porcencomuna1>porcencomuna2 && porcencomuna1>porcencomuna5 && porcencomuna1>porcencomuna4 && porcencomuna1>porcencomuna5) {            
            System.out.println("\nLa comuna 1 fue la que mas porcentaje tuvo, con el: "+porcencomuna1+"% \n");
        }else{
           if(porcencomuna2>porcencomuna3 && porcencomuna2>porcencomuna5 && porcencomuna2>porcencomuna4 && porcencomuna2>porcencomuna1){             
               System.out.println("\nLa comuna 2 fue la que mas porcentaje tuvo, con el: "+porcencomuna2+"% \n");
           }else{
              if(porcencomuna3>porcencomuna2 && porcencomuna3>porcencomuna5 && porcencomuna3>porcencomuna4 && porcencomuna3>porcencomuna1){             
                  System.out.println("\nLa comuna 3 fue la que mas porcentaje tuvo, con el: "+porcencomuna3+"% \n");
            }else{
              if(porcencomuna4>porcencomuna3 && porcencomuna4>porcencomuna5 && porcencomuna4>porcencomuna2 && porcencomuna4>porcencomuna1){             
                  System.out.println("\nLa comuna 4 fue la que mas porcentaje tuvo, con el: "+porcencomuna4+"% \n");
                 }else{
              if(porcencomuna5>porcencomuna3 && porcencomuna5>porcencomuna2 && porcencomuna5>porcencomuna4 && porcencomuna5>porcencomuna1)             
                      System.out.println("\nLa comuna 5 fue la que mas porcentaje tuvo, con el: "+porcencomuna5+"% \n");
               }
            }
    
        }
      }
    }
    
    public static void main(String[] args) {
          
        
        votos[0][0]=194;
        votos[0][1]=48;
        votos[0][2]=206;
        votos[0][3]=45;
        
       
        votos[1][0]=180;
        votos[1][1]=20;
        votos[1][2]=320;
        votos[1][3]=16;
        
        votos[2][0]=221;
        votos[2][1]=90;
        votos[2][2]=140;
        votos[2][3]=20;
     
        votos[3][0]=432;
        votos[3][1]=50;
        votos[3][2]=821;
        votos[3][3]=14;
        
        votos[4][0]=820;
        votos[4][1]=61;
        votos[4][2]=947;
        votos[4][3]=18;
        
        mostrar(votos);
        votosCand();
        resulComunas();
    }
    
    
    
}

    
                
      
       