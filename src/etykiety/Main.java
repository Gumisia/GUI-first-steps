package etykiety;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main extends JFrame{

    public Main(){

        super("Zegarek");
        this.setBounds(-700, 300, 300, 200);

        initComponents();

        this.setDefaultCloseOperation(3);
    }

    public void initComponents(){

        panel.add(etykieta);
        panel.add(czas);

        ActionListener stoper = new Zegar();

        Timer zegar = new Timer(1000, stoper);

        zegar.start();

//        czas.setText("12:24:20");

        this.getContentPane().add(panel);
        pack();
    }

    JPanel panel = new JPanel();
    JLabel etykieta = new JLabel("Czas: ");
    JLabel czas = new JLabel(pobierzCzas());

    private class Zegar implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            czas.setText(pobierzCzas());

        }
    }

    public String pobierzCzas(){

        GregorianCalendar kalendarz = new GregorianCalendar();

//            int h = kalendarz.get(Calendar.HOUR_OF_DAY);
//            int m = kalendarz.get(Calendar.MINUTE);
//            int s = kalendarz.get(Calendar.SECOND);

        String h = "" + kalendarz.get(Calendar.HOUR_OF_DAY);
        String m = "" + kalendarz.get(Calendar.MINUTE);
        String s = "" + kalendarz.get(Calendar.SECOND);

        if(Integer.parseInt(h) < 10)
            h = "0"+h;
        if(Integer.parseInt(m) < 10)
            m = "0"+m;
        if(Integer.parseInt(s) < 10)
            s = "0"+s;

        return h+":"+m+":"+s;
    }


    public static void main(String[] args) {

        new Main().setVisible(true);
    }
}
