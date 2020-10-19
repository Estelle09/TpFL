/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author 21509076
 */
enum EtatInd{
    créé, banni, supprimé
}

public class Individu {
    private final int codeI;
    private String mdpI;
    private EtatInd etatI;
    private Personne pers;
    private static final AtomicInteger codeIndividu = new AtomicInteger();
    /*public Individu(int codeI, String mdpI, EtatInd etatI) {
        this.codeI = codeI;
        this.mdpI = mdpI;
        this.etatI = etatI;
    }*/
    
    public Individu(String mdpI, Personne pers){
        this.mdpI=mdpI;
        this.etatI=EtatInd.créé;
        this.codeI=codeIndividu.getAndIncrement();
        this.pers=pers;
    }
 
//getEtat() c'est le getter 
//setEtat() c'est le setter
//getCode() c'est le getter
    //vérifier si le mot de passe entré correspond bien au mdp lié à l'email entré 
    public boolean verifierMdp(int codeI){
        boolean codeBon = false;
        return codeBon;
    }
    
    
    
    public int getCodeI() {
        return codeI;
    }


    public String getMdpI() {
        return mdpI;
    }
    
    // pas besoin pour le moment
    /*public void setMdpI(String mdpI) {
        this.mdpI = mdpI;
    }*/

    public EtatInd getEtatI() {
        return etatI;
    }

    public void setEtatI(EtatInd etatI) {
        this.etatI = etatI;
    }

    public Personne getPers() {
        return pers;
    }
    
    
    

}
