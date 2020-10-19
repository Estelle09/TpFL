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
public class Competence {
    
    private int numC;
    private String nomC;
    
    //CONSTRUCTEUR 

    public Competence(int numC, String nomC) {
        this.numC = numC;
        this.nomC = nomC;
    }
    
    //GET AND SET

    public int getNumC() {
        return numC;
    }

    public void setNumC(int numC) {
        this.numC = numC;
    }

    public String getNomC() {
        return nomC;
    }

    public void setNomC(String nomC) {
        this.nomC = nomC;
    }
    
    
}
