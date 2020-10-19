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
public class EvaIntervenant extends Evaluation {
    private int respectDelai;
    private int qualiteIntervention;
    
    //CONSTRUCTEUR

    public EvaIntervenant(int numE, Date dateE, int respectDelai, int qualiteIntervention) {
        super(numE,dateE);
        this.respectDelai = respectDelai;
        this.qualiteIntervention = qualiteIntervention;
    }
    
    
}
