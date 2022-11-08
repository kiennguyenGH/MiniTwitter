import java.util.HashMap;
import javax.swing.tree.DefaultMutableTreeNode;
public class UserGroup extends DefaultMutableTreeNode implements CompositeUser{
    private String ID;
    private HashMap<String, CompositeUser> userGroup = new HashMap<String, CompositeUser>();
    public UserGroup(String ID)
    {
        this.ID = ID;
    }
    
    public void addUser(CompositeUser user)
    {
        userGroup.put(user.getID(),user);
    }
    
    @Override
    public boolean getAllowsChildren()
    {
        return true;
    }
    
    public HashMap<String, CompositeUser> getUserGroup()
    {
        return userGroup;
    }


    @Override
    public String getID() {
        return ID;  
    }
    
    @Override
    public String toString()
    {
        return ID;
    }


}
