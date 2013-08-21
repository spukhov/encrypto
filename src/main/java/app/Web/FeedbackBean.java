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
    private String name;
    private String email;
    private String message;

    public List<Feedback> findAll() {
        return feedbackService.findAll();
    }

    public void save(){
         Feedback feedback = new Feedback(this.name, this.email, this.message);
        feedbackService.saveFeedback(feedback);
    }

    /// Getters-Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
