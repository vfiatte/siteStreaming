/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import forum.service.ForumServiceImpl;
import forum.service.MessageServiceImpl;
import forum.service.SujetServiceImpl;
import forum.service.UtilisateurServiceImpl;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import forum.entity.Utilisateur;
import forum.enumeration.TypeUtilisateur;

/**
 *
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:/C:\\Users\\admin\\Documents\\NetBeansProjects\\forum\\Forum\\application-context.xml")
public class TestInterface {

    @Autowired
    ForumServiceImpl fs;
    
    @Autowired
    MessageServiceImpl ms;
    
    @Autowired
    SujetServiceImpl ss;

    @Autowired
    UtilisateurServiceImpl us;
    

    @Test
    public void TestInterface() {
//        Message m = new Message(4L, "IPHONE", "Mon iphone est cassé aidez moi", new Date());
//        ms.ajouter(m);
    Utilisateur u = new Utilisateur(1L, "FFF", "EEE", "RRR", TypeUtilisateur.MODERATEUR);
    us.ajouter(u);
        
    }

}
