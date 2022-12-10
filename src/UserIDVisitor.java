import java.util.*;
public class UserIDVisitor implements Visitor {

    private int count = 0;
    private Set<String> IDList = new HashSet<String>();
    @Override
    public void visitUser(CompositeUser user) {
        if (IDList.contains(user.getID()) || user.getID().contains(" "))
        {
            count++;
        }
        else if (!IDList.contains(user.getID()))
        {
            IDList.add(user.getID());
        }
        
    }

    @Override
    public void visitGroup(CompositeUser userGroup) {
        if (IDList.contains(userGroup.getID()) || userGroup.getID().contains(" "))
        {
            count++;
        }
        else if (!IDList.contains(userGroup.getID()))
        {
            IDList.add(userGroup.getID());
        }
    }
    
    public Set<String> getSet()
    {
        return IDList;
    }
    
    public int getCount()
    {
        return count;
    }
    
}
