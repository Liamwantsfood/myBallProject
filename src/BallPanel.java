import java.awt.*;
import javax.swing.*;
public class BallPanel extends JPanel {
private int x = 80;
private int xSpeed = 3;
private int y = 20;
private int ySpeed = 3;
   // Ball[] balls = new Ball[1];

public BallPanel(){
    setBackground(Color.RED);
}

//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        myBall.drawBall(g);
////        for (int i = 0; i < balls.length; i++) {
////            balls[i].drawBall(g);
////            balls[i].moveBall(this);
////        }
//        try{
//            Thread.sleep(10);
//        }
//        catch(Exception e) {
//            System.out.println(e);
//        }
//
//
//        //repaint();
//    }
}
