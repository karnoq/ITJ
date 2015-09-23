// Print the following pattern of brackets: 
// []
// [][]
// [][][]
// [][][][]
// [][][][][]
public class TrianglePattern
{
    public static void main(String[] args)
    {
        // YOUR CODE HERE
        // Write nested loops so that on the first row
        // you print one pair of brackets and on the 
        // second row you print 2 pairs of brackets, and
        // so on...
        String pattern = "[]";
        int numberOfRows = 5;
        
        for (int i = 1; i <= numberOfRows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(pattern);
            }
            System.out.println();
        }

    }
}
