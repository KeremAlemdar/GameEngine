

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas{

    /**
     *
     */
    private static final long serialVersionUID = 2474038862145463208L;
    public JFrame frame;
    public Window(int width, int height, String title, App app) {
        frame = new JFrame(title);
        frame.setPreferredSize(new Dimension(width,height));
        frame.setMinimumSize(new Dimension(width+16,height+39));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.add(app);
        frame.setVisible(true);
        app.start();

        
    }
    public void setTitle(String newTitle) {
        this.frame.setTitle(newTitle);
    }
}