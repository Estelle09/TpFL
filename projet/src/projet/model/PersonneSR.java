/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.model;

/**
 *
 * @author tutu
 */
public class PersonneSR {
    private int numPSR;
    private String nomPSR;
    private String prenomPSR;
    private String emailPSR;
    private String mdpPSR;
    
    public PersonneSR(int numPSR,String nomPSR,String prenomPSR,String emailPSR,String mdpPSR){
        this.numPSR= numPSR;
        this.nomPSR=nomPSR;
        this.prenomPSR = prenomPSR;
        this.emailPSR= emailPSR;
        this.mdpPSR = mdpPSR;
    }

    public int getNumPSR() {
        return numPSR;
    }

    public void setNumPSR(int numPSR) {
        this.numPSR = numPSR;
    }

    public String getNomPSR() {
        return nomPSR;
    }

    public void setNomPSR(String nomPSR) {
        this.nomPSR = nomPSR;
    }

    public String getPrenomPSR() {
        return prenomPSR;
    }

    public void setPrenomPSR(String prenomPSR) {
        this.prenomPSR = prenomPSR;
    }

    public String getEmailPSR() {
        return emailPSR;
    }

    public void setEmailPSR(String emailPSR) {
        this.emailPSR = emailPSR;
    }

    public String getMdpPSR() {
        return mdpPSR;
    }

    public void setMdpPSR(String mdpPSR) {
        this.mdpPSR = mdpPSR;
    }
    
}
