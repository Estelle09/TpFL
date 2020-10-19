/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author jessi
 */
public abstract class Personne {
    private static final AtomicInteger codePersonne = new AtomicInteger();
    private final int codeP;
    private String adresseP;
    private String villeP;
    private int cpP;
    private int telP;
    private String emailP; 
    
    //CONSTRUCTEUR

    /* public Personne(int codeP, String adresseP, String villeP, int cpP, int telP, String emailP) {
        this.codeP = codeP;
        this.adresseP = adresseP;
        this.villeP = villeP;
        this.cpP = cpP;
        this.telP = telP;
        this.emailP = emailP;
    }*/
     
     public Personne(String adresseP, String villeP, int cpP, int telP, String emailP){
        this.codeP=codePersonne.getAndIncrement();
        this.adresseP = adresseP;
        this.villeP = villeP;
        this.cpP = cpP;
        this.telP = telP;
        this.emailP = emailP;
     }

    //GET AND SET 
    
    public int getCodeP() {
        return codeP;
    }

    public String getAdresseP() {
        return adresseP;
    }

    public void setAdresseP(String adresseP) {
        this.adresseP = adresseP;
    }

    public String getVilleP() {
        return villeP;
    }

    public void setVilleP(String villeP) {
        this.villeP = villeP;
    }

    public int getCpP() {
        return cpP;
    }

    public void setCpP(int cpP) {
        this.cpP = cpP;
    }

    public int getTelP() {
        return telP;
    }

    public void setTelP(int telP) {
        this.telP = telP;
    }

    public String getEmailP() {
        return emailP;
    }

    public void setEmailP(String emailP) {
        this.emailP = emailP;
    }
    

}
