public class User {
    
    private String ID;
    private Follower following;

    public User(String ID)
    {
        this.ID = ID;
        following = new Follower();
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
