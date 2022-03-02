package seven.gui;

import javax.swing.ImageIcon;
import java.net.URL;

public class ImageIconLoader {


    public ImageIcon loadImage(String imageName) {
        String fileName = imageName;
        if (!imageName.endsWith(".gif")) {
            fileName = fileName + ".gif";
        }
        ClassLoader classLoader = getClass().getClassLoader();
        URL url = classLoader.getResource(fileName);
        ImageIcon imageIcon = new ImageIcon(url);
        return imageIcon;
    }
}
