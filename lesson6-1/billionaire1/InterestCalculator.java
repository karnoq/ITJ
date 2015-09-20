// Bluej project: lesson6/billionaire1
// TODO: Change the program so that it will calculate the number of years
// to reach 1 billion dollars instead of 1 million.
public class InterestCalculator
{
    public static void main(String[] args)
    {
        double balance = 100;
        double target = 1E9;
        int year = 0;

        while (balance < target)
        {
            double interest = balance * .01;
            balance = balance + interest;
            year++;
        }
        System.out.println("It will take " + year + " years.");
    }
}
