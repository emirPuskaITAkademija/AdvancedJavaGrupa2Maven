package seven;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Observer ili Listener
public class AngelListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Nemoj živ bio..Pokajat ćeš se ??");
    }
}
