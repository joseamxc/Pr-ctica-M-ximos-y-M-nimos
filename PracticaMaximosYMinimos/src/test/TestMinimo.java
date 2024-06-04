package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Minimos;

class TestMinimo {
	//TEST DE MINIMO 2 NUMEROS
	
	@Test
    public void testMinimoDe2EnterosPositivos() {
        assertEquals(1, Minimos.MinimoDe2EnterosPositivos(1, 5));
        assertEquals(1, Minimos.MinimoDe2EnterosPositivos(5, 1));
        assertEquals(3, Minimos.MinimoDe2EnterosPositivos(3, 3));
        assertEquals(10, Minimos.MinimoDe2EnterosPositivos(10, 20));
    }

	    @Test
	    void testMaximoDe2EnterosPositivos_negativos() {
	        assertThrows(IllegalArgumentException.class, () -> Minimos.MinimoDe2EnterosPositivos(-3, 5));
	        assertThrows(IllegalArgumentException.class, () -> Minimos.MinimoDe2EnterosPositivos(10, -8));
	        assertThrows(IllegalArgumentException.class, () -> Minimos.MinimoDe2EnterosPositivos(-20, -15));
	    }
	    
	    @Test
	    void testMaximoDe2EnterosPositivos_cero() {
	        assertEquals(0, Minimos.MinimoDe2EnterosPositivos(0, 0));
	        assertEquals(0, Minimos.MinimoDe2EnterosPositivos(0, 5));
	        assertEquals(0, Minimos.MinimoDe2EnterosPositivos(0, 0));
	    }
	    
//TEST DE MAXIMO 3 NUMEROS
	    
	    @Test
	    void testMaximoDe3EnterosPositivos_positivos() {
	        assertEquals(1, Minimos.MinimoDe3EnterosPositivos(3, 5, 1));
	        assertEquals(8, Minimos.MinimoDe3EnterosPositivos(10, 8, 12));
	        assertEquals(12, Minimos.MinimoDe3EnterosPositivos(20, 15, 12));
	    }

	    @Test
	    void testMaximoDe3EnterosPositivos_negativos() {
	        assertThrows(IllegalArgumentException.class, () -> Minimos.MinimoDe3EnterosPositivos(-3, 5, 1));
	        assertThrows(IllegalArgumentException.class, () -> Minimos.MinimoDe3EnterosPositivos(10, -8, 12));
	        assertThrows(IllegalArgumentException.class, () -> Minimos.MinimoDe3EnterosPositivos(-20, -15, -12));
	    }

	    @Test
	    void testMaximoDe3EnterosPositivos_cero() {
	        assertEquals(0, Minimos.MinimoDe3EnterosPositivos(0, 0, 0));
	        assertEquals(0, Minimos.MinimoDe3EnterosPositivos(0, 0, 5));
	        assertEquals(0, Minimos.MinimoDe3EnterosPositivos(5, 0, 0));
	    }
}
