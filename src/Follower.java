import java.util.HashMap;
public class Follower {
    private HashMap<String, User> following;
    
    public Follower()
    {
        following = new HashMap<String, User>();
    }
    
    public void addFollower(String ID, User user)
    {
       if (following.containsKey(ID))
       {
            return;
       }
       else
       {
            following.put(ID, user);
       }
    }
}
