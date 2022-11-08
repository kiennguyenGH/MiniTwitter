import javax.swing.tree.DefaultMutableTreeNode;

public class User extends DefaultMutableTreeNode implements CompositeUser{
    
    private String ID;
    
    public User(String ID)
    {
        this.ID = ID;
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
