package Sky;

/*********************************************************************************************************************
 * Name: Abel Waller
 * Assignment: PP4.11
 * Description: Draws a sky with various types of stars.
 *********************************************************************************************************************/

import javax.swing.*;
//import java.awt.*;

public class Sky {

    public static void main(String[] args) {
        JFrame frame = new JFrame ("SkyPanel");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(new SkyPanel());
        //frame.getContentPane().setBackground(Color.black);
        frame.pack();
        frame.setVisible(true);
    }
}
