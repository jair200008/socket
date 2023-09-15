package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import other.Words;

public class Menu extends JPanel {
    private JButton client;
    private JButton server;
    private Words objString;

    public Menu(JFrame frame){
        objString = new Words();
        setBounds(0, 0, 500, 500);
        addButton();
    }

    private void addButton(){
        client = new JButton();
        client.setBounds(100, 50, 100, 50);
        client.setText(objString.btnClient);
        add(client);

        server = new JButton();
        server.setBounds(300, 50, 100, 50);
        server.setText(objString.btnServer);
        add(server);
    }
}
