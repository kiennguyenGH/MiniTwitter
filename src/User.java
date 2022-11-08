import javax.swing.tree.DefaultMutableTreeNode;

public class User extends DefaultMutableTreeNode implements CompositeUser{
    
    private String ID;
    private Follower followers;
    
            
    public User(String ID)
    {
        this.ID = ID;
        followers = new Follower();
//        this.follow(this);
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
    public boolean getAllowsChildren()
    {
        return false;
    }
    
    @Override
    public String toString()
    {
        return ID;
    }
}
