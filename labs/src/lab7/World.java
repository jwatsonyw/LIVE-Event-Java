package lab7;

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
	Shape[] shapes = new Shape[3];
	
	public World() {
		shapes[0] = new Shape(30,40,50,50,5,5);
		shapes[1] = new Shape(40,35,30,50,3,6);
		shapes[2] = new Shape(30,40,50,30,6,3);
	}
	
	public void draw(Graphics g) {
		for(Shape shape : shapes) {
			shape.move();
			
		if(shape.shapeType == ShapeType.Oval) 
		g.fillOval(shape.x, shape.y, shape.w, shape.h);
		
		else if (shape.ShapeType == ShapeType.Rectangle)
		g.fillRect(shape.x, shape.y, shape.w, shape.h);
		}
	}
		
}
