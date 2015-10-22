// What should an Assignment do?
// How do you want to use it for this program?
// You can put any code related to the Assignment class you
// want in here.

public class Assignment
{
    private int priority;
    private String description;
    
    public Assignment(String description, int priority)
    {
        this.priority = priority;
        this.description = description;
    }
    
    public int getPriority()
    {
        return priority;
    }
    
    public String getDescription()
    {
        return description;
    }

}
