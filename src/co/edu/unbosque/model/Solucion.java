package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

import co.edu.unbosque.view.NutritionistView;

/***
 * 
 * Creamos una clase llamada Solución para contener la lógica principal del algoritmo
 * dinámico a implementar.
 * 
 * @author R00TS0FTW0RKS
 * 
 */

public class Solucion {
	
	NutritionistView g;
	
	private static int I;
	
	/***
	 * 
	 * Constructor de la clase Solucion.
	 * Inicializa la constante I con el valor máximo de un entero (infinito).
	 * 
	 */
	
	public Solucion() {
		
		g = new NutritionistView();
		
		I = Integer.MAX_VALUE; //Infinito
		
	}
	
	/***
	 * 
	 * Método para obtener el mínimo entre dos números.
	 * @param a Primer número.
	 * @param b Segundo número.
	 * @return El valor mínimo entre a y b.
	 * 
	 */
	
	public int minimo(int a, int b) {
		return (b<a)? b:a;
		
	}
	
	/***
	 * 
	 * Este método se encarga de calcular y llenar la tabla de operaciones de manera eficiente.
	 * @param lista Arreglo con las calorías de los platos.
	 * @param n Número de elementos en la lista.
	 * @param c Cantidad total de calorías deseada.
	 * @return Una tabla bidimensional con los resultados intermedios.
	 * 
	 */

	public int [][] operar(int [] lista, int n, int c){
		
		/***
		 * 
		 * Inicialización: 
		 * 
		 * 1. elemento max se establece en n+1.
		 * 2. cant se establece en c + 1.
		 * 3. Matriz2D 'tabla' dimensionada: elementoMax por cant
		 * 
		 */
		
		int elementoMax = n + 1;
		int cant = c + 1;
		int [][] tabla = new int[elementoMax][cant];
		
		//La primera columna de tabla se establece en 0.
		
		for (int i = 0; i < elementoMax; i++) {
			tabla[i][0] = 0;
		}
		
		//La primera fila de tabla, excepto el primer elemento se establece en I (Infinito)
		
		for (int i = 1; i < cant; i++) {
			tabla[0][i] = I;
		}
	
		/***
		 * Programación dinámica:
		 * 
		 * 1. Dos bucles anidados iteran sobre los elementos de 'tabla' comenzando en
		 * la posición 1,1.
		 * 
		 * 2. Se asigna el valor de a en la posición i-j , j.
		 * 
		 * 3. Si el elemento actual en lista es menor o igual a j, entonces 
		 * b recibe el valor en [i-1][j-lista[i-1]] y se ajusta.
		 * 
		 * 4. Si el elemento actual en lista es mayor que j, entonces 
		 * b recibe el valor del elemento actual en lista.
		 * 
		 * 5. El valor en la posición [i][j] en tabla se actualiza.
		 * 
		 */
		
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
	
	/***
	 * 
	 * Método privado para obtener el resultado final, es decir, la selección óptima de platos.
	 * 
	 * @param t Tabla con los resultados intermedios.
	 * @param l Lista de calorías de los platos.
	 * @param n Número de elementos en la lista.
	 * @param c Cantidad total de calorías deseada.
	 * @return Un arreglo de objetos que representa la selección óptima de platos.
	 * 
	 */
	
	private Object[] resultado(int[][] t, int[] l, int n, int c ) {
		
		//Lista Integer de tipo ArrayList para almacenar los resultados.
		
		List<Integer> r = new ArrayList<Integer>();
		
		int i = n;
		
		int j = c;
		
		//Bucle para recorrer la matriz 'tabla' desde la posición n,c de manera descendente.
		
		while( i > 0 && j > 0) {
			
			/*
			 * Se comprueba si el valor en la posición actual de t es igual al valor 
			 * en la fila superior (t[i-1][j]). Si es así, se decrementa i.
			 */
			
			if(t[i][j]==t[i-1][j]) {
				
				i--;
				
			/*
			 * Si los valores no son iguales, se agrega el índice i - 1 a la lista r, y 
			 * se ajustan los índices j e i.	
			 */
				
			}else {
				
				r.add(i-1);
				
				j -= l[i-1];
				
				i--;
				
			}
		}
		
		//Finalmente, la lista de resultados (r) se convierte en un arreglo (Object[]) y se devuelve.
		
		return r.toArray();
		
	}
	
	/***
	 * 
	 * Método para obtener la selección óptima de platos e imprimir el resultado.
	 * 
	 * @param lista Lista de calorías de los platos.
	 * @param c Cantidad total de calorías deseada.
	 * 
	 */
	
	public void imprimir(int[] lista, int c) {
		
		int[][] tabla = operar(lista, lista.length, c);
		
	/*	
		// Imprimir la tabla intermedia para verificar.
		for (int i = 0; i < tabla.length; ++i) {
			
			for (int j = 0; j < tabla[0].length; ++j) {
				
				System.out.print("[" + tabla[i][j] + "]");
				
			}
			
			System.out.println();
			
		}
	*/
		
		// Obtener la selección óptima de platos.
		Object[] r = resultado(tabla, lista, lista.length, c);
		
		// Imprimir la lista de calorías de los platos.
		System.out.println("Lista:");
		
		for (int i : lista) {
			
			System.out.print("[" + i + "]");
			
		}
		
		System.out.println();

		// Imprimir la cantidad total de calorías deseada.
		Formatter f = new Formatter();
		
		f.format("Total a consumir: %s calorías", c);
		
		System.out.println(f.toString());

		// Imprimir cada plato seleccionado con su cantidad de calorías.
		int suma = 0;
		
		for (Object n : r) {
			
			int valor = (Integer) n;
			
			suma += lista[valor];
			
			Formatter f1 = new Formatter();
			
			f1.format("Plato %s = %s calorías", valor + 1, lista[valor]);
			
			System.out.println(f1.toString());
			
		}

		// Imprimir la cantidad total de calorías consumidas.
		
		Formatter f2 = new Formatter();
		
		f2.format("Total consumido: %s calorías", suma);
		
		System.out.println(f2.toString());
	
	}
}