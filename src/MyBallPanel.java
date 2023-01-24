import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLOutput;

public class MyBallPanel extends JPanel{
    private int x,y,size;
    private Ball[] balls = new Ball[20];
    private Ball myBall = new Ball(150,200,20);
    public MyBallPanel(){
        for (int i = 0; i < balls.length; i ++) {
            balls[i] = new Ball((int)(Math.random()*200),(int)(Math.random()*200),(int)(Math.random()*30));
        }

        setFocusable(true);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                int keyCode = e.getKeyCode();
                if (keyCode == 68) {
                    myBall.moveRight();
                } else if (keyCode == 87) {
                    myBall.moveDown();
                } else if (keyCode == 65) {
                    myBall.moveLeft();
                } else if (keyCode == 83) {
                    myBall.moveUp();
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        setBackground(Color.RED);
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        myBall.drawBall(g);
       for (int i = 0; i < balls.length; i++) {
            balls[i].drawBall(g);
            balls[i].moveBall(this);
        }
        try{
            Thread.sleep(10);
        }
        catch(Exception e) {
            System.out.println(e);
        }


        repaint();
    }
}
