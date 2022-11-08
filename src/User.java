import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;

public class User extends DefaultMutableTreeNode implements CompositeUser{
    
    private String ID;
    private ArrayList<User> followers;
    
    public User(String ID)
    {
        this.ID = ID;
        followers = new ArrayList<User>();
    }
    
    public ArrayList<User> getFollowers()
    {
        return followers;
    }
    
    public void follow(User user)
    {
        user.getFollowers().add(this);
    }
    
    @Override
    public String getID()
    {
        return ID;
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
