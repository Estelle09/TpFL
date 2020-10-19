/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21509076
 */
package projet.model;

public class Client extends Individu{

    public Client(String mdpI, Personne pers) {
        super(mdpI, pers);
    }
    
    //client PP
    public void creerClientPP(String mdpI, String nomPP, String prenomPP, String adressePP, String cPPP, String villePP, Long telPP, String emailPP ){
        PersPhysique PP = new PersPhysique(adressePP, villePP, cPPP, telPP, emailPP, nomPP, prenomPP);
        Client CPP = new Client(mdpI, PP);
    }
    
    public void creerClientPM(String mdpI, String nomSoc, Long numSiret, String adressePM, String cPPM, String villePM, Long telPM, String emailPM){
        PersMorale PM = new PersMorale(adressePM, villePM, cPPM, telPM, emailPM, numSiret, nomSoc);
        Client CPM = new Client(mdpI, PM);
    }
    
    
}
