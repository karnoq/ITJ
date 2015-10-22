
/**
 * Write a description of class PhotographerDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotographerDemo
{
    public static void main(String[] args)
    {
        Portfolio portfolio = new Portfolio();
        Photographer photographer = new Photographer("Sara", portfolio);
        photographer.acceptAssignment(new Assignment("a parrot"));
        photographer.acceptAssignment(new Assignment("a waterfall"));
        photographer.acceptAssignment(new Assignment("a mountain"));
        portfolio.displayFinishedWork();
    }
}
