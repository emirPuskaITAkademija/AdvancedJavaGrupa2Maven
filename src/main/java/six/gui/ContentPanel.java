package six.gui;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * JPanel -> FlowLayout
 */
public class ContentPanel extends JPanel {


    private List<String> names = new ArrayList<>();
    private JTextField textField = new JTextField(20);
    private JButton addButton = new JButton("ADD");
    private JButton printButton= new JButton("PRINT");

    public ContentPanel(){
        FlowLayout flowLayout = new FlowLayout();
        setLayout(flowLayout);
        add(textField);
        AddButtonListener addButtonListener = new AddButtonListener();
        addButton.addActionListener(addButtonListener);
        add(addButton);
        PrintListener printListener = new PrintListener();
        printButton.addActionListener(printListener);
        add(printButton);
        setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
    }

    private class AddButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            names.add(textField.getText());
            textField.setText("");
            System.out.println("Neko klikno add button");
        }
    }

    private class PrintListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            names.forEach(System.out::println);
        }
    }
}
