package Sky;

/*********************************************************************************************************************
 * Name: Abel Waller
 * Assignment: PP4.11
 * Description: Draws a sky with various types of stars.
 *********************************************************************************************************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.Random;

public class SkyPanel extends JPanel{
    private static final long serialVersionUID = -8221458334938278259L;
    private int xDim = 300;
    private int yDim = 200;
    private boolean notice;
    private Star stari;
    private Dimension dim = new Dimension(xDim, yDim);

    SkyPanel(){
        setBackground (Color.red);
        setPreferredSize(dim);
        this.addComponentListener(new ResizeListener());
    }

    public void paintComponent(Graphics g){
        super.paintComponents(g);
        Random generator = new Random();
        int amountOfStars = generator.nextInt((xDim*yDim)/12000)+5;
        if(notice){
            xDim = this.getWidth();
            yDim = this.getHeight();
        }
        for(int i = 1; i <= amountOfStars; i++){
            int points = (generator.nextInt(3)+4);
            if (points != 4){
                points = (generator.nextInt(3)+4);
            }
            stari = new Star(points, (generator.nextInt(50)+10),(generator.nextInt(xDim-50)+1), (generator.nextInt(yDim-50)+1));
            System.out.println(stari);
            stari.draw(g);
        }
    }
    public class ResizeListener implements ComponentListener{
        public void componentResized(ComponentEvent e){
            notice = true;
        }
        public void componentHidden(ComponentEvent e) {}
        public void componentMoved(ComponentEvent e) {}
        public void componentShown(ComponentEvent e) {}
    }
}

