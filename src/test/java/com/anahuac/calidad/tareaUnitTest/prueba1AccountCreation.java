package com.anahuac.calidad.tareaUnitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class prueba1AccountCreation {
    /**
     * <h1>Args</h1>
     * @param arg1 - Account holder
     * @param arg2 - Initial balance
     * @param arg3 - Zone
     * @param arg4 - Debit
     * @param arg5 - Actual Balance
     */
    private String arg1;
    private int arg2;
    private int arg3;
    private int arg4;
    private int arg5;

    private Account account;

    public prueba1AccountCreation(String arg1, int arg2, int arg3) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] {
                {"Otto", 500, 1},
                {"Maricarmen", 1600, 2},
                {"Fei", 100, 3},
        });
    }

    @Before
    public void setUp() throws Exception{
        account = new Account();
    }

    @After
    public void tearDown() throws Exception{

    }

    /**
     * <h1>accountCreationTest</h1>
     * <h3>PT1</h3>
     * Se crean los valores de las cuentas utilizando los args de las pruebas parametrizadas (similar a la calculadora)
     * <h3>PT2</h3>
     * Se verifican mediante un assertThat
     */
    @Test
    public void accountCreationTest(){
        // --PT1--
        account.setHolder(arg1);
        String actualHolder = account.getHolder();
        account.setBalance(arg2);
        int actualInitBalance = account.getBalance();
        account.setZone(arg3);
        int actualZone = account.getZone();
        // --PT2--
        assertThat(this.arg1, is(actualHolder));
        assertThat(this.arg2, is(actualInitBalance));
        assertThat(this.arg3, is(actualZone));
    }

}
