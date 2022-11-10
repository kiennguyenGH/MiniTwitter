import java.util.List;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;

public class User extends DefaultMutableTreeNode implements CompositeUser, Subject, Observer{
    
    private String ID;
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private ArrayList<User> following = new ArrayList<User>();
    private List<String> messageFeed = new ArrayList<String>();
    private List<String> messages = new ArrayList<String>();
    private DefaultMutableTreeNode root;
    
    public User(String ID, DefaultMutableTreeNode root)
    {
        this.ID = ID;
        this.root = root;
        following.add(this);
        observers.add(this);
    }
    
    public ArrayList<User> getFollowing()
    {
        return following;
    }
    
    public void follow(String userID)
    {
        UserGroup theRoot = (UserGroup) root.getUserObject();
        DefaultMutableTreeNode node = theRoot.findUser(root, userID);
//        UserGroup user = (UserGroup) node.getUserObject();
//        System.out.println(user);
        if (node != null)
        {
            User user = (User) node.getUserObject();
            if (following.indexOf(user) < 0)
            {
                following.add(user);
                user.attach(this);
                System.out.println(this + " is now observing " + user);
                System.out.println(this + " is now following " + user);
                print();
            }
            
        }
    }
    
    public List<String> getMessageFeed()
    {
        return messageFeed;
    }
    
    public void sendMessage(String message)
    {
        messages.add(message);
        notifyObservers(message);
    }
    
    public void print()
    {
        for (User i: following)
        {
            System.out.println(i);
        }
    }
    
    public void printObserver()
    {
        for (Observer i: observers)
        {
            System.out.println(i);
        }
    }
    
    public void printMessageFeed()
    {
        for (String i: messageFeed)
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

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer: observers)
        {
            observer.update(this, message);
        }
    }

    @Override
    public void update(Subject subject, String message) {
        messageFeed.add(subject + ": " + message);
    }
}
