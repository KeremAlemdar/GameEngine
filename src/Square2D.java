import java.awt.Graphics;
import java.util.ArrayList;

public class Square2D implements Drawable{
ArrayList<Line> lines;
    public Square2D (Point start, int size) {
        lines = new ArrayList<Line>();
        lines.add(new Line(new Point (start.x - size/2, start.y + size/2, start.z), new Point (start.x + size/2, start.y + size/2, start.z))); // sol üst - sağ üst
        lines.add(new Line(new Point (start.x - size/2, start.y - size/2, start.z), new Point (start.x + size/2, start.y - size/2 ,start.z))); // sol alt - sağ alt
        
        lines.add(new Line(new Point (start.x - size/2, start.y + size/2, start.z), new Point (start.x - size/2, start.y - size/2, start.z))); // sol üst - sol alt
        lines.add(new Line(new Point (start.x + size/2, start.y + size/2, start.z), new Point (start.x + size/2, start.y - size/2 ,start.z))); // sağ üst - sağ alt
    }
    @Override
    public void tick() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void render(Graphics g, Pov pov) {
        for(int i = 0; i < lines.size(); i++) {
            lines.get(i).render(g, pov);
        }
    }

    @Override
    public void pressW() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void pressS() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void pressA() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void pressD() {
        // TODO Auto-generated method stub
        
    }

    public ArrayList<Line> takeLines() {
        return lines;
    }
    
}
