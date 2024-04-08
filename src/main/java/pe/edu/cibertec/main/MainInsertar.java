package pe.edu.cibertec.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.domain.Alumno;

import java.util.Date;

public class MainInsertar {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_estudiantes");
        EntityManager em= emf.createEntityManager();

        //Creacion de Alumno
        Alumno nuevoAlumno = new Alumno("77102120","Luis","Palacios",new Date(),"palaciossernaqueluisjavier@gmail.com","opalos1920");

        //Insertar transaccion
        em.getTransaction().begin();
        em.persist(nuevoAlumno);
        em.getTransaction().commit();

        //buscando
        Alumno AlumnoNuevo = em.find(Alumno.class,"77102120");
        System.out.println(AlumnoNuevo);




    }
}
