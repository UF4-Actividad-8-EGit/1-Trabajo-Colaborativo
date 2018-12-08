package newpack.jar;

import java.util.Scanner;

public class Dados {
	    static int MAX=20;
	    static int numeroDeCarasDelDado;
	    static int a1[]=new int[MAX];
	    static int a2[]=new int[MAX];
	    static int a3[]=new int[MAX];
	    static int pares[]=new int[MAX];
	     
	    static void rellenaraleatorios(int x[], int y[], int z[], int numeroDeCarasDelDado){
	        for(int i=0;i<x.length;i++)
	        {
	            x[i]=(int)(Math.random()*numeroDeCarasDelDado+1);
	            y[i]=(int)(Math.random()*numeroDeCarasDelDado+1);
	            z[i]=(int)(Math.random()*numeroDeCarasDelDado+1);
	        }
	    }
	         
	    //comentario de Ismael. 
	    
	    static void imprimir(int x[],String dado1,int y[],String dado2,int z[],String dado3){
	        for(int i=0;i<x.length;i++){
	             
	            System.out.print("Lanzamiento "+(i+1)+" : \t"); 
	            System.out.print(dado1+"["+i+"]="+x[i]+"\t");
	            System.out.print(dado2+"["+i+"]="+y[i]+"\t");
	            System.out.println(dado3+"["+i+"]="+z[i]+"\t");
	            revisarVector(x[i],y[i],z[i]);
	        }
	    }
	     
	    static void revisarVector(int dado1,int dado2,int dado3){
	         //for(int i=0;i<m.length;i++){
	            if(dado1==5 && dado2==3 && dado3==6)
	            {
	            System.out.println("100 veces la apuesta.");                
	            }
	       //else if(dado1==6 && dado2==6 && dado3==6)
	 
	        //}
	        //return pos;
	    }
	    public static void main(String[] args) {
	    	//Modificacion ==> Posibilidad de elegir el numero de caras del dado
	    	Scanner lector = new Scanner(System.in);
			System.out.println("Escribe el numero de caras del dado:");
			//Pido numeros hasta que meta uno valido (natural positivo)
			do {
			    while (!lector.hasNextInt()) lector.next();
			    numeroDeCarasDelDado = lector.nextInt();
			} while (numeroDeCarasDelDado <= 0);
			lector.close();
	    	//Introducimos modificaciones
	    	System.out.println("*******************************INICIO PARTIDA*************************");
	    	rellenaraleatorios(a1,a2,a3, numeroDeCarasDelDado);
	    	imprimir(a1,"Dado 1",a2,"Dado 2",a3,"Dado 3");
	    	System.out.println("*******************************FIN PARTIDA****************************");
	    }
}
