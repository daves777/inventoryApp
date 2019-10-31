package View;

/**
 *
 * @author dsnyder
 */
public class View 
{
    private InitialFrame inf;

    public View() {
        inf = new InitialFrame();
    }

    /**
     * @return the inf
     */
    public InitialFrame getInf() {
        return inf;
    }

    /**
     * @param inf the inf to set
     */
    public void setInf(InitialFrame inf) {
        this.inf = inf;
    }
}
