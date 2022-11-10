import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;

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
    
    
    
//    public void follow(String userID)
//    {
//        DefaultMutableTreeNode node = find(root, userID);
//        if (node != null)
//        {
//            User user = (User) node.getUserObject();
//            if (following.indexOf(user) < 0)
//            {
//                following.add(user);
//                System.out.println(this + " is now following " + user);
//                print();
//            }
//            
//        }
//    }
    
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
