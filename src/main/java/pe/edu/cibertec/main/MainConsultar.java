package pe.edu.cibertec.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.domain.Alumno;

public class MainConsultar {
    public static void main(String[] args) {

        //Creacion emf y em
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_estudiantes");
        EntityManager em = emf.createEntityManager();

        //busqueda
        Alumno alumno = em.find(Alumno.class, "12345678");

        //Pintar resultado
        System.out.println(alumno);

    }
}
