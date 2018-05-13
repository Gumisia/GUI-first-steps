package przelacznik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {

    public Main(){
        initComponents();
    }

    public void initComponents(){
        this.setTitle("Grupy Przełączników Radio");
        this.setBounds(-700, 300, 300, 200);
        panel2.add(etykieta);

        this.getContentPane().add(panel, BorderLayout.NORTH);
        this.getContentPane().add(panel2, BorderLayout.CENTER);

        this.setDefaultCloseOperation(3);
    }

    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JLabel etykieta = new JLabel("Coś");

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
