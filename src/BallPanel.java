import java.awt.*;
import javax.swing.*;
import java.util.*;

public class BallPanel extends JPanel {
   // int x,y,size,xSpeed,ySpeed;
    ArrayList<Ball> balls = new ArrayList<Ball>();
    public BallPanel() {
        for (int i = 0; i < 100; i++) {
            int size = (int)((Math.random()*50)+1);
            int x = (int)(Math.random()*(getWidth()-size)+1);
            int y = (int)(Math.random()*(getHeight()-size)+1);
            int xSpeed = (int)((Math.random()*20)+1);
            int ySpeed = xSpeed;
            balls.add(new Ball(x,y,size,xSpeed,ySpeed));
        }
    }
    public int getBallWidth() {
        return getWidth();
    }
    public int getBallHeight() {
        return getHeight();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.fillOval(x,y,20,20);
        //x+= xSpeed;
        //y+= ySpeed;
        //if (x >= getWidth()-20 || x <= 0) {
        //    xSpeed *= -1;
        //}
        //if (y >= getHeight()-20 || y <= 0) {
        //    ySpeed *= -1;
        //}
        //ball.moveBall(g);
        try{
            Thread.sleep(10);
        } catch(Exception e) {
            System.out.println(e);
        }


        repaint();
    }
}
