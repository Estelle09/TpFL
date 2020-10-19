/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import projet.model.Client;
import projet.model.Intervenant;
import projet.model.PersMorale;
import projet.model.PersPhysique;

/**
 *
 * @author tutu
 */
public class Projet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //nouvelle personne physique 
        PersPhysique PP1 = new PersPhysique("18 rue Jean Durroux", "Foix", "09000",6812312345678L , "abc@outlook.fr", "Dupont", "Charles");
        System.out.println(PP1.getCodeP());
        
        PersPhysique PP2 = new PersPhysique("18 rue Jean Durroux", "Foix", "09000",6812312345678L , "abc@outlook.fr", "Dupont", "Charles");
        System.out.println(PP2.getCodeP());
        
        PersMorale PM1 = new PersMorale("59 rue Jean", "Carcassonne", "11000",687654321L ,"def@outlook.fr",12345678912345L, "SociétéDupuis&Co");
        System.out.println(PP1.getCodeP());
        
        Client C1 = new Client("blabla",PP1);
        System.out.println(C1.getCodeI());
        
        Intervenant I1 = new Intervenant("FR7618523697845", "abcdef", PM1);
        System.out.println(C1.getCodeI());
        
    }
    
}
