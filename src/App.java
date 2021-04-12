import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.event.*;  
public class App extends Canvas implements Runnable, KeyListener{

    private static final long serialVersionUID = -3182095889876275233L;
    public static final int WIDTH = 800;
    public static final int HEIGHT = WIDTH / 12 * 9;
    public static Line line;
    private Thread thread;
    boolean isRunning = false;  
    
    Drawables drawable;
    Window window;
    public App() {
        window = new Window(WIDTH,HEIGHT, "3D Space" , this);
        addKeyListener(this);
        drawable = new Drawables();
        drawable.addObject(new Line(new Point(0,0,2),new Point(100,100,2)));
        drawable.addObject(new Square2D(new Point(30,30,0),20));
    }

    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
        isRunning = true;
    }
    public synchronized void stop() {
        try{
            thread.join();
            isRunning = false;
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void run() {
        long lastTime = System.nanoTime();
        double FPS = 60D;
        double ns = 1000000000 / FPS;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while(isRunning) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while(delta >= 1) {
                tick();
                delta--;
                frames++;
            }
            if(isRunning) {
                render();
            }

            if(System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                window.setTitle("3D Space , FPS: " + frames);
                frames = 0;
            }
        }
        stop();
    }

    private void tick() {
        drawable.tick();
    }

    private void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        g.dispose();
        Graphics objects = bs.getDrawGraphics();
        objects.setColor(Color.RED);
        drawable.render(objects,WIDTH,HEIGHT);
        bs.show();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W) {
            drawable.pressW();
        }
        if(e.getKeyCode() == KeyEvent.VK_A) {
            drawable.pressA();
        }
        if(e.getKeyCode() == KeyEvent.VK_S) {
            drawable.pressS();
        }
        if(e.getKeyCode() == KeyEvent.VK_D) {
            drawable.pressD();
        }
    }
    public static void main(String[] args) throws Exception {
        new App();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

}
