public class MessagesTotalVisitor implements Visitor{
    
    private int messagesTotal = 0;
    @Override
    public void visitUser(CompositeUser user) {
        messagesTotal += ((User) user).getMessages().size();
    }

    @Override
    public void visitGroup(CompositeUser userGroup) {
        return;
    }
    
    public int getMessagesTotal()
    {
        return messagesTotal;
    }

}
