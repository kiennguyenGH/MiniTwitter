public class User {
    
    private String ID;
    private Follower followers;
    
            
    public User(String ID)
    {
        this.ID = ID;
        followers = new Follower();
    }
    
    public String getID()
    {
        return ID;
    }

    public void follow(String ID)
    {
        // following.addFollower(ID,)
    }
}
