/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.dao;

import forum.entity.Forum;
import forum.entity.Message;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */
public interface MessageDAO {

    public void supprimer(long id);

    public void ajouter(Message m);

    public List<Message> listerTous();

    public Message rechercherParId(long id);
    
    public void modifier(Message m);
}
