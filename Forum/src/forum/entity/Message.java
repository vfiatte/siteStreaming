/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author admin
 */
@Entity
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titre;
    private String contenu;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateCreation;

    
    @ManyToOne
    @JoinColumn(name = "UTIL_ID")
    private Utilisateur posterPar;
    
    @ManyToOne
    @JoinColumn(name = "SUJET_ID")
    private Forum Sujet_Message;
    
    public Message(){
        
    }
    
    public Message(Long id, String titre, String contenu, Date dateCreation) {
        this.id = id;
        this.titre = titre;
        this.contenu = contenu;
        this.dateCreation = dateCreation;
    }

    public Utilisateur getPosterPar() {
        return posterPar;
    }

    public void setPosterPar(Utilisateur posterPar) {
        this.posterPar = posterPar;
    }

    public Forum getSujet_Message() {
        return Sujet_Message;
    }

    public void setSujet_Message(Forum Sujet_Message) {
        this.Sujet_Message = Sujet_Message;
    }
    
    
    

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
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
        if (!(object instanceof Message)) {
            return false;
        }
        Message other = (Message) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "forum.entity.Message[ id=" + id + " ]";
    }
    
}
