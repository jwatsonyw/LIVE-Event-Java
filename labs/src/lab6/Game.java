package lab6;


import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends Canvas {
	public static void main(String[] args) {
		new Game();
	}

// create an array of 3 balls 
// call this array balls
	Ball[] balls = new Ball[3];

	Game() {
		
		balls[0] = new Ball(10,10,50,50,1,1);
		balls[1] = new Ball(20,5,30,50,3,2);
		balls[2] = new Ball(30,10,50,30,2,3);
		
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
		// call the move() method of each balls
		// Tip: use an enhanced for loop to pick
		// each ball in the balls array.

// draw each ball in balls array
// Tip: See the example below
		g.setColor(Color.RED);
		g.fillRect(10, 10, 550, 300);
		g.setColor(Color.blue);
		
		for(Ball ball : balls) {
			ball.move();
			g.fillOval(ball.x, ball.y, ball.w, ball.h);
		}
		
		

		
	}
}