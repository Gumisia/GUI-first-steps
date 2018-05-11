package ramka;

//import sun.awt.image.ToolkitImage;
import javax.swing.*;
//import java.awt.*; //abstract window toolkid

public class Main extends JFrame{

    public Main(){
         /*

        JFrame frame = new JFrame("Tytuł ramki");
//        frame.setTitle("Tytuł ramki");

//        frame.setSize(100,100);
//        frame.setSize(new Dimension(100,100));

//        frame.setLocation(-500, 200);
//        frame.setLocation(new Point(-500,200));



        frame.setBounds(-500, 200, 100, 100);
        frame.setResizable(true);

        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("LOGO-PJWSTK.png"));
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true); // widoczna ramka

        */

         super("Tytuł ramki");

         this.setBounds(-500, 200, 300,100);

         this.setDefaultCloseOperation(3);

//         this.pack();

    }
    public static void main(String[] args) {
        new Main().setVisible(true);

    }
}
