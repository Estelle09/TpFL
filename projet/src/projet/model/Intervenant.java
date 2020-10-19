package projet.model;
/**
 *
 * @author 21509076
 */
public class Intervenant extends Individu{
    private String iBAN;

    

    public Intervenant(String iBAN,String mdpI, Personne pers) {
        super(mdpI, pers);
        this.iBAN = iBAN;
    }

    public String getiBAN() {
        return iBAN;
    }

    public void setiBAN(String iBAN) {
        this.iBAN = iBAN;
    }
    
}
