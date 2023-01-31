import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
			System.out.println("I'm on replit :(");
        JFrame myFrame = new JFrame();
        myFrame.setSize(500,500);
        //===========================//
       // BallPanel myBall = new BallPanel();
MyBallPanel hi = new MyBallPanel();
        System.out.println(myFrame.getWidth());

        myFrame.add(hi);

        myFrame.setVisible(true);

    }
}