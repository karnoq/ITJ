// BlueJ project: lesson7/gallery9

import java.util.ArrayList;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("degas1.jpg"));
        gallery.add(new Picture("monet1.jpg"));
        gallery.add(new Picture("monet2.jpg"));
        gallery.add(new Picture("renoir1.jpg"));
        gallery.add(new Picture("seurat1.jpg"));

        ArrayList<Picture> matches = new ArrayList<Picture>();
        // If pictues is in portrait orientation add it to
        // the matches array list.
        for (Picture pic : gallery)
        {
            if (pic.getHeight() > pic.getWidth())
            {
                matches.add(pic);
            }
        }

        int rightmostX = 0;
        for (Picture pic : matches)
        {
            pic.translate(rightmostX + 10, 0);
            rightmostX = pic.getMaxX();
            pic.draw();
        }
    }
}
