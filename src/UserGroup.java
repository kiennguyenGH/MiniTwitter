import java.util.HashMap;
public class UserGroup implements CompositeUser{
    private String ID;
    private HashMap<String, CompositeUser> userGroup = new HashMap<String, CompositeUser>();
    public UserGroup(String ID)
    {
        this.ID = ID;
    }
    @Override
    public void displayUser() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void addUser(CompositeUser user)
    {
        userGroup.put(user.getID(),user);
    }

    @Override
    public void displayID() {
        System.out.println(ID);
    }

    @Override
    public String getID() {
        return ID;  
    }
    
}
