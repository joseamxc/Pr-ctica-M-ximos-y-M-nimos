package clases;

public class Minimos {
	/* Encuentra el numero minimo de los 2 dados.
     * @param numeros son 2 valores que deben ser mayor de 0 .
     * @return. me devuelve el valor minimo dado
     * @throws IllegalArgumentException Si algún número es menor de 0.
     */
	public static int MinimoDe2EnterosPositivos(int numero1, int numero2) {
	    if (numero1 < 0 || numero2 < 0) {
	        throw new IllegalArgumentException("Los valores pasados deben ser positivos (mayores o iguales a cero).");
	    }
	    
	    if (numero1 < numero2) {
	        return numero1;
	    } else {
	        return numero2;
	    }
	}
	/* Encuentra el numero minimo de los 3 dados.
     * @param numeros son 3 valores que deben ser mayor de 0 .
     * @return. me devuelve el valor minimo dado
     * @throws IllegalArgumentException Si algún número es menor de 0.
     */
	public static int MinimoDe3EnterosPositivos(int numero1, int numero2, int numero3) {
	    if (numero1 < 0 || numero2 < 0 || numero3 < 0) {
	        throw new IllegalArgumentException("Los valores pasados deben ser positivos (mayores o iguales a cero).");
	    }
	    
	    int minimo = numero1;
	    if (numero2 < minimo) {
	    	minimo = numero2;
	    }
	    if (numero3 < minimo) {
	    	minimo = numero3;
	    }
	    
	    return minimo;
	}
}
