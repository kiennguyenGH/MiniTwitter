
public class LastUpdatedUserVisitor implements Visitor{
    
    private long lastUpdatedTime = 0;
    private User lastUpdatedUser;
    @Override
    public void visitUser(CompositeUser user) {
        User theUser = (User) user;
        if (theUser.getLastUpdated() > lastUpdatedTime)
        {
            lastUpdatedTime = theUser.getLastUpdated();
            lastUpdatedUser = theUser;
        }
    }

    @Override
    public void visitGroup(CompositeUser userGroup) {
        return;
    }
    
    public User getLastUpdatedUser()
    {
        return lastUpdatedUser;
    }
    
}
