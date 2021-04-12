import java.awt.Graphics;
public interface Drawable {
    abstract void tick();
    abstract void render(Graphics g, int width, int height);
    abstract void pressW();
    abstract void pressS();
    abstract void pressA();
    abstract void pressD();
}
