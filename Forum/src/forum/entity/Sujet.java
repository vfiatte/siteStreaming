/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author admin
 */
@Entity
public class Sujet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titre;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateCreation;
    
    @ManyToOne
    @JoinColumn(name = "UTIL_ID")
    private Utilisateur poster;
    
    @ManyToOne
    @JoinColumn(name = "FORUM_ID")
    private Forum Forum_Sujet;//Sujet x appartenant au forum y
    
    @OneToMany(mappedBy = "Sujet_Message")
    private List<Message> MessageDeSujet = new ArrayList<Message>();

    public Sujet(Long id, String titre, Date dateCreation, Utilisateur poster, Forum Forum_Sujet) {
        this.id = id;
        this.titre = titre;
        this.dateCreation = dateCreation;
        this.poster = poster;
        this.Forum_Sujet = Forum_Sujet;
    }


    public Sujet(){
        
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Utilisateur getPoster() {
        return poster;
    }

    public void setPoster(Utilisateur poster) {
        this.poster = poster;
    }

    public Forum getForum_Sujet() {
        return Forum_Sujet;
    }

    public void setForum_Sujet(Forum Forum_Sujet) {
        this.Forum_Sujet = Forum_Sujet;
    }

    public List<Message> getMessageDeSujet() {
        return MessageDeSujet;
    }

    public void setMessageDeSujet(List<Message> MessageDeSujet) {
        this.MessageDeSujet = MessageDeSujet;
    }
    
    

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
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
        if (!(object instanceof Sujet)) {
            return false;
        }
        Sujet other = (Sujet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "forum.entity.Sujet[ id=" + id + " ]";
    }
    
}
