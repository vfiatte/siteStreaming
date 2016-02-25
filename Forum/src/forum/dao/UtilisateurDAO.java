/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.dao;

import forum.entity.Utilisateur;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author admin
 */
public interface UtilisateurDAO {
    public List<Utilisateur> listerTous();

    public Utilisateur rechercherParId(long id);

    public void modifier(Utilisateur u);

    public void supprimer(long id);

    public void ajouter(Utilisateur u);

    public Utilisateur rechercheParLogin(String login);
   

    public Utilisateur rechercheParMail(String email);

}
