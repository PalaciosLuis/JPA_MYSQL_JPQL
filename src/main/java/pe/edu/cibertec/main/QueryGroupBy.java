package pe.edu.cibertec.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class QueryGroupBy {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_estudiantes");
        EntityManager em = emf.createEntityManager();

        //Sentencia JPQL
        TypedQuery<Object[]> query = em.createQuery("select a.nombres, count(*) from Alumno a group by a.nombres",Object[].class);


        //Obtener resultados
        List<Object[]> resultado = query.getResultList();
        System.out.println("Nombres : Cantidad");
        for (Object[] alumno : resultado){

            System.out.println(alumno[0] + " : " + alumno[1]);
        }
    }
}
