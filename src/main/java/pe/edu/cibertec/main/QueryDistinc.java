package pe.edu.cibertec.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class QueryDistinc {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_estudiantes");
        EntityManager em = emf.createEntityManager();

        //Sentencia JPQL
        TypedQuery<String> query = em.createQuery("Select a.apellidos from Alumno a",String.class);

        List<String> resultado = query.getResultList();
        for (String alumno : resultado){
            System.out.println(alumno);
        }

    }
}
