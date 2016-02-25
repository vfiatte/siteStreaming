/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.Exception.MotDePasseIncorrectException;
import forum.Exception.UtilisateurDejaExistantException;
import forum.dao.UtilisateurDAO;
import forum.entity.Utilisateur;
import forum.enumeration.TypeUtil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class UtilisateurServiceImpl implements UtilisateurService {

    @Autowired
    private MailServiceImpl ms;

    @Autowired
    private UtilisateurDAO dao;

    public List<Utilisateur> listerTous() {
        return dao.listerTous();
    }

    public Utilisateur rechercherParID(long id) {
        return dao.rechercherParId(id);
    }

    public void ajouter(Utilisateur u) {
        dao.ajouter(u);
    }

    public void modifier(Utilisateur u) {
        dao.modifier(u);
    }

    public void supprimer(long id) {
        dao.supprimer(id);
    }

    public Utilisateur rechercherParLogin(String login) {
        return dao.rechercheParLogin(login);
    }

    public Utilisateur rechercherParMail(String email) {
        return dao.rechercheParMail(email);
    }

    public void inscription(Utilisateur u) throws UtilisateurDejaExistantException {
        try {
            u.equals(dao.rechercheParLogin(u.getLogin()));

//            u.equals(dao.rechercheParLogin(u.getLogin()));
        } catch (Exception e) {
            ms.Mail("admin", u.getEmail(), "", "");
            u.setType(TypeUtil.NONVALIDE);
            dao.ajouter(u);
            dao.modifier(u);
            System.out.println("Utilisateur créé");
            return;
        }

        throw new UtilisateurDejaExistantException();

        //dao.ajouter(u);
    }

    public void validationInscription(Utilisateur u) {
        ms.Click();
        u.setType(TypeUtil.UTILISATEUR);
        dao.modifier(u);
    }

    public void login(String mail, String mdp) throws MotDePasseIncorrectException {

        Utilisateur u = new Utilisateur();

        try {
            dao.rechercheParMail(mail);
        } catch (Exception e) {
            System.out.println("Pas de mail correspondant");
            return;
        }
        //if (dao.rechercheParMail(mail).getEmail() == mail);

        if (dao.rechercheParMail(mail).getMdp() == mdp) {
            System.out.println("OK Connecté");
            return;
        } else {
            System.out.println("Mot de passe incorrect");
            throw new MotDePasseIncorrectException();

        }

        //dao.ajouter(u);
    }

}

