package pe.edu.cibertec.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import pe.edu.cibertec.domain.Alumno;

import java.util.List;

public class QueryBasico {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_estudiantes");
        EntityManager em = emf.createEntityManager();

        //Crear Query JPQL por defgecto el tipo es un Objeto
        TypedQuery query = em.createQuery("select a from Alumno a", Alumno.class);

        List<Alumno> resultado = query.getResultList();
        for (Alumno alumno:resultado){
            System.out.println(alumno);
        }
    }
}
