package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class Solucion {
	
	private static int I;
	
	public Solucion() {
		
		I = Integer.MAX_VALUE; //Infinito
		
	}
	
	public static int minimo(int a, int b) {
		return (b<a)? b:a;
		
	}

	public static int [][] operar(int [] lista, int n, int c){
		
		int elementoMax = n + 1;
		int cant = c + 1;
		int [][] tabla = new int[elementoMax][cant];
		
		for (int i = 0; i < elementoMax; i++) {
			tabla[i][0] = 0;
		}
		
		for (int i = 1; i < cant; i++) {
			tabla[0][i] = I;
		}
		
		int a, b;
		
		for (int i = 1; i < elementoMax; i++) {
			
			for (int j = 1; j < cant; j++) {
				
				a = tabla [i-1][j];
				
				if(lista[i-1] <= j) {
					
					b = tabla [i-1][j-lista[i-1]];
					
					if (b<I) b += lista[i-1];
					
					}else {
						
						b = lista[i-1];
						
					}
				
					if(b >= j) {
						
						tabla[i][j] = minimo(a, b);
						
					}else {
						
						tabla[i][j] = I;
						
					}
				}
			}
		
		return tabla;

	}
	
	private static Object[] resultado(int[][] t, int[] l, int n, int c ) {
		
		List<Integer> r = new ArrayList<Integer>();
		
		int i = n;
		
		int j = c;
		
		while( i > 0 && j > 0) {
			
			if(t[i][j]==t[i-1][j]) {
				
				i--;
				
			}else {
				
				r.add(i-1);
				
				j -= l[i-1];
				
				i--;
				
			}
		}
		
		return r.toArray();
		
	}
	
	public static void imprimir(int[] lista, int c) {
		
		int[][] tabla = operar(lista, lista.length, c);
		
		for (int i = 0; i < tabla.length; ++i) {
			
			for (int j = 0; j < tabla[0].length; ++j) {
			
				System.out.println("[" + tabla[i][j] + "]");
				
			}
			
			System.out.println();
			
		}
		
		Object[] r = resultado(tabla, lista, lista.length, c);
	     
	     System.out.println("Lista :");
	     for(int i:lista){
	      System.out.print("["+i+"]");
	     }
	     
	     System.out.println();
	  

	     Formatter f = new Formatter();
	     f.format("Total a consumir: %s calorías", c);
	     System.out.println(f.toString());
	     
	     
	     int suma=0;
	   
	     
	     for(Object n : r) {
	      int valor=(Integer)n;
	      suma+=lista[valor];
	      Formatter f1 = new Formatter();
	      f1.format("Plato %s = %s calorías", valor+1, lista[valor]);
	      System.out.println(f1.toString());
	     }
	     Formatter f2 = new Formatter();
	     f2.format("Total consumido:  %s calorías", suma);
	     System.out.println(f2.toString());
	     
	 }
	
}
