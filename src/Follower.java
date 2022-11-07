import java.util.HashMap;
public class Follower {
    private HashMap<String, User> following;
    
    public Follower()
    {
        following = new HashMap<String, User>();
    }
    
    public void addFollower(User user)
    {
       if (following.containsKey(user.getID()))
       {
            return;
       }
       else
       {
            following.put(user.getID(), user);
       }
    }
}
