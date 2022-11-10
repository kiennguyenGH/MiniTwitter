import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;

public class User extends DefaultMutableTreeNode implements CompositeUser, Subject, Observer, Visitable{
    
    private String ID;
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private ArrayList<User> following = new ArrayList<User>();
    private ArrayList<String> messageFeed = new ArrayList<String>();
    private ArrayList<String> messages = new ArrayList<String>();
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
    
    //Follows user and attaches an observer to the user
    public void follow(String userID)
    {
        UserGroup theRoot = (UserGroup) root.getUserObject();
        DefaultMutableTreeNode node = theRoot.findUser(root, userID);
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
    
    //Return message feed from users that are being followed
    public ArrayList<String> getMessageFeed()
    {
        return messageFeed;
    }
    
    //Return messages that this user has tweeted out
    public ArrayList<String> getMessages()
    {
        return messages;
    }
    
    //Tweets a message and sends it out to followers (AKA observers)
    public void sendMessage(String message)
    {
        messages.add(message);
        notifyObservers(message);
    }
    
    
    // Print statement for debugging
    public void print()
    {
        for (User i: following)
        {
            System.out.println(i);
        }
    }
    
    // Print statement for debugging
    public void printObserver()
    {
        for (Observer i: observers)
        {
            System.out.println(i);
        }
    }
    
    // Print statement for debugging
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
    
    //Checks if user is composite or not
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

    //Attaches observer to user being followed
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    //Notifies observers when new message is tweeted
    @Override
    public void notifyObservers(String message) {
        for (Observer observer: observers)
        {
            observer.update(this, message);
        }
    }

    //Adds new message to message feed from followed user
    @Override
    public void update(Subject subject, String message) {
        messageFeed.add(subject + ": " + message);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitUser(this);
    }
}
