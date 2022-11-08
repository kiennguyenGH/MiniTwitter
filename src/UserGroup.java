import java.util.HashMap;
public class UserGroup implements CompositeUser{
    private String ID;
    private HashMap<String, CompositeUser> userGroup = new HashMap<String, CompositeUser>();
    public UserGroup(String ID)
    {
        this.ID = ID;
    }
    
    @Override
    public void addUser(CompositeUser user)
    {
        userGroup.put(user.getID(),user);
    }
    
    public HashMap<String, CompositeUser> getUserGroup()
    {
        return userGroup;
    }


    @Override
    public String getID() {
        return ID;  
    }

    @Override
    public boolean isComposite() {
        return true;
    }


}
