// BlueJ Project: lesson4/book1
// Video: Working with the Book Text

import java.util.Scanner;
import java.io.File;

public class Book
{
    private String bookText;

    public Book(String fileName)
    {
        readBook(fileName);
    }

    /**
     * Calculates the number of characters (as in letters and
     * symbols, not people) in the book.
     * @return the number of letters and symbols in the book.
     */
    public int getNumCharacters()
    {
        // TODO: Complete this method
        // You will want to use the fact sheet linked in the instructor comments.
        // Which string method do you want to use?
        return bookText.length();
    }
    
    /**
     * Finds where the string "Mad Hatter" occurs for the first time in the book.
     * @return the location of the first occurence of the string
     */
    public int firstOccurrenceOfMadHatter()
    {
        return bookText.indexOf("Mad Hatter");
    }
    
    /**
     * Gets the first sentence of this book.
     * @return the first sentence (including the period) of this book.
     */
    public String getFirstSentence()
    {
        int indexOfPeriod = bookText.indexOf(".");
        return bookText.substring(0, indexOfPeriod + 1);
    }
    
    /**
     * Gets the second sentence of this book.
     * @return the second sentence (including the period) of this book.
     */
    public String getSecondSentence()
    {
        int firstPeriod = bookText.indexOf(".");
        int secondPeriod = bookText.indexOf(".", firstPeriod + 1);
        return bookText.substring(firstPeriod + 1, secondPeriod + 1);
    }
    
    /**
     * Counts how many times "Alice" occurs in this book.
     * @return the number of occurrences
     */
    public int occurrencesOfAlice()
    {
        int bookLength = bookText.length();
        int bookLengthWithoutAlice = bookText.replace("Alice", "").length();
        return (bookLength - bookLengthWithoutAlice) / 5;
    }
    
    /**
     * Counts how many times a given word occurs in this book.
     * @param word a word of length >= 1
     * @return the number of occurrences
     */
    public int occurrencesOf(String word)
    {
        int length = bookText.length();
        int lengthWithoutWord = bookText.replace(word, "").length();
        return (length - lengthWithoutWord) / word.length();
    }

    /**
     * A method to help read the book out of the file.
     * You don't have to read this unless you want to.
     * the "try" and "catch" are java's way of dealing with
     * runtime errors or "exceptions".
     */
    public void readBook(String fileName)
    {
        bookText = "";
        try
        {
            Scanner file = new Scanner(new File(fileName));
            while (file.hasNextLine())
            {
                String line = file.nextLine();
                bookText += line + "\n";
            }
            file.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
