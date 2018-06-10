package pasek_menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{

    public Main(){
        initComponents();
    }

    public void initComponents(){
        this.setTitle("Pasek Menu");
        this.setBounds(-700, 300, 300, 200);

        this.setJMenuBar(pasekMenu);

//        pasekMenu.add(new JMenu("Plik"));
//        JMenu menuPlik = new JMenu("Plik");
//        pasekMenu.add(menuPlik);


        JMenu menuPlik = pasekMenu.add(new JMenu("Plik"));
//        JMenuItem podMenuNowy = menuPlik.add("Nowy"); //można i tak

        JMenuItem podMenuNowy = menuPlik.add(new JMenuItem("Nowy", new ColorIcons(Color.RED)));




        podMenuNowy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Kod nowy plik");
            }
        });

        menuPlik.addSeparator();
        final JMenuItem podMenuZapisz = menuPlik.add(new JMenuItem("Zapisz"));
        menuPlik.add(new JMenuItem("Czytaj"));
        menuPlik.addSeparator();
        JMenu menuOpcje = new JMenu("Opcje");
        menuPlik.add(menuOpcje);

        menuOpcje.add(new JMenuItem("Opcja 1"));
        menuOpcje.add(new JMenuItem("Opcja 2"));
        menuOpcje.addSeparator();
        menuOpcje.add(tylkoDoOdczytu);

        tylkoDoOdczytu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( tylkoDoOdczytu.isSelected())
                    podMenuZapisz.setEnabled(false);
                else
                    podMenuZapisz.setEnabled(true);
            }
        });

        JMenu menuPomoc = pasekMenu.add( new JMenu("Pomoc"));
        menuPomoc.add(new JMenuItem("FAQ"));


        this.setDefaultCloseOperation(3);
    }

    private JMenuBar pasekMenu = new JMenuBar();
    private JCheckBoxMenuItem tylkoDoOdczytu = new JCheckBoxMenuItem("Tylko do odczytu");
//    private JRadioButtonMenuItem radio;

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}

