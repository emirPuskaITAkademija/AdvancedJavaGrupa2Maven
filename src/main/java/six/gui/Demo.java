package six.gui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Demo {
    public static void main(String[] args) {
        Runnable runnable = ()->createAndShowGUI();
        SwingUtilities.invokeLater(runnable);
    }

    private static void createAndShowGUI(){
        System.out.println("THREAD: " + Thread.currentThread().getName());
        JFrame frame = new JFrame();
        frame.setTitle("Ovo je naslov mog prozora");
        frame.setSize(500, 400);
        ContentPanel contentPanel = new ContentPanel();
        frame.setContentPane(contentPanel);
        frame.setVisible(true);
    }
}
