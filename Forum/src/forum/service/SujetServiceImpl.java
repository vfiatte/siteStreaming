/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.dao.SujetDAO;
import forum.entity.Sujet;
import java.util.List;

/**
 *
 * @author admin
 */
@Service
public class SujetServiceImpl implements SujetService {

    @Autowired
    private SujetDAO dao;

    public void ajouter(Sujet s) {
        dao.ajouter(s);
    }

    public void supprimer(long id) {
        dao.supprimer(id);
    }

    public List<Sujet> listerTous() {
        return dao.listerTous();
    }

    public void modifier(Sujet s) {
        dao.modifier(s);
    }

    public Sujet rechercherParId(long id) {
        return dao.rechercherParId(id);
    }
}
