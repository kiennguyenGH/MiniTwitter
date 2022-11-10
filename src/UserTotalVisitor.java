public class UserTotalVisitor implements Visitor {

    private int userTotal = 0;
    
    @Override
    public void visitUser(CompositeUser user) {
        userTotal++;
    }

    @Override
    public void visitGroup(CompositeUser userGroup) {
        return;
    }
    
    public int getUserTotal()
    {
        return userTotal;
    }
    
}
