/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.entity;

import forum.enumeration.TypeUtilisateur;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.eclipse.persistence.annotations.CascadeOnDelete;

/**
 *
 * @author admin
 */
@Entity
public class Utilisateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String login;
    private String mdp;
    private String email;
    private boolean inscrit=false;
    
    @OneToMany(mappedBy = "posterPar", cascade = CascadeType.PERSIST )
    private List<Sujet> sujetsCrees = new ArrayList<Sujet>();
    
    @OneToMany(mappedBy = "posterPar", cascade =  CascadeType.PERSIST)
    private List<Message> messagesCrees = new ArrayList<Message>();
    
    @OneToMany(mappedBy = "createur", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @CascadeOnDelete
    private List<Forum> forumsCrees = new ArrayList<Forum>();

    public Utilisateur() {
    }

    
    
    
    public Utilisateur(Long id, String login, String mdp, String email, TypeUtilisateur typeUtil) {
        this.id = id;
        this.login = login;
        this.mdp = mdp;
        this.email = email;
        this.typeUtil = typeUtil;
    }
    
    

    public List<Forum> getForumsCrees() {
        return forumsCrees;
    }

    public void setForumsCrees(List<Forum> forumsCrees) {
        this.forumsCrees = forumsCrees;
    }

    public boolean isInscrit() {
        return inscrit;
    }

    public List<Sujet> getSujetsCrees() {
        return sujetsCrees;
    }

    public void setSujetsCrees(List<Sujet> sujetsCrees) {
        this.sujetsCrees = sujetsCrees;
    }

    public List<Message> getMessagesCrees() {
        return messagesCrees;
    }

    public void setMessagesCrees(List<Message> messagesCrees) {
        this.messagesCrees = messagesCrees;
    }
    

    public void setInscrit(boolean inscrit) {
        this.inscrit = inscrit;
    }
    
    
    @Enumerated(EnumType.STRING)
    private TypeUtilisateur typeUtil;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TypeUtilisateur getTypeUtil() {
        return typeUtil;
    }

    public void setTypeUtil(TypeUtilisateur typeUtil) {
        this.typeUtil = typeUtil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "forum.entity.Utilisateur[ id=" + id + " ]";
    }
    
}
