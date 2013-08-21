package app.DAO;

import app.Entity.Feedback;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

/**
 *
 */

@Repository
public class FeedbackDAO {
    @PersistenceContext
    private EntityManager em;

    public List<Feedback> findAll(){
        return em.createQuery("from Feedback").getResultList();
    }
    public void save(Feedback feedback){
         em.persist(feedback);
    }

}
