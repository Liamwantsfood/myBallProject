import java.awt.*;
import javax.swing.*;

public class BallPanel extends JPanel {
    int x,y,size,xSpeed,ySpeed;
    Ball[] ball = new Ball[100];
    public BallPanel() {
        for (int i = 0; i < 100; i++) {
            size = (int)((Math.random()*50)+1);
            x = (int)(Math.random()*(getWidth()-size)+1);
            y = (int)(Math.random()*(getHeight()-size)+1);
            xSpeed = (int)((Math.random()*20)+1);
            ySpeed = xSpeed;
            ball[i] = new Ball(x,y,size,xSpeed,ySpeed);
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
