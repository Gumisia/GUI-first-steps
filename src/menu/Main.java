package menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{

    Main(){

        initComponents();
    }

    public void initComponents(){

        this.setTitle("Test Menu");
        this.setBounds(300, 300, 300, 300);

        panelMenu.setLayout(new GridLayout(3, 1));

        panelMenu.add(menu1);
        panelMenu.add(menu2);
        panelMenu.add(menu3);

        kontener.add(panelMenu);
        this.setDefaultCloseOperation(3);
    }

    private Container kontener = this.getContentPane();
    private JPanel panelMenu = new JPanel();
    private MenuButton menu1 = new MenuButton("1. Dodaj");
    private MenuButton menu2 = new MenuButton("2. Usuń");
    private MenuButton menu3 = new MenuButton("3. Zmień");


    private class MenuButton extends JButton implements FocusListener{

        public MenuButton(String nazwa){
            super(nazwa);
            this.addFocusListener(this);
            this.setOpaque(true);

            this.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    keyPressHandle(e);
                }
            });

            this.setBackground(kDefault);
        }

        @Override
        public void focusGained(FocusEvent e) {

            this.setBackground(kFocusGained);
        }

        @Override
        public void focusLost(FocusEvent e) {
            this.setBackground(kDefault);

        }

        private void keyPressHandle(KeyEvent){
//            if(e.getKeyC)
        }

        private Color kFocusGained = Color.RED;
        private Color kDefault = Color.BLUE;
    }

    public static void main(String[] args) {

        new Main().setVisible(true);
    }
}
