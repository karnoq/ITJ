
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    private String name;
    private String friends;
    
    public void addFriend(Person friend)
    {
        friends = friends + friend.name + " ";
    }
}
