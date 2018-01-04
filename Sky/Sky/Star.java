package Sky;

/*********************************************************************************************************************
 * Name: Abel Waller
 * Assignment: PP4.11
 * Description: Draws a sky with various types of stars.
 *********************************************************************************************************************/
import java.awt.*;

public class Star {
    private int points, radius, x, y;

    Star(int numPoints, int r, int centerX, int centerY){
        points = numPoints;
        radius = r;
        x = centerX;
        y = centerY;
    }

    public void draw(Graphics g){

        g.setColor(Color.yellow);
        if(points == 4){
            for(int i = 0; i <= radius; i++){
                g.drawLine(x, i+y, (radius-i)+x, y);
                g.drawLine(x, y-i, x-(radius-i), y);
                g.drawLine(x, y-i, (radius-i)+x, y);
                g.drawLine(x, i+y, x-(radius-i), y);
            }
        }else if(points == 5){
            g.drawLine(x, y-(radius/2), x-(radius/4), y+(radius/2));
            g.drawLine(x, y-(radius/2), x+(radius/4), y+(radius/2));
            g.drawLine(x-(radius/2), y-(radius/8), x+(radius/4), y+(radius/2));
            g.drawLine(x+(radius/2), y-(radius/8), x-(radius/4), y+(radius/2));
            g.drawLine(x-(radius/2), y-(radius/8), x+(radius/2), y-(radius/8));
        }else if(points == 6){
            g.drawLine(x-(radius/6), y-(radius/2), x-(radius/6), y+(radius/2));
            g.drawLine(x+(radius/6), y-(radius/2), x+(radius/6), y+(radius/2));
            g.drawLine(x-(radius/2), y-(radius/6), x+(radius/2), y-(radius/6));
            g.drawLine(x-(radius/2), y+(radius/6), x+(radius/2), y+(radius/6));
            g.drawLine(x-(radius/6), y-(radius/2), x+(radius/2), y+(radius/6));
            g.drawLine(x-(radius/6), y+(radius/2), x+(radius/2), y-(radius/6));
            g.drawLine(x+(radius/6), y-(radius/2), x-(radius/2), y+(radius/6));
            g.drawLine(x+(radius/6), y+(radius/2), x-(radius/2), y-(radius/6));
        }else{
            System.out.println("Error! The star must have either 4, 5, or 6 points.");
            System.exit(0);
        }
    }

    public void setPoints (int numPoints){
        points = numPoints;
    }

    public void setRadius (int r){
        radius = r;
    }

    public int getRadius(){
        return radius;
    }

    public int getPoints(){
        return points;
    }

    public String toString(){
        String star = "Points of Star: " + points + "\t" + "Radius: " + radius;
        String location = "\t" + "Location:" + "(" + x + ", " + y + ")";
        return star.concat(location);
    }
}

