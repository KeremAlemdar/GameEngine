
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
    public void render(Graphics g, int width, int height) {
        g.setColor(Color.RED);
        if(startZ != 0 && endZ != 0) {
        g.drawLine((int)(startX/startZ), (int)(startY/startZ), (int)(endX/endZ), (int)(endY/endZ));
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
