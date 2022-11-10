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
    
    public boolean findGroup(DefaultMutableTreeNode root, String targetID)
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
                    return true;
                }
                else
                {
                    if (((UserGroup) item).findGroup(child, targetID))
                    {   
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    public boolean findUser(DefaultMutableTreeNode root, String targetID)
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
                    return true;
                }
            }
            else
            {
                if (((UserGroup) item).findUser(child, targetID))
                {
                    return true;
                }
            }
        }
        
        return false;
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
