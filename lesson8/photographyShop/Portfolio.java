// Do you need a Portfolio object to simulate
// the photography shop?
// Write a class Portfolio if you need a portfolio
// to implement your design.

public class Portfolio
{
    ArrayList<FinishedPhoto> finishedWorks;
    
    public Portfolio()
    {
        finishedWorks = new ArrayList<FinishedPhoto>();
    }
    
    public void addFinishedWork(String photoFileName, String photographer)
    {
        finishedWorks.add(new FinishedWork(photoFileName, photographer));
    }
    
    public void displayFinishedwork()
    {
        double nextEmptyPosition = 0;
        for (FinishedPhoto work : finishedWorks)
        {
            Picture photo = new Picture(work.getPhoto());
            photo.translate(nextEmptyPosition, 0);
            Text signature = (nextEmptyPosition, photo.getHeight(), work.getSignature());
            photo.draw();
            signature.draw();
            nextEmptyPosition += photo.getWidth();
        }
    }
}
