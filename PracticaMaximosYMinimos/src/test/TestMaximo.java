package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Maximos;

class TestMaximo {

	//TEST DE MAXIMO 2 NUMEROS
		
	@Test
    void testMaximoDe2EnterosPositivos_positivos() {
        assertEquals(5, Maximos.maximoDe2EnterosPositivos(3, 5));
        assertEquals(10, Maximos.maximoDe2EnterosPositivos(10, 8));
        assertEquals(20, Maximos.maximoDe2EnterosPositivos(20, 15));
    }

    @Test
    void testMaximoDe2EnterosPositivos_negativos() {
        assertThrows(IllegalArgumentException.class, () -> Maximos.maximoDe2EnterosPositivos(-3, 5));
        assertThrows(IllegalArgumentException.class, () -> Maximos.maximoDe2EnterosPositivos(10, -8));
        assertThrows(IllegalArgumentException.class, () -> Maximos.maximoDe2EnterosPositivos(-20, -15));
    }
    
    @Test
    void testMaximoDe2EnterosPositivos_cero() {
        assertEquals(0, Maximos.maximoDe2EnterosPositivos(0, 0));
        assertEquals(5, Maximos.maximoDe2EnterosPositivos(0, 5));
        assertEquals(0, Maximos.maximoDe2EnterosPositivos(0, 0));
    }
    
	//TEST DE MAXIMO 3 NUMEROS
    
    @Test
    void testMaximoDe3EnterosPositivos_positivos() {
        assertEquals(5, Maximos.maximoDe3EnterosPositivos(3, 5, 1));
        assertEquals(12, Maximos.maximoDe3EnterosPositivos(10, 8, 12));
        assertEquals(20, Maximos.maximoDe3EnterosPositivos(20, 15, 12));
    }

    @Test
    void testMaximoDe3EnterosPositivos_negativos() {
        assertThrows(IllegalArgumentException.class, () -> Maximos.maximoDe3EnterosPositivos(-3, 5, 1));
        assertThrows(IllegalArgumentException.class, () -> Maximos.maximoDe3EnterosPositivos(10, -8, 12));
        assertThrows(IllegalArgumentException.class, () -> Maximos.maximoDe3EnterosPositivos(-20, -15, -12));
    }

    @Test
    void testMaximoDe3EnterosPositivos_cero() {
        assertEquals(0, Maximos.maximoDe3EnterosPositivos(0, 0, 0));
        assertEquals(5, Maximos.maximoDe3EnterosPositivos(0, 0, 5));
        assertEquals(5, Maximos.maximoDe3EnterosPositivos(5, 0, 0));
        assertEquals(5, Maximos.maximoDe3EnterosPositivos(0, 5, 0));
    }
}

