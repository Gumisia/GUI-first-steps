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

        zbudujPrzelacznikRozmiar("Maly", 15);
        zbudujPrzelacznikRozmiar("Sredni", 25);
        zbudujPrzelacznikRozmiar("Duzy", 35);

        zbudujPrzelacznikKolor("Zielony", Color.GREEN);
        zbudujPrzelacznikKolor("Czerwony", Color.RED);
        zbudujPrzelacznikKolor("Niebieski", Color.BLUE);

//        JRadioButton malyPrzelacznik = new JRadioButton("Maly");
//        JRadioButton sredniPrzelacznik = new JRadioButton("Sredni");
//
//        malyPrzelacznik.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                etykieta.setFont(new Font("Arial", Font.BOLD, 25));
//            }
//        });
//
//
//        grupaSize.add(malyPrzelacznik);
//        grupaSize.add(sredniPrzelacznik);
//
//        panel.add(malyPrzelacznik);
//        panel.add(sredniPrzelacznik);

        this.getContentPane().add(panel, BorderLayout.NORTH);
        this.getContentPane().add(panel3, BorderLayout.CENTER);
        this.getContentPane().add(panel2, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(3);
    }

    public void zbudujPrzelacznikRozmiar(String nazwa, final int rozmiar){
        JRadioButton przelacznik = new JRadioButton(nazwa);

        przelacznik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etykieta.setFont(new Font("Monospaced", Font.BOLD, rozmiar));
            }
        });

        grupaColor.add(przelacznik);
        panel.add(przelacznik);
    }

    public void zbudujPrzelacznikKolor(String nazwa, final Color kolor){
        JRadioButton przelacznik = new JRadioButton(nazwa);

        przelacznik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etykieta.setForeground(kolor);
            }
        });

        grupaSize.add(przelacznik);
        panel3.add(przelacznik);
    }

    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JLabel etykieta = new JLabel("Coś");

    ButtonGroup grupaSize = new ButtonGroup();
    ButtonGroup grupaColor = new ButtonGroup();

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
