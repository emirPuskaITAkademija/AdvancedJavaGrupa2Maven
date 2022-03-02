package seven;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * <li>1. Glavni kontejner : JFrame, JPanel...</li>
 * <li>2. Kontrole: JButton, </li>
 * <li>3. Manageri: kako će kontrole ući u kontejner</li>
 */
public class SwingObservableExample {
    private JFrame frame;

    public void showWindow(){
        System.out.println(Thread.currentThread().getName());
        frame = new JFrame();
        frame.setTitle("Prozor u svijet");
        //observable ili subject
        JButton button = new JButton("Should I do it ??");
        AngelListener angelListener = new AngelListener();
        DevilListener devilListener = new DevilListener();
        button.addActionListener(angelListener);
        button.addActionListener(devilListener);
        frame.setContentPane(button);
        frame.setSize(400, 250);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        //1. Runnable
        //2. Thread klase
        SwingObservableExample example = new SwingObservableExample();
        Runnable runnable = example::showWindow;
        SwingUtilities.invokeLater(runnable);
    }
}
