/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import javax.persistence.CascadeType;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author admin
 */
@Service
public class DataServiceImpl implements DataService {

    public void deleteAll() {
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Message m").executeUpdate();
        em.createQuery("DELETE FROM Sujet s ").executeUpdate();
        em.createQuery("DELETE FROM Forum f").executeUpdate();
        em.createQuery("DELETE FROM Utilisateur u").executeUpdate();
        em.getTransaction().commit();
    }
}
