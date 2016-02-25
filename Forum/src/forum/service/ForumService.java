/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.dao.ForumDAO;
import forum.entity.Forum;
import java.util.List;

/**
 *
 * @author admin
 */
public class ForumService {
    
    private ForumDAO dao = new ForumDAO();
    
    public void ajouter(Forum f){
        dao.ajouter(f);
    }
    
    public void supprimer(long id){
        dao.supprimer(id);
    }
    
    public void modifier(Forum f){
        dao.modifier(f);
    }
    
    public List<Forum> listerTous(){
        return dao.listerTous();
    }
    
    public Forum rechercherParId(long id){
        return dao.rechercherParId(id);
    }
}
