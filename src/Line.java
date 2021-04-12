
import java.awt.Color;
import java.awt.Graphics;
public class Line implements Drawable{

    double startX, startY, startZ;
    double endX, endY, endZ;
    public Line(Point start, Point end) {
        startX = start.x;
        startY = start.y;
        startZ = start.z;
        endX = end.x;
        endY = end.y;
        endZ = end.z;
    }
    @Override
    public void render(Graphics g, Pov pov) {
        g.setColor(Color.RED);
        if(startZ != 0 && endZ != 0) {
        //g.drawLine((int)(startX + (pov.width/2) /startZ), (int)(startY + (pov.height/2)/startZ), (int)(endX + (pov.width/2) /endZ), (int)(endY + (pov.height/2)/endZ));
        g.drawLine (
        (int) ((pov.width/2 + pov.x) + (startX / (startZ- pov.z))), 
        (int) ((pov.height/2 + pov.y) - (startY / (startZ- pov.z))), 
        (int) ((pov.width/2 + pov.x) + (endX / (endZ- pov.z))), 
        (int) ((pov.height/2 + pov.y) - (endY / (endZ- pov.z)))
        );
        }
    }
    @Override
    public void tick() {
        update();
    }
    public void update() {

    }
    public void pressW() {
        startY--;
        endY--;
    }
    public void pressA() {
        startX--;
        endX--;
    }
    public void pressS() {
        startY++;
        endY++;
    }
    public void pressD() {
        startX++;
        endX++;
    }
}
