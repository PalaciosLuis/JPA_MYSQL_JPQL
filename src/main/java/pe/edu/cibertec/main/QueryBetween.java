package pe.edu.cibertec.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import pe.edu.cibertec.domain.Alumno;

import java.sql.Timestamp;
import java.util.List;

public class QueryBetween {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_estudiantes");
        EntityManager em = emf.createEntityManager();

        //Conversion Timestamp
        Timestamp fechaInicio = Timestamp.valueOf("1990-01-01 00:00:00");
        Timestamp fechaFin = Timestamp.valueOf("1999-12-31 23:59:59");

        TypedQuery<Alumno> query = em.createQuery(
                "SELECT a FROM Alumno a WHERE a.nacimiento BETWEEN :fechaInicio AND :fechaFin", Alumno.class);
        query.setParameter("fechaInicio", fechaInicio);
        query.setParameter("fechaFin", fechaFin);

        List<Alumno> resultado = query.getResultList();
        for (Alumno alumno : resultado) {
            System.out.println(alumno);
        }
    }
}
