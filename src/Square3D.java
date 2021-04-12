import java.awt.Graphics;
import java.util.ArrayList;

public class Square3D implements Drawable{
ArrayList<Line> lines;
ArrayList<Line> squares;
    public Square3D(Point start, int size) {
        lines = new ArrayList<Line>();
        squares = new Square2D(start,size).takeLines();
        for(int i = 0; i < squares.size(); i++) {
            lines.add(squares.get(i));
        }
        squares = new Square2D(new Point(start.x, start.y, start.z-size), size).takeLines();
        for(int i = 0; i < squares.size(); i++) {
            lines.add(squares.get(i));
        }
        lines.add(new Line(new Point(lines.get(0).startX,lines.get(0).startY,lines.get(0).startZ),new Point(lines.get(5).endX,lines.get(5).endY,lines.get(5).endZ)));
        lines.add(new Line(new Point(lines.get(0).endX,lines.get(0).endY,lines.get(0).endZ),new Point(lines.get(5).endX,lines.get(5).endY,lines.get(5).endZ)));
        lines.add(new Line(new Point(lines.get(1).startX,lines.get(1).startY,lines.get(1).startZ),new Point(lines.get(6).endX,lines.get(6).endY,lines.get(6).endZ)));
        lines.add(new Line(new Point(lines.get(1).endX,lines.get(1).endY,lines.get(1).endZ),new Point(lines.get(6).endX,lines.get(6).endY,lines.get(6).endZ)));
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
    
}
