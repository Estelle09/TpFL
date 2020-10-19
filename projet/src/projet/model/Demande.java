/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.model;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author tutu
 */
public class Demande {
    private int numD;
    private Date dateD;
    private String titreD;
    private String etatD;
    private String descriptionD;
    private Date dateDebPrevue;
    private String Adresse;
    private String Ville;
    private String CPD;
    private ArrayList<SousTache> lstSsTache;
            
    public Demande(int numD,Date dateD,String titreD,String etatD,String descriptionD,Date dateDebPrevue,String Adresse,String Ville,String CPD,SousTache lstSsTache){
        this.numD = numD;
        this.dateD = dateD;
        this.titreD = titreD;
        this.etatD= etatD;
        this.descriptionD = descriptionD;
        this.dateDebPrevue = dateDebPrevue;
        this.Adresse = Adresse;
        this.Ville = Ville;
        this.CPD = CPD;
        this.lstSsTache = new ArrayList<>();
        
    }

    public int getNumD() {
        return numD;
    }

    public void setNumD(int numD) {
        this.numD = numD;
    }

    public Date getDateD() {
        return dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }

    public String getTitreD() {
        return titreD;
    }

    public void setTitreD(String titreD) {
        this.titreD = titreD;
    }

    public String getEtatD() {
        return etatD;
    }

    public void setEtatD(String etatD) {
        this.etatD = etatD;
    }

    public String getDescriptionD() {
        return descriptionD;
    }

    public void setDescriptionD(String descriptionD) {
        this.descriptionD = descriptionD;
    }

    public Date getDateDebPrevue() {
        return dateDebPrevue;
    }

    public void setDateDebPrevue(Date dateDebPrevue) {
        this.dateDebPrevue = dateDebPrevue;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    public String getCPD() {
        return CPD;
    }

    public ArrayList<SousTache> getLstSsTache() {
        return lstSsTache;
    }

    public void setLstSsTache(ArrayList<SousTache> lstSsTache) {
        this.lstSsTache = lstSsTache;
    }

    public void setCPD(String CPD) {
        this.CPD = CPD;
    }
}
