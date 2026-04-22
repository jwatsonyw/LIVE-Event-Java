package lab7;


import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;

public class Game extends Canvas {
    public static void main(String[] args) {
        new Game();
    }

    World world;
    
    public Game() {
        world = new World();
        
        JFrame frame = new JFrame();
        
        this.setSize(650, 500);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);

        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                draw();
            }
        };

        t.schedule(tt, 0, 50);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                t.cancel();
                tt.cancel();
            }
        });
    }

    public void draw() {
        this.repaint();
    }

    public void paint(Graphics g) {
        g.setColor(World.colour);
        g.fillRect(World.x, World.y, World.w, World.h);
        g.setColor(Color.blue);
        world.draw(g);
        
    }
}
