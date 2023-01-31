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
        xSpeed = (int)((Math.random()*10)+100);
        ySpeed = (int)((Math.random()*10)+100);


        color =  new Color(87,9,94);
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