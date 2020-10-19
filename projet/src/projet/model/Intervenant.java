/**
 *
 * @author 21509076
 */
public class Intervenant extends Individu{
    private String iBAN;

    public Intervenant(String iBAN) {
        this.iBAN = iBAN;
    }

    public Intervenant(String iBAN, int codeI, String mdpI, Etat etatI) {
        super(codeI, mdpI, etatI);
        this.iBAN = iBAN;
    }

    public String getiBAN() {
        return iBAN;
    }

    public void setiBAN(String iBAN) {
        this.iBAN = iBAN;
    }
    
}
