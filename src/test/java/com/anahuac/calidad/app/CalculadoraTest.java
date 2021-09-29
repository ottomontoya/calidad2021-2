package com.anahuac.calidad.app;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.anahuac.calidad.app.Calculadora;

public class CalculadoraTest {

    private Calculadora miCalculadora;

    @Before
    public void setUp() throws Exception {
        miCalculadora = new Calculadora();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sumaTest() {
        //set el resultado esperado
        double resultadoEsperado = 4;

        // ejercicio a probar
        double resultadoEjecucion = miCalculadora.suma(2.0f, 2.0f);

        //verificar
        //Assert.assertEquals(resultadoEsperado, resultadoEjecucion, .01);
        assertThat(resultadoEsperado, is(closeTo(resultadoEjecucion, .01)));
    }

    /*
    @Test
    public void resta() {
    }

    @Test
    public void multiplicacion() {
    }

    @Test
    public void division() {
    }

    @Test
    public void getUltimaResultado() {
    }
    */
}