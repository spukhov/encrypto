package app.Web;

import app.Entity.Feedback;
import app.Service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;

/**
 *
 */
@Component
@ManagedBean
@RequestScoped
public class FeedbackBean {
       @Autowired
    FeedbackService feedbackService;

    public String findAll(){
        return feedbackService.findAll().get(0).toString();
    }

}
