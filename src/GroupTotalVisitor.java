public class GroupTotalVisitor implements Visitor{

    private int groupTotal = 0;
    
    @Override
    public void visitUser(CompositeUser user) {
        return;
    }

    //Each time group is visited, add increment groupTotal
    @Override
    public void visitGroup(CompositeUser userGroup) {
        groupTotal++;
    }
    
    public int getGroupTotal()
    {
        return groupTotal;
    }
    
}
