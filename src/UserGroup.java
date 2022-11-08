import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
public class UserGroup extends DefaultMutableTreeNode implements CompositeUser{
    private String ID;
    private ArrayList<CompositeUser> userGroup = new ArrayList<CompositeUser>();
    public UserGroup(String ID)
    {
        this.ID = ID;
    }
    
    public void addUser(CompositeUser user)
    {
        userGroup.add(user);
    }
    
    @Override
    public boolean getAllowsChildren()
    {
        return true;
    }
    
    public ArrayList<CompositeUser> getUserGroup()
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
