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
public class TypeRec {
    
    private int codeTypeRec;
    private String nomTypeRec;
    
    //CONSTRUCTEUR

    public TypeRec(int codeTypeRec, String nomTypeRec) {
        this.codeTypeRec = codeTypeRec;
        this.nomTypeRec = nomTypeRec;
    }
    
    //GET AND SET

    public int getCodeTypeRec() {
        return codeTypeRec;
    }

    public void setCodeTypeRec(int codeTypeRec) {
        this.codeTypeRec = codeTypeRec;
    }

    public String getNomTypeRec() {
        return nomTypeRec;
    }

    public void setNomTypeRec(String nomTypeRec) {
        this.nomTypeRec = nomTypeRec;
    }
    
    
    
}
