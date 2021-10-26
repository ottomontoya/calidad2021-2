package com.anahuac.calidad.tareaUnitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;

public class prueba3Answer {

    private Account dao;
    Account account;
    public HashMap<String, Integer> hashAccount;

    @Before
    public void setUp() throws Exception {
        dao = Mockito.mock(Account.class);
        hashAccount = new HashMap<String, Integer>();
        account = new Account();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void opsTest() {

    }
}
