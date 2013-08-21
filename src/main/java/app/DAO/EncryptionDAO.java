package app.DAO;

import app.Entity.Encryption;
import app.Entity.Feedback;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 *
 */
@Repository
public class EncryptionDAO {
    @PersistenceContext
    private EntityManager em;

    public List<Encryption> findAll(){
        return em.createQuery("from Encryption ").getResultList();
    }
    public void save(Encryption encryption){
        em.persist(encryption);
    }
}
