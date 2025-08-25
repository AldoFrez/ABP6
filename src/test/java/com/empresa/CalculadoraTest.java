package com.empresa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
    @Test
    void sumarDosNumeros() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3)); // Este test debe FALLAR pues no esta creada la Clase Calculadora
    }
}
