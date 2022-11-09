import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

public class User extends DefaultMutableTreeNode implements CompositeUser{
    
    private String ID;
    private ArrayList<User> following;
    private DefaultMutableTreeNode root;
    
    public User(String ID, DefaultMutableTreeNode root)
    {
        this.ID = ID;
        following = new ArrayList<User>();
        this.root = root;
    }
    
    public ArrayList<User> getFollowing()
    {
        return following;
    }
    
    public DefaultMutableTreeNode find(DefaultMutableTreeNode root, String targetID)
    {
        System.out.println(root.getChildCount());
        for (int i = 0; i < root.getChildCount(); i++)
        {
            DefaultMutableTreeNode child = (DefaultMutableTreeNode) root.getChildAt(i);
            if (!child.getAllowsChildren())
            {
                User targetUser = (User) child.getUserObject();
                if (targetUser.getID().equals(targetID))
                {
                    System.out.println("found");
                    return child;
                }
            }
        }
        
        return null;
    }

    public User() {
    }
    
    public void follow(String userID)
    {
        DefaultMutableTreeNode node = find(root, userID);
        if (node != null)
        {
            User user = (User) node.getUserObject();
            following.add(user);
            System.out.println(this + " is now following " + user);
        }
    }
    
    public void print()
    {
        for (User i: following)
        {
            System.out.println(i);
        }
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
