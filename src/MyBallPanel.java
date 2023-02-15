import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.*;
public class MyBallPanel extends JPanel{
    JButton button = new JButton("add");
    private ArrayList<Ball> addBall = new ArrayList<>();
    private Ball myBall = new Ball(150,200,20);
    private double height,width;

    public MyBallPanel(){
        for (int i = 0; i < 20; i ++) {
            addBall.add( new Ball((int)(Math.random()*200),(int)(Math.random()*200),(int)(Math.random()*100)));
        }
        add(button);


        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("works");
                addBall.add( new Ball((int)(Math.random()*200),(int)(Math.random()*200),(int)(Math.random()*100)));            }
        } );
        addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                width = getWidth();
                height = getHeight();
            }
        });

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
                    myBall.moveRight(width,height);
                } else if (keyCode == 87) {
                    myBall.moveDown(width,height);
                } else if (keyCode == 65) {
                    myBall.moveLeft(width,height);
                } else if (keyCode == 83) {
                    myBall.moveUp(width,height);
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addBall.add(new Ball((int)(Math.random()*200),(int)(Math.random()*200),(int)(Math.random()*100)));
            }
        } );
        setBackground(Color.GRAY);
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        myBall.drawBall(g);
       for (int i = 0; i < addBall.size(); i++) {
           addBall.get(i).drawBall(g);
           addBall.get(i).moveBall(this, width, height);
       }

        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println(e);
        }
        repaint();
    }
}
