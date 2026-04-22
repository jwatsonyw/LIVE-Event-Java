package lab6;

import java.awt.Color;
import java.awt.Graphics;


public class World{
	public static int x=50, y=40, w=500, h=400;
	public static Color colour = Color.GREEN;
	
	public static int bottom() {
		return y+h;
	}
	public static int right() {
		return x+w;
	}
	Ball[] balls = new Ball[3];
	
	public World() {
		balls[0] = new Ball(30,40,50,50,5,5);
		balls[1] = new Ball(40,35,30,50,3,6);
		balls[2] = new Ball(30,40,50,30,6,3);
	}
	
	public void draw(Graphics g) {
		for(Ball ball : balls) {
			ball.move();
			g.fillOval(ball.x, ball.y, ball.w, ball.h);
		}
	}
		
}
