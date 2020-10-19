/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.model;

/**
 *
 * @author jessi
 */
public class PersPhysique extends Personne {
    
    private String nomPP;
    private String prenomPP;
    
    //CONSTRUCTEUR

    public PersPhysique(String adresseP, String villeP, int cpP, int telP, String emailP, String nomPP, String prenomPP) {
        super(adresseP, villeP, cpP, telP, emailP);
        this.nomPP = nomPP;
        this.prenomPP = prenomPP;
    }
    
    //GET AND SET

    public String getNomPP() {
        return nomPP;
    }

    public void setNomPP(String nomPP) {
        this.nomPP = nomPP;
    }

    public String getPrenomPP() {
        return prenomPP;
    }

    public void setPrenomPP(String prenomPP) {
        this.prenomPP = prenomPP;
    }
    
    
    
}
