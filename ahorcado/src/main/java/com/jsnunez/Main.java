package com.jsnunez;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         int aleatorio = (int)Math.floor(Math.random()*10);
      // System.out.println(aleatorio);
       ArrayList<String> palabras = new ArrayList<>();
       ArrayList<String> oculta = new ArrayList<>();
       ArrayList<String> letras = new ArrayList<>();
       palabras.add("esternocleidomastoideo");
       palabras.add("biblioteca");
       palabras.add("camarografo");
       palabras.add("javascript");
       palabras.add("campuslands");
       palabras.add("parangaricutirimicuaro");
       palabras.add("hashtag");
       palabras.add("carmentea");
       palabras.add("ferreteria");
       palabras.add("piedecuesta");


      /* for(String item : palabras){
           System.out.println(item);
       }*/
     
       String elemento = palabras.get(aleatorio);
       // System.out.println(elemento);
        int contador=0;
        int vidas=3;
       int longitud = elemento.length();
     //  System.out.println(longitud);
       String[] separado = elemento.split("");
       ArrayList<String> separados = new ArrayList<String>(Arrays.asList(separado));
      // System.out.println(separados);

       for (int i=1;i<=longitud;i++){
        oculta.add("_");
        
       }
       System.out.println(oculta);


      try(Scanner sc = new Scanner(System.in)){
        while(vidas>0){
            if(contador==longitud){
                System.out.println("felicitaciones ganaste");
                break;
            }
       System.out.println("Ingrese una letra");
       String letra =sc.nextLine();
      
      // System.out.println(letra);
       int x =separados.indexOf(letra);
      // System.out.println(x); 
        int s=letras.indexOf(letra);
        

       if (x==-1 ) {
        letras.add(letra);
        if (s>=0) {
        //    System.out.println(s);
      //      System.out.println(letras);
            System.out.println("la letra esta repetida");
            vidas++;
        }
        vidas--;
        System.out.println("Tienes "+vidas+ " vidas");
        if (vidas==0) {
            System.out.println("perdiste");
        }
    
       }else{
        letras.add(letra);
        while (x>=0) {
            
            x=separados.indexOf(letra);
            if (x==-1) {
                break;
            }
            contador++;
            oculta.set(x, letra);
            separados.set(x,"_");
  
       
     //       System.out.println(letras);
        }
        System.out.println(oculta);

       }

       }

    }


   }

}