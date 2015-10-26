
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
        
        //try to swap the left-most with the right-most element of the array
        for (int i = 0; i < pixels.length; i++)
        {
            int len = pixels[i].length;
            
            for (int j = 0; j < len/2; j++)
            {
                int saved = pixels[i][j];
                pixels[i][j] = pixels[i][len - 1 - j];
                pixels[i][len - 1 - j] = saved;
            }
        }
        
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
