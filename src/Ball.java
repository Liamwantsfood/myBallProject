import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;

public class Ball extends BallPanel{
    private int x,y,size,xSpeed,ySpeed;
    private Color color;
    //BallPanel panel = new BallPanel();
    public Ball(int inX,int inY,int inSize) {
        //x = (int)((Math.random()*panel.getWidth())+1);
        //y = (int)((Math.random()*panel.getHeight())+1);
        x = inX;
        y = inY;
        size = inSize;
        xSpeed = (int)(Math.random()*10);
        ySpeed = xSpeed;

        //color =  new Color((int)((Math.random()*255)+1),(int)((Math.random()*255)+1),(int)((Math.random()*255)+1));
    }
    public void moveRight() {
        x+= 3;
    }
    public void moveLeft() {
        x-= 3;
    }
    public void moveUp() {
        y+= 3;
    }
    public void moveDown() {
        y-= 3;
    }
    public void drawBall(Graphics g) {
        g.fillOval(x,y,size,size);
    }
    public void moveBall(JPanel liam) {

        x+= xSpeed;

//        if (x >= getWidth()-size || x <= 0) {
//            xSpeed *= -1;
//        }
        y+= ySpeed;
//        if (y >= getHeight()-size || y <= 0) {
//            ySpeed *= -1;
//        }
    }
}