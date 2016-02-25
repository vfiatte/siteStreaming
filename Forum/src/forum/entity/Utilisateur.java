/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.entity;

import forum.enumeration.TypeUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
    private TypeUtil typeuser;
    
    @OneToMany(mappedBy = "createur")
    private List<Forum> forumCrees = new ArrayList<Forum>(); //Defintion de l'association bidirectionnelle
    
    @OneToMany(mappedBy ="poster" )
    private List<Sujet> sujetCrees = new ArrayList<Sujet>();
    
    @OneToMany(mappedBy = "posterPar")
    private List<Message> messageCrees = new ArrayList<Message>();
    
    
    public Utilisateur (){
        
    }
    public Utilisateur(Long id, String login, String mdp, String email, TypeUtil type) {
        this.id = id;
        this.login = login;
        this.mdp = mdp;
        this.email = email;
        this.typeuser = type;
    }

    public TypeUtil getTypeuser() {
        return typeuser;
    }

    public void setTypeuser(TypeUtil typeuser) {
        this.typeuser = typeuser;
    }

    public List<Forum> getForumCrees() {
        return forumCrees;
    }

    public void setForumCrees(List<Forum> forumCrees) {
        this.forumCrees = forumCrees;
    }

    public List<Sujet> getSujetCrees() {
        return sujetCrees;
    }

    public void setSujetCrees(List<Sujet> sujetCrees) {
        this.sujetCrees = sujetCrees;
    }

    public List<Message> getMessageCrees() {
        return messageCrees;
    }

    public void setMessageCrees(List<Message> messageCrees) {
        this.messageCrees = messageCrees;
    }
    
   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public TypeUtil getType() {
        return typeuser;
    }

    public void setType(TypeUtil type) {
        this.typeuser = type;
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
//        if (!(object instanceof Utilisateur)) {
//            return false;
//        }
//        Utilisateur other = (Utilisateur) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
Utilisateur u1 = (Utilisateur) object;

return this.getId().equals(u1.getId()) || this.getEmail().equals(u1.getEmail()) || this.getLogin().equals(u1.getLogin());
    }

    @Override
    public String toString() {
        return "forum.entity.Utilisateur[ id=" + id + " ]";
    }
    
}
