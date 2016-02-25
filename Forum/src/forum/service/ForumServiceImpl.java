/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.dao.ForumDAO;
import forum.entity.Forum;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class ForumServiceImpl implements ForumService{
    
    @Autowired
    private ForumDAO dao;
    
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

