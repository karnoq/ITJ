
/**
 * Write a description of class CarTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarTester
{
   public static void main(String[] args)
   {
       Car car = new Car();
       
       // Add 20 gallons and drive 100 miles
       car.addGas(20);
       car.drive(100);
       
       // Print actual and expected gas level
       System.out.println(car.getGasInTank());
       System.out.println("Expected: " + 18);
   }
}
