package listy_kombinowane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{

    public Main(){
        initComponents();
    }

    public void initComponents(){
        this.setTitle("Listy kombinowane");
        this.setBounds(-700, 300, 300, 200);

        kombinacja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println(((JComboBox)e.getSource()).getSelectedItem());
//                    kombinacja.getSelectedItem();

//                ColorHandler handler = ((ColorHandler)((JComboBox)e.getSource()).getSelectedItem());
                ((JComboBox)e.getSource()).setBackground(((ColorHandler)((JComboBox)e.getSource()).getSelectedItem()).getKolor());
            }
        });
        panel.add(kombinacja);

//        kombinacja.addItem("Czarny");
        kombinacja.addItem(new ColorHandler("Czarny", Color.BLACK));
        kombinacja.addItem(new ColorHandler("Zielony", Color.GREEN));
        kombinacja.addItem(new ColorHandler("Niebieski", Color.BLUE));
        kombinacja.addItem(new ColorHandler("Żółty", Color.YELLOW));

        this.getContentPane().add(panel);

        this.setDefaultCloseOperation(3);
    }

    private class ColorHandler{

        private Color kolor;
        private String colorName;

        @Override
        public String toString() {
            return colorName;
        }

        public Color getKolor() {
            return kolor;
        }

        public ColorHandler(String colorName, Color kolor){
            this.kolor = kolor;
            this.colorName = colorName;
        }
    }
    private JPanel panel = new JPanel();
    private JComboBox kombinacja = new JComboBox();

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
