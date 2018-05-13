package uklad_graficzny;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main(){
        super("Układ graficzny (Layout)");
        this.setBounds(-700, 320, 300, 200);

        initComponents();
//        this.pack();




        this.setDefaultCloseOperation(3);
    }

    public void initComponents(){

        centrum = new JButton("Anuluj");
        gora = new JButton("Jestem na górze!");
        dol = new JButton("Jestem na dole!");
        prawa = new JButton("Jestem po prawej!");
        lewa = new JButton("Jestem po lewej!");

        Container kontener = this.getContentPane();


//        kontener.add(centrum, BorderLayout.CENTER);
//        kontener.add(gora, BorderLayout.PAGE_START);
//        gora.setSize(100, 400); // nie działa bez pozycjonowania absolutnego czyli .setLayout(null);
//        kontener.add(dol, BorderLayout.PAGE_END);
//        kontener.add(prawa, BorderLayout.LINE_START);
//        kontener.add(lewa, BorderLayout.LINE_END);

        centrum.setLocation(215, 135);
//        centrum.setSize(150,50);

        centrum.setSize(centrum.getPreferredSize());

        kontener.setLayout(null); //pozycjonowanie absolutne
        kontener.add(centrum);




    }

    JButton centrum;
    JButton gora;
    JButton dol;
    JButton prawa;
    JButton lewa;

    public static void main(String[] args) {

        new Main().setVisible(true);
    }
}
