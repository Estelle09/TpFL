/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.model;

import java.util.Date;

/**
 *
 * @author jessi
 */
public class Reclamation {
    private int numR;
    private Date dateR;
    private Date dateFinR;
    private String descriptionR;
    private EtatR etatR; //enumeration
    private String rapportR;
    
    //CONSTRUCTEUR
    
     public Reclamation(int numR, Date dateR, String descriptionR) {
        this.numR = numR;
        this.dateR = dateR;
        this.descriptionR = descriptionR;
    }
    
    //GET AND SET

    public int getNumR() {
        return numR;
    }

    public void setNumR(int numR) {
        this.numR = numR;
    }

    public Date getDateR() {
        return dateR;
    }

    public void setDateR(Date dateR) {
        this.dateR = dateR;
    }

    public Date getDateFinR() {
        return dateFinR;
    }

    public void setDateFinR(Date dateFinR) {
        this.dateFinR = dateFinR;
    }

    public String getDescriptionR() {
        return descriptionR;
    }

    public void setDescriptionR(String descriptionR) {
        this.descriptionR = descriptionR;
    }

    public EtatR getEtatR() {
        return etatR;
    }

    public void setEtatR(EtatR etatR) {
        this.etatR = etatR;
    }

    public String getRapportR() {
        return rapportR;
    }

    public void setRapportR(String rapportR) {
        this.rapportR = rapportR;
    }
     
   
}
