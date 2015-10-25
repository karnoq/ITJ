
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    public static void main(String[] args)
    {
        int[][] pixels = {{0, 1, 2, 3, 4}, {5, 6, 7, 8, 9}};
        
        //print out array
        for (int i = 0; i < pixels.length; i++)
        {
            for (int j = 0; j < pixels[i].length; j++)
            {
                System.out.printf("%d", pixels[i][j]);
            }
            System.out.println();
        }
    }
}
