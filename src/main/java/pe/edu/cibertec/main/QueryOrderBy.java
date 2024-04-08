package pe.edu.cibertec.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class QueryOrderBy {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_estudiantes");
        EntityManager em = emf.createEntityManager();

        //Sentencia JPQL
        TypedQuery<String> query  = em.createQuery("select a.nombres from Alumno a order by a.nombres desc",String.class);

        //Mostrar resultados
        List<String> resultado = query.getResultList();
        for (String alumno : resultado){
            System.out.println(alumno);
        }
    }
}
