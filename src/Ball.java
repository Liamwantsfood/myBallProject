import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;

public class Ball extends BallPanel{
    private int x,y,size,xSpeed,ySpeed;
    private Color color;
    //BallPanel panel = new BallPanel();
    public Ball(int inX,int inY,int inSize,int inXSpeed,int inYSpeed) {
        //x = (int)((Math.random()*panel.getWidth())+1);
        //y = (int)((Math.random()*panel.getHeight())+1);
        x = inX;
        y = inY;
        size = inSize;
        xSpeed = inXSpeed;
        ySpeed = inYSpeed;

        //color =  new Color((int)((Math.random()*255)+1),(int)((Math.random()*255)+1),(int)((Math.random()*255)+1));
    }
    public void moveBall(Graphics g) {
        g.fillOval(x,y,size,size);
        x+= xSpeed;
        y+= ySpeed;
        if (x >= getWidth()-size || x <= 0) {
            xSpeed *= -1;
        }
        if (y >= getHeight()-size || y <= 0) {
            ySpeed *= -1;
        }
    }
}