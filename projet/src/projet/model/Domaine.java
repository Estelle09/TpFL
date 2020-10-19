/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doitapp;

/**
 *
 * @author jessi
 */
public class Domaine {
    
    private int numDo;
    private String nomDo;
    
    //CONSTRUCTEUR

    public Domaine(int numDo, String nomDo) {
        this.numDo = numDo;
        this.nomDo = nomDo;
    }
    
    
    //GET AND SET

    public int getNumDo() {
        return numDo;
    }

    public void setNumDo(int numDo) {
        this.numDo = numDo;
    }

    public String getNomDo() {
        return nomDo;
    }

    public void setNomDo(String nomDo) {
        this.nomDo = nomDo;
    }
    
    
}
