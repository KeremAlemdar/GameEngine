import java.awt.Graphics;

public class CordinateSystem implements Drawable{

    int width, height;
    CordinateSystem (int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void tick() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void render(Graphics g, Pov pov) {
        g.drawLine (width/2, 0, width/2, height);
        g.drawLine (0, height/2, width , height/2);
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
