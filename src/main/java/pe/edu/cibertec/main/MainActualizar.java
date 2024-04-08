package pe.edu.cibertec.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.domain.Alumno;

public class MainActualizar {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_estudiantes");
        EntityManager em= emf.createEntityManager();

        //Actualizar
        Alumno busqueda = em.find(Alumno.class,"12345678");
        busqueda.setCorreo("javo@gmail.com");

        //Transaccion
        em.getTransaction().begin();
        em.merge(busqueda);
        em.getTransaction().commit();

        System.out.println(busqueda);

    }
}
