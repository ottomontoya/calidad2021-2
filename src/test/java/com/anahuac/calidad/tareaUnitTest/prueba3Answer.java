package com.anahuac.calidad.tareaUnitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.HashMap;
import java.util.Iterator;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;

public class prueba3Answer {

    private Account dao;
    Account account;
    public HashMap<String, Integer> hashAccount;

    private int comision(int i){
        return i * account.getPorcentaje();
    }

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
        account.setHolder("otto");
        account.setBalance(333);
        int initBalance = account.getBalance();
        account.setZone(1);
        // -- Paso 1 --
        doAnswer(new Answer() {
            public Integer answer(InvocationOnMock invocation) throws Throwable {
                int arg = (Integer) invocation.getArguments()[0];
                hashAccount.put(anyString(), arg);
                return hashAccount.size();
            }
        }).when(dao.deposit(anyInt()));
        // -- Paso 2 --

        // -- Paso 3 --

    }
}
