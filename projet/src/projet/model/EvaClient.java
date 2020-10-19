/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doitapp;

import java.util.Date;

/**
 *
 * @author jessi
 */
public class EvaClient extends Evaluation{
    
 private int correspondance ;
 private int rentabilite;
 private int qualiteEchanges;

    public EvaClient(int numE, Date dateE, int correspondance, int rentabilite, int qualiteEchanges) {
        super(numE, dateE);
        this.correspondance = correspondance;
        this.rentabilite = rentabilite;
        this.qualiteEchanges = qualiteEchanges;
    }
 
 
}
