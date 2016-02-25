/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

/**
 *
 * @author admin
 */
@Service
public class MailServiceImpl implements MailService {

    public void Mail(String Emeteur, String Dest, String Titre, String Message) {
        System.out.println("Mail Inscription envoyé");
    }

    public void Click() {
        System.out.println("L'inscription est validée");
    }

}

