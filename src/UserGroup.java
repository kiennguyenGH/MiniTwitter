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
    
    public DefaultMutableTreeNode findGroup(DefaultMutableTreeNode root, String targetID)
    {
        System.out.println(root.getChildCount());
        for (int i = 0; i < root.getChildCount(); i++)
        {
            DefaultMutableTreeNode child = (DefaultMutableTreeNode) root.getChildAt(i);
            CompositeUser item = (CompositeUser) child.getUserObject();
            if (item instanceof User)
            {
                continue;
            }
            else
            {
                if (item.getID().equals(targetID))
                {
                    return child;
                }
                else
                {
                    if (((UserGroup) item).findGroup(child, targetID) != null)
                    {   
                        return child;
                    }
                }
            }
        }
        
        return null;
    }
    
    public DefaultMutableTreeNode findUser(DefaultMutableTreeNode root, String targetID)
    {
        System.out.println(root.getChildCount());
        for (int i = 0; i < root.getChildCount(); i++)
        {
            DefaultMutableTreeNode child = (DefaultMutableTreeNode) root.getChildAt(i);
            CompositeUser item = (CompositeUser) child.getUserObject();
            if (item instanceof User)
            {
                if (item.getID().equals(targetID))
                {
                    System.out.println("Found user" + item);
                    return child;
                }
            }
            else
            {
                if (((UserGroup) item).findUser(child, targetID) != null)
                {
                    System.out.println("Found user" + item);
                    return ((UserGroup) item).findUser(child, targetID);
                }
            }
        }
        
        return null;
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
