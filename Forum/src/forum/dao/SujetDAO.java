/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.dao;

import forum.entity.Sujet;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author admin
 */
public interface SujetDAO {
    public void ajouter(Sujet s);
    
    public void supprimer(long id);
    
    public List<Sujet> listerTous();
    
    public Sujet rechercherParId(long id);
    
    public void modifier(Sujet s);
        
}
