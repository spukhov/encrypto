package app.Service;

import app.DAO.EncryptionDAO;
import app.Entity.Encryption;
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
public class EncryptionService {
    @Autowired
    EncryptionDAO encryptionDAO;
//    public List<Encryption> findAll(){
//        return encryptionDAO.findAll();
//    }
    public void save(Encryption encryption){
        encryptionDAO.save(encryption);
    }

}
