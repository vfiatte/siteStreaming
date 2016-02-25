/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.dao;

import forum.entity.Forum;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */
public interface ForumDAO {
    
    public void ajouter(Forum f);
    
    public void supprimer(long id);
    
    public List<Forum> listerTous();
    
    public void modifier (Forum f);
    
    public Forum rechercherParId(long id);
    
    
}
