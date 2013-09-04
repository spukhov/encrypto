package app.Entity;
import javax.persistence.*;

/**
 *
 */

@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String email;
    private String message;

    public Feedback(String name, String email, String message) {
        this.name = name;
        this.email = email;
        this.message = message;
    }
    public Feedback(){

    }

    @Override
    public String toString(){
        return name + " " + email+ " " + message+ " ";
    }
}