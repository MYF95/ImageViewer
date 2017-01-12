package imageviewer;

import imageviewer.persistance.ImageLoader;
import imageviewer.persistance.files.FileImageLoader;

public class Main {
    
    public static void main(String[] args) {
        ImageLoader imageLoader = new FileImageLoader("a.jpg");
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().display(imageLoader.load());
        
    }

    
}
