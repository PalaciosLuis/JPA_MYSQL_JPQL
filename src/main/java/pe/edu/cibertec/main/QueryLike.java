package pe.edu.cibertec.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import pe.edu.cibertec.domain.Alumno;

import java.util.List;

public class QueryLike {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_estudiantes");
        EntityManager em = emf.createEntityManager();


        //Query JPQL para obtener los estudiantes que tienen una direccion que empieza con "Calle"
        TypedQuery query = em.createQuery("SELECT a FROM Alumno a WHERE a.direccion LIKE 'Calle%'", Alumno.class);

        //Obtener los estudiantes que tienen una direccion que empieza con "Calle"
        List<Alumno> resultado = query.getResultList();
        for (Alumno alumno : resultado) {
            System.out.println(alumno);
        }
    }
}
