import java.util.ArrayList;
import java.util.Arrays;

public class PositivePercentageVisitor implements Visitor{
    private int numPositiveMessages = 0;
    private int messagesTotal = 0;
    private ArrayList<String> keyWords = new ArrayList<String>(Arrays.asList("cool", "good", "nice", "excellent", "awesome", "amazing"));

    //If a message contains a positive keyword, add 1 to number of positive messages
    @Override
    public void visitUser(CompositeUser user) {
        ArrayList<String> messages = ((User) user).getMessages();
        messagesTotal += messages.size();
        for (String i: messages)
        {
            for (String k: keyWords)
            {
                if (i.contains(k))
                {
                    numPositiveMessages++;
                    break;
                }
            }
        }
    }

    @Override
    public void visitGroup(CompositeUser userGroup) {
        return;
    }
    
    // Gets the percentage of positive messages
    public double getPositivePercentage()
    {
        return ((double)numPositiveMessages)/((double)messagesTotal) * 100.0;
    }
    
}
