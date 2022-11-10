import java.util.ArrayList;
import java.util.Arrays;

public class PositivePercentageVisitor implements Visitor{
    private int numPositiveMessages = 0;
    private int messagesTotal = 0;
    private ArrayList<String> keyWords = new ArrayList<String>(Arrays.asList("cool", "good", "nice", "excellent", "awesome", "amazing"));

    @Override
    public void visitUser(CompositeUser user) {
        ArrayList<String> messages = ((User) user).getMessages();
        messagesTotal += messages.size();
        for (String i: messages)
        {
            boolean isPositive = false;
            for (String k: keyWords)
            {
                if (i.contains(k))
                {
                    numPositiveMessages++;
                    isPositive = true;
                    break;
                }
            }
        }
    }

    @Override
    public void visitGroup(CompositeUser userGroup) {
        return;
    }
    
    public double getPositivePercentage()
    {
        return ((double)numPositiveMessages)/((double)messagesTotal) * 100.0;
    }
    
}
