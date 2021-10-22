package com.anahuac.calidad.dbunit;

import org.dbunit.DBTestCase;
import org.dbunit.PropertiesBasedJdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DAOAlumnoTest extends DBTestCase {

    public DAOAlumnoTest(){
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_DRIVER_CLASS, "com.mysql.jdbc.Driver");
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_CONNECTION_URL, "jdbc:mysql://localhost:33060/pruebas_db");
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_USERNAME, "root");
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_PASSWORD, "secret");
    }

    @Before
    public void setUp() throws Exception{

    }

    @After
    public void tearDown() throws Exception{
    }

    @Test
    public void test() {
        fail("Not yet implemented");
    }

    @Override
    protected IDataSet getDataSet() throws Exception {
        return null;
    }
}
