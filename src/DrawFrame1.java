import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;

public class DrawFrame1 extends JPanel {


    public DrawFrame1() {
        setBackground(Color.ORANGE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //draw string
        //draw oval
        //draw line
        //draw arc
        //fill polygon
        //fill rect
        //g.fillOval(100,200,50,75);
    }
}