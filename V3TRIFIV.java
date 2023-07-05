package pkg4.v3trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V3TRIFIV {

   
    public static void main(String[] args) throws IOException {
       BufferedReader bufEntrada=new BufferedReader(new InputStreamReader(System.in));
         int numero;
       //ENTRA DE DATOS
         System.out.println("Dame el numero");
         numero = Integer.parseInt(bufEntrada.readLine());
        
         //SALIDA DE DATOS
         System.out.println(retornoMultilpo(numero) );
    }
    
    public static String retornoMultilpo(int num){
         int mult3;
         int mult5;
         
          //PROCESAR DATOS
         mult3 = num % 3;
         mult5 = num % 5;
         
       //Salida de datos 
        if( mult3 == 0 && mult5 == 0){
             return "TRIFV"; 
         }else if(mult3 == 0){
             return "TRI"; 
         }else if(mult5 == 0){
             return"FIV";  }
       
        return "Ningun Valor";   
    }
}


