import java.awt.Graphics;
import java.util.ArrayList;

public class Square2D implements Drawable{
ArrayList<Line> lines;
    public Square2D (Point start, int size) {
        lines = new ArrayList<Line>();
        lines.add(new Line(new Point(start.x,start.y,start.z),new Point (start.x+size,start.y,start.z)));
        lines.add(new Line(new Point(start.x,start.y,start.z),new Point (start.x,start.y+size,start.z)));
        lines.add(new Line(new Point(start.x+size,start.y,start.z),new Point (start.x+size,start.y+size,start.z)));
        lines.add(new Line(new Point(start.x,start.y+size,start.z),new Point (start.x+size,start.y+size,start.z)));
    }
    @Override
    public void tick() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void render(Graphics g, int width, int height) {
        for(int i = 0; i < lines.size(); i++) {
            lines.get(i).render(g, width, height);
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

    
}
