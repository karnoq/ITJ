
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car
{
    private double milesDriven;
    private double gasInTank;
    private Picture pic;
    
    public Car(double mpg)
    {
        milesDriven = 0;
        gasInTank = 0;
        milesPerGallon = mpg;
        pic = new Picture("car.jpg");
        pic.draw();
    }
    
    public Car(double mpg, String pictureFile)
    {
        milesDriven = 0;
        gasInTank = 0;
        milesPerGallon = mpg;
        pic = new Picture(pictureFile);
        pic.draw();
    }
    
    public void drive(double distance)
    {
        milesDriven = milesDriven + distance;
        double milesPerGallon = 50;
        double gasConsumed = distance / milesPerGallon;
        gasInTank = gasInTank - gasConsumed;
        int pixelsPerMile = 10;
        pic.translate(distance * pixelsPerMile, 0);
    }
    
    public void addGas(double amount)
    {
        gasInTank = gasInTank + amount;
    }
    
    // More methods...
    public double getGasInTank()
    {
        return gasInTank;
    }
}
