package seven.gui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class DemoGUI {

    public static void main(String[] args) {
        //Ideja je da MAIN thread ne radi sam obradu linija koda
        Runnable runnable = DemoGUI::createAndShowGUI;
        //createAndShowGui -> obrađivati neki Thread nazvan AWT nešto..
        SwingUtilities.invokeLater(runnable);
    }

    /**
     * Drugi THREAD(a nikako MAIN) će izvršavati ovu funkciju.
     */
    private static void createAndShowGUI(){
        JFrame frame = new JFrame();
        frame.setTitle("Animals");
        MainPanel mainPanel = new MainPanel();
        frame.setContentPane(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
