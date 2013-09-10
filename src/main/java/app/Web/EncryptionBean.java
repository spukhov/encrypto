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
    private String encryptedText;
    private String key;

    public void save(){
        Encryption encryption = new Encryption(text, new java.sql.Date(new java.util.Date().getTime()));
        encryptionService.save(encryption);
        StringBuilder arr = new StringBuilder();
        for(char c : text.toCharArray()){
            c+=5;
            arr.append(c);
        }

        encryptedText = new String(arr);
    }
    public void decrypt(){
        StringBuilder arr = new StringBuilder();
        for(char c : encryptedText.toCharArray()){
            c-=5;
            arr.append(c);
        }

        encryptedText = new String(arr);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getEncryptedText() {
        return encryptedText;
    }

    public void setEncryptedText(String encryptedText) {
        this.encryptedText = encryptedText;
    }
}
