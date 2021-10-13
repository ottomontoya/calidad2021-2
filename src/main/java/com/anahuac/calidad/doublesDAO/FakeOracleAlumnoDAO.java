package com.anahuac.calidad.doublesDAO;

public class FakeOracleAlumnoDAO implements AlumnoDAO {

    @Override
    public boolean addAlumno (Alumno a) {
        return false;
    }

    @Override
    public boolean deleteAlumno(Alumno a) {
        return false;
    }

    @Override
    public void updateEmail (Alumno a) {

    }

    @Override
    public Alumno consultarAlumno (String id) {
        return null;
    }
}
