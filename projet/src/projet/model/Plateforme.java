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
   
    
   
    
    

}


