public class User implements CompositeUser{
    
    private String ID;
    private Follower followers;
    
            
    public User(String ID)
    {
        this.ID = ID;
        followers = new Follower();
    }
    
    @Override
    public String getID()
    {
        return ID;
    }
    
    public Follower getFollowers()
    {
        return followers;
    }

    public void follow(User user)
    {
        user.getFollowers().addFollower(this);
    }

    @Override
    public void addUser(CompositeUser user) {
        return;
    }

    @Override
    public boolean isComposite() {
        return false;
    }



}
