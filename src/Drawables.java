import java.awt.Graphics;
import java.util.ArrayList;

public class Drawables implements Drawable {
ArrayList<Drawable> drawables;

public static int currentPlayer;

public Drawables() {
    drawables = new ArrayList<Drawable>();
}

public void addObject(Drawable e) {
    drawables.add(e);
}
public void deleteObject(Drawable e) {
    boolean founded = false;
    for(int i = 0; i < drawables.size(); i++ ) {
        if(drawables.get(i) == e) {
            drawables.remove(i);
            founded = true;
        }
    }
    if (founded == false) {
        System.out.println("Object couldnt found");
    }
}

@Override
public void tick() {
    for(int i = 0; i < drawables.size(); i++) {
        drawables.get(i).tick();
    }
    
}

@Override
public void render(Graphics g, Pov pov) {
    for(int i = 0; i < drawables.size(); i++) {
        drawables.get(i).render(g, pov);
    }
    
}

@Override
public void pressW() {
    drawables.get(currentPlayer).pressW();
}

@Override
public void pressS() {
    drawables.get(currentPlayer).pressS();
}

@Override
public void pressA() {
    drawables.get(currentPlayer).pressA();
}

@Override
public void pressD() {
    drawables.get(currentPlayer).pressD();
}

}
