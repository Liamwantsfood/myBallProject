import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        //DrawFrame1 panel = new DrawFrame1();
        myFrame.setSize(500,500);
        //===========================//
        BallPanel myBall = new BallPanel();
        //BallPanel myBall2 = new BallPanel();

        //myFrame.add(panel);
        myFrame.add(myBall);

        myFrame.setVisible(true);

    }
}