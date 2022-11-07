public class User implements CompositeUser{
    
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
    
    public Follower getFollowers()
    {
        return followers;
    }

    public void follow(String ID)
    {
        // following.addFollower(ID,)
    }

    @Override
    public void displayUser() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
