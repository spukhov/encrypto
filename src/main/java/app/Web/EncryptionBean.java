package app.Web;

import app.Entity.Encryption;
import app.Service.EncryptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.sql.Date;

/**
 *
 */
@Component
@ManagedBean
@RequestScoped
public class EncryptionBean {
    @Autowired
    EncryptionService encryptionService;
    private String text;

    public void save(){
        Encryption encryption = new Encryption(text, new java.sql.Date(new java.util.Date().getTime()));
        encryptionService.save(encryption);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
