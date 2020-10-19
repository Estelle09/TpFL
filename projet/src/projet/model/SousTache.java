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
public class SousTache {
    private int codeST;
    private String titreST;
    private float prixST;
    private int delaisST;
    private String etatST;
    
    public SousTache(int codeST,String titreST,float prixST,int delaisST,String etatST){
        this.codeST= codeST;
        this.titreST = titreST;
        this.prixST=prixST;
        this.delaisST = delaisST;
        this.etatST = etatST;
        
    }

    public int getCodeST() {
        return codeST;
    }

    public void setCodeST(int codeST) {
        this.codeST = codeST;
    }

    public String getTitreST() {
        return titreST;
    }

    public void setTitreST(String titreST) {
        this.titreST = titreST;
    }

    public float getPrixST() {
        return prixST;
    }

    public void setPrixST(float prixST) {
        this.prixST = prixST;
    }

    public int getDelaisST() {
        return delaisST;
    }

    public void setDelaisST(int delaisST) {
        this.delaisST = delaisST;
    }

    public String getEtatST() {
        return etatST;
    }

    public void setEtatST(String etatST) {
        this.etatST = etatST;
    }
    
}
