package pasek_menu;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class ColorIcons implements Icon{
    private int width = 12;
    private int height = 12;
    private Color color;

    public ColorIcons(Color color) {
        this.color = color;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Color defaultColor = g.getColor();
        Graphics2D graphics2D = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(6, 4, width -1, height -1);
        g.setColor(Color.BLUE);
        graphics2D.fill(circle);
        g.setColor(defaultColor);
    }

    public int getIconWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getIconHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
