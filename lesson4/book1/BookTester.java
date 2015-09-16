public class BookTester
{
    public static void main(String[] args)
    {
        Book alice = new Book("aliceInWonderland.txt");

        System.out.println(alice.getNumCharacters());
        System.out.println("Expected: 144331");
        System.out.println("Actual " + alice.firstOccurrenceOfMadHatter());
        
        System.out.println("Actual " + alice.getFirstSentence());

        Book mary = new Book("mary.txt");
        System.out.println(mary.getNumCharacters());
        System.out.println("Expected: 475");
    }
}
