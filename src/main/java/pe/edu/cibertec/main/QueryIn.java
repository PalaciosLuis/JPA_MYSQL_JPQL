package pe.edu.cibertec.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import pe.edu.cibertec.domain.Alumno;

import java.util.List;

public class QueryIn {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_estudiantes");
        EntityManager em = emf.createEntityManager();

        //Sentencia jpql query
        TypedQuery query = em.createQuery("select a from Alumno a where a.apellidos in ('Perez','Garcia')", Alumno.class);

        List<Alumno> resultado = query.getResultList();
        for (Alumno alumno : resultado){
            System.out.println(alumno);
        }


    }
}
