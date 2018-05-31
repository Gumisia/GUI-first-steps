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
        this.setBounds(-700, 300, 300, 300);

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
    private  int i = 0;


    private class MenuButton extends JButton implements FocusListener, ActionListener{

        public MenuButton(String nazwa){
            super(nazwa);
            this.addFocusListener(this);
            this.setOpaque(true);
            this.addActionListener(this);

//            this.addKeyListener(new KeyListener() {
//                @Override
//                // keyPressed -> keyTyped -> keyReleased (naciskam, drukuje, opuszczam)
//                public void keyTyped(KeyEvent e) {
//
//                }
//
//                @Override
//                public void keyPressed(KeyEvent e) {
//
//                }
//
//                @Override
//                public void keyReleased(KeyEvent e) {
//
//                }
//            });

            this.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    keyPressedHandler(e);
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

        public void keyPressedHandler(KeyEvent e){
            int dlMenu = panelMenu.getComponentCount();
            if(i==0) i = 10 * dlMenu;
            if(e.getKeyCode() == KeyEvent.VK_DOWN){
//                0%3 = 0, 1%3 = 1, 2%3 = 2, 3%3 = 0, 4%3 = 1, ...
                panelMenu.getComponent(++i%dlMenu).requestFocus();
            }else if(e.getKeyCode() == KeyEvent.VK_UP){
//                0%3 = 0, 1%3 = 1, 2%3 = 2, 3%3 = 0, 4%3 = 1, ...
                panelMenu.getComponent(--i%dlMenu).requestFocus();
            }else if(e.getKeyCode() == KeyEvent.VK_ENTER){
//                MenuButton tmp = (MenuButton)e.getSource();
//                tmp.doClick();
                ((MenuButton)e.getSource()).doClick();

            }
        }



//        private void keyPressHandle(KeyEvent){
//        }

        //            if(e.getKeyC)
        @Override
        public void actionPerformed(ActionEvent e) {
//            JOptionPane.showMessageDialog(this, "Cos");
            JOptionPane.showMessageDialog(this, ((MenuButton)e.getSource()).getText());

        }
        private Color kFocusGained = Color.RED;

        private Color kDefault = Color.BLUE;
    }

    public static void main(String[] args) {

        new Main().setVisible(true);
    }
}
