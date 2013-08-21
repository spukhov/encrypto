package app.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;
import java.util.GregorianCalendar;

/**
 *
 */

@Entity
public class Encryption {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String text;
    private Date date;

    public Encryption(String text, Date date) {
        this.text =text;
        this.date= date;
    }
    public Encryption(){

    }


}