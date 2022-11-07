import java.util.List;
import java.util.ArrayList;
public class UserGroup implements CompositeUser{
    private String ID;
    private List<CompositeUser> userGroup = new ArrayList<CompositeUser>();
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
        userGroup.add(user);
    }
    
}
