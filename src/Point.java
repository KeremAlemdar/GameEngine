import java.awt.Graphics;

public class Point implements Drawable{
    double x,y,z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void tick() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void render(Graphics g, int width, int height) {
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
