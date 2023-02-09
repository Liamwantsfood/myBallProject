import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;

public class Ball extends JFrame{
    private int x,y,size,xSpeed,ySpeed;
    private Color color;
    //BallPanel panel = new BallPanel();
    public Ball(int inX,int inY,int inSize) {
        //x = (int)((Math.random()*panel.getWidth())+1);
        //y = (int)((Math.random()*panel.getHeight())+1);
        x = inX;
        y = inY;
        size = inSize;
        xSpeed = (int)((Math.random()*10));
        ySpeed = (int)((Math.random()*10));


        color =  new Color((int)Math.random()*255,(int)Math.random()*255,(int)Math.random()*255);
    }
    public void moveRight(double width, double height) {
        x+= 3;

        if (x >= width) {
            x = 0-size;
        }
    }
    public void moveLeft(double width, double height) {

        x-= 3;

        if (x <= 0-size ) {
            x = ((int)width)+size;
        }
    }
    public void moveUp(double width, double height) {
        if(y <= height-size) {
            y += 3;
        }
    }
    public void moveDown(double width, double height) {
        if (y >= 0) {
            y -= 3;
        }
    }
    public void drawBall(Graphics g) {
        g.fillOval(x,y,size,size);
        g.setColor(color);
    }
    public void moveBall(JPanel liam,double wall1,double wall2) {

        x+= xSpeed;
//        getWidth()-size
//        getHeight()-size
        if (x >= wall1-size || x <= 0) {
            xSpeed *= -1;
        }
        y+= ySpeed;
        if (y >= wall2-size || y <= 0) {
            ySpeed *= -1;
        }
    }
}