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

/**
 *
 * @author admin
 */
public class ForumDAOjpaImpl implements ForumDAO{
    
    @Override
    public void ajouter(Forum f){
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
    }
    
    @Override
    public void supprimer(long id){
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Forum f WHERE f.id="+id);
        em.getTransaction().commit();
    }
    
    @Override
    public List<Forum> listerTous(){
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        return em.createQuery("SELECT f FROM Forum f").getResultList();
    }
    
    @Override
    public void modifier (Forum f){
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        em.getTransaction().begin();
        em.merge(f);
        em.getTransaction().commit();    
    }
    
    @Override
    public Forum rechercherParId(long id){
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        return em.find(Forum.class, id);
        
    }
}
