package com.mycompany.calidadypruebasdesoftware;
import java.util.Scanner;

public class Fibonacci {

    public int recursivo(int n){
  if (n==0){
      return 0;
  }
  else if (n==1){
      return 1;
  }
  else 
 { 
    return recursivo(n-1) + recursivo(n-2);
  }
}
    
    public int iterativo(int n){
    int arreglo[]= new int[n+1];
    arreglo[0]=0;
    arreglo[1]=1;
    int x=0,y=1;
    
    if (n==0){
      return 0;
  }
  else if (n==1){
      return 1;
  }
  else 
 { 
     do {
         arreglo[y+1]=(arreglo[x]+arreglo[y]);
         x=y;
         y++;
     } while (y!=n);
     return arreglo[y];
  }
    }
    
    public static void main(String[] args) {
        Fibonacci f= new Fibonacci();
        Scanner s=new Scanner(System.in);
        System.out.println("Ingresa numero...");
        int numero= s.nextInt();
        System.out.println("RECURSIVO\n"+f.recursivo(numero));
        System.out.println("ITERATIVO\n"+f.iterativo(numero));
    }
    
}
// 0 1 1 2 3 5 8 13    
// 0 1 2 3 4 5 6 7