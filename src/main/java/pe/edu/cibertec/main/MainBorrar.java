package pe.edu.cibertec.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.domain.Alumno;

public class MainBorrar {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_estudiantes");
        EntityManager em = emf.createEntityManager();

        //Busqueda y borrado
        Alumno alumnoSeleccionado=em.find(Alumno.class,"12345678");
        em.getTransaction().begin();
        em.remove(alumnoSeleccionado);
        em.getTransaction().commit();


    }
}
