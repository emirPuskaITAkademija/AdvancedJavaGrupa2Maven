package seven.gui;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Stream;

public class MainPanel extends JPanel {
    private ImageIconLoader imageIconLoader = new ImageIconLoader();
    private ButtonGroup buttonGroup = new ButtonGroup();
    private JPanel radioPanel = new JPanel();
    private JLabel pictureLabel = new JLabel();

    public MainPanel() {
        setLayout(new BorderLayout());
        GridLayout gridLayout = new GridLayout(0, 1);
        radioPanel.setLayout(gridLayout);
        Stream.of(Animal.values())
                .map(Animal::getAnimalName)
                .forEach(this::createRadioButton);
        add(radioPanel, BorderLayout.LINE_START);
        pictureLabel.setPreferredSize(new Dimension(200, 140));
        add(pictureLabel, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
    }

    private JRadioButton createRadioButton(String labela) {
        JRadioButton radioButton = new JRadioButton(labela);
        ActionListener actionListener = this::onRadioButtonClick;
        radioButton.addActionListener(actionListener);
        radioButton.setActionCommand(labela);
        buttonGroup.add(radioButton);
        radioPanel.add(radioButton);
        return radioButton;
    }

    private void onRadioButtonClick(ActionEvent actionEvent){
        String imageName = actionEvent.getActionCommand();
        System.out.println("Image name : " + imageName);
        ImageIcon imageIcon = imageIconLoader.loadImage(imageName);
        pictureLabel.setIcon(imageIcon);
    }

//    private class AnimalRadioButtonListener implements ActionListener {
//        private ImageIconLoader imageIconLoader = new ImageIconLoader();
//
//        @Override
//        public void actionPerformed(ActionEvent actionEvent) {
//            String imageName = actionEvent.getActionCommand();
//            System.out.println("Image name : " + imageName);
//            ImageIcon imageIcon = imageIconLoader.loadImage(imageName);
//            pictureLabel.setIcon(imageIcon);
//        }
//    }
}
