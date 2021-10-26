package com.anahuac.calidad.tareaUnitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

public class prueba2AlertListener {

    private AlertListener alert;
    private Account account;

    @Before
    public void setUp() throws Exception {
        alert = Mockito.mock(AlertListener.class);
        account = new Account();
    }

    @After
    public void tearDown() throws Exception {

    }

    /**
     * <h1>alertTest</h1>
     * <h3>PT1</h3>
     * Se inicializan los valores para la creacion de la cuenta, agregandole holder, balance y alerta. Primero intente
     * creando la cuenta como un new account con sus parametros como constructor, pero no me dejaba crearla porque la
     * alerta siempre estaba en null, asi que los tuve que inicializar en el test.
     * <h3>PT2</h3>
     * Utilizando el metodo debit, se le quita un dolar a la cuenta para que quede con un balance menor a 100 y luego un
     * verify de mockito para mandar la alerta. Se utiliza un anyString btw.
     */

    @Test
    public void alertTest() {
        // --PT1--
        account.setHolder("otto");
        account.setBalance(100);
        account.setAlerts(alert);
        // --PT2--
        account.debit(1);
        verify(alert).sendAlert(anyString());
    }

    /**
     * <h1>verifyAlertTest</h1>
     * En esta simplemente comprueba lo contrario, que no pasa nada si aun hay un balance mayor a 100
     * luego de que se haya hecho una transaccion
     */
    @Test
    public void noAlertTest() {
        // --PT1--
        account.setHolder("otto");
        account.setBalance(101);
        account.setAlerts(alert);
        // --PT2--
        account.debit(1);
        verifyNoMoreInteractions(alert);
    }


}