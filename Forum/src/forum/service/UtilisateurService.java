/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.Exception.MotDePasseIncorrectException;
import forum.Exception.UtilisateurDejaExistantException;
import forum.entity.Utilisateur;
import java.util.List;

/**
 *
 * @author admin
 */
public interface UtilisateurService {

    public List<Utilisateur> listerTous();

    public Utilisateur rechercherParID(long id);

    public void ajouter(Utilisateur u);

    public void modifier(Utilisateur u);

    public void supprimer(long id);

    public Utilisateur rechercherParLogin(String login);

    public Utilisateur rechercherParMail(String email);

    public void inscription(Utilisateur u) throws UtilisateurDejaExistantException;

    public void validationInscription(Utilisateur u);

    public void login(String mail, String mdp) throws MotDePasseIncorrectException;
}
