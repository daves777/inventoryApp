package Model;

/**
 *
 * @author dsnyder
 */
public class Model 
{
    private User userData;
    
    public Model() 
    {
        userData = new User("Dan","Snyder","IST311","Authentication");
        userData = new User("David","Lu","daves777","password");
    }

    /**
     * @return the userData
     */
    public User getUserData() {
        return userData;
    }

    /**
     * @param userData the userData to set
     */
    public void setUserData(User userData) {
        this.userData = userData;
    }
}
