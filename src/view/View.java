package view;

import javax.swing.JFrame;

public class View extends JFrame {

    Menu menu;

    public View() {
        setSize(500, 500);
        setPreferredSize(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        menu = new Menu(this);
        addMenu();
    }

    public void addMenu(){
        add(menu);
    }

}