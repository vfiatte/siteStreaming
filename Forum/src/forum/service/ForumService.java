/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.entity.Forum;
import java.util.List;

/**
 *
 * @author admin
 */
public interface ForumService {

    public void ajouter(Forum f);

    public void supprimer(long id);

    public void modifier(Forum f);

    public List<Forum> listerTous();

    public Forum rechercherParId(long id);
}

