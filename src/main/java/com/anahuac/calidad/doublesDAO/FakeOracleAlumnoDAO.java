package com.anahuac.calidad.doublesDAO;

public class FakeOracleAlumnoDAO implements AlumnoDAO {

    @Override
    public void addAlumno (Alumno a) {
    }

    @Override
    public void deleteAlumno(Alumno a) {
    }

    @Override
    public void updateEmail (Alumno a) {

    }

    @Override
    public Alumno consultarAlumno (String id) {
        return null;
    }
}
