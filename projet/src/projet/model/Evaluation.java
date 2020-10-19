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


import java.util.Date;

public abstract class Evaluation {
    
    private int numE;
    private Date dateE;

    public Evaluation(int numE, Date dateE) {
        this.numE = numE;
        this.dateE = dateE;
    }
    
    //GET AND SET

    public int getNumE() {
        return numE;
    }

    public void setNumE(int numE) {
        this.numE = numE;
    }

    public Date getDateE() {
        return dateE;
    }

    public void setDateE(Date dateE) {
        this.dateE = dateE;
    }
    
    
  
  
}
