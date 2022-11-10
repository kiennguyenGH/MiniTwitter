public class MessagesTotalVisitor implements Visitor{
    
    private int messagesTotal = 0;
    
    //Each time user is visited, add total number of messages from user to final total value
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
