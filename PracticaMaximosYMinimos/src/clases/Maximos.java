package clases;

public class Maximos {
	/* Encuentra el numero maximo de los 2 dados.
     * @param numeros son 2 valores que deben ser mayor de 0 .
     * @return. me devuelve el valor maximo dado
     * @throws IllegalArgumentException Si algún número es menor de 0.
     */
	public static int maximoDe2EnterosPositivos(int numero1, int numero2) {
	    if (numero1 < 0 || numero2 < 0) {
	        throw new IllegalArgumentException("Los valores pasados deben ser positivos (mayores o iguales a cero).");
	    }
	    
	    if (numero1 > numero2) {
	        return numero1;
	    } else {
	        return numero2;
	    }
	}
	 
	/* Encuentra el numero maximo de los 3 dados.
     * @param numeros son 3 valores que deben ser mayor de 0 .
     * @return. me devuelve el valor maximo dado
     * @throws IllegalArgumentException Si algún número es menor de 0.
     */
	public static int maximoDe3EnterosPositivos(int numero1, int numero2, int numero3) {
	    if (numero1 < 0 || numero2 < 0 || numero3 < 0) {
	        throw new IllegalArgumentException("Los valores pasados deben ser positivos (mayores o iguales a cero).");
	    }
	    
	    int maximo = numero1;
	    if (numero2 > maximo) {
	        maximo = numero2;
	    }
	    if (numero3 > maximo) {
	        maximo = numero3;
	    }
	    
	    return maximo;
	}
	 
}
