package centrowanie_ramki;

import  javax.swing.*;
import java.awt.*;

public class Main extends JFrame{

    public Main()
    {
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;

        this.setSize(width/2, height/2);
//        this.setLocation(-((width/2)+40), height/4);
        this.setLocation((width-width/2)/2,(height - height/2)/2);

        this.setDefaultCloseOperation(3);

    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
