package app.Service;

import app.DAO.FeedbackDAO;
import app.Entity.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 */
@Transactional
@Service
public class FeedbackService {
    @Autowired
    FeedbackDAO feedbackDAO;
    public List<Feedback> findAll(){
        return feedbackDAO.findAll();
    }

}
