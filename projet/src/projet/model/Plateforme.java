/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.model;

import java.util.ArrayList;

/**
 *
 * @author estel
 */
public class Plateforme {
    private ArrayList<Individu> lstInscrit; 

    public Plateforme(){
        this.lstInscrit= new ArrayList<>();   
    }
    
    //rechercher si mail existe 
    public boolean EmailExiste(String email){
        return this.lstInscrit.contains(email);
    }
    
    //rechercher personne email  
    public Personne EmailPersonne(String email){
        int i;
        for (i=0; i<=this.lstInscrit.size();i++){
            if(this.lstInscrit.get(i).getPers().getEmailP()==email){
                return this.lstInscrit.get(i).getPers();
            } else {
                return null;
            }
        }
        return null;
    }
    
    public boolean DejaClient(Personne pers){
        int i;
        boolean dejaClient=false;
        for(i=0; i<=this.lstInscrit.size(); i++){
            if(this.lstInscrit.get(i).getPers()==pers){
                if(this.lstInscrit.get(i) instanceof Client){
                    dejaClient=true;
                }
            }
        }
        return dejaClient;
    }
    
    public void NouveauClientPP(String mdpI, String nomPP, String prenomPP, String adressePP, String cPPP, String villePP, Long telPP, String emailPP){
        if (!EmailExiste(emailPP)){
            PersPhysique PP = new PersPhysique(adressePP, villePP, cPPP, telPP, emailPP, nomPP, prenomPP);
            Client CPP = new Client(mdpI, PP);
            this.lstInscrit.add(CPP);
        } else {
            Personne P = EmailPersonne(emailPP);
            if (!DejaClient(P)){
                Client CPP = new Client (mdpI,P);
            }    
        } //message d'erreur sinon
    }
   
    
   
    
    

}


