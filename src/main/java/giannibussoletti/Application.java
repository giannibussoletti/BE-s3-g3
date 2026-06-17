package giannibussoletti;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("beu1s3g3pu");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        System.out.println("Hello World!");
        // Nei database esistono diverse tipi di relazioni
        // in base a come le tabelle vengono collegate fra di loro
        // One-to-One (uno-a-uno)
        // One-to-Many (uno-a-molti)
        // Many-to-Many (molti-a-molti)

        //ONE TO ONE
        // La relazione "One-to-One" è un tipo di relazione in cui ogni entità in un lato della relazione è associata a una e solo una
        // entità nell'altro lato.
        //
    }
}
