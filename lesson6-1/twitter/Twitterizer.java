// Write code for the shorten(String longPost) method.   
public class Twitterizer
{
    /**
     * Shortens and prints longPost by removing vowels
     * @param longPost the post whose vowels need to be removed.
     * @return string with vowels removed.
     */
    public String shorten(String longPost) 
    {
        // YOUR CODE HERE
        String post = longPost;
        int stringLength = post.length();
        
        String shortPost = "";
        
        for (int i = 0; i < stringLength; i++)
        {
            String postSubString = post.substring(i, i+1);
            if (!"aeiouAEIOU".contains(postSubString))
            {
                shortPost = shortPost + post.substring(i, i+1);
            }
            else if (postSubString == " ")
            {
                shortPost = shortPost + " ";
            }
        }
        
        return shortPost;
    }
}
