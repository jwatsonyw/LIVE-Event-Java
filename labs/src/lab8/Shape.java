package lab8;

import lab8.ShapeType;
import lab8.World;

enum ShapeType{
	Rectangle,
	ThreeDRectangle,
	RoundRectangle,
	Oval,
	Arc;
}
public class Shape {
	
	public int x, y, w, h, dirX, dirY;
	//public ShapeType shape = ShapeType.Rectangle;
	public ShapeType shapeType;
	 
	public Shape(int x, int y, int w, int h, int dirX, int dirY) {
		this(x, y, w, h, dirX, dirY, ShapeType.Oval);
	}
	
	public Shape(int x, int y, int w, int h, int dirX, int dirY, ShapeType typ) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY = dirY;
		this.shapeType = typ;
	}


	public void move() {
		// x y w h
		x += dirX;
		y += dirY;
		if (x < World.x ) {
			x = World.x;
			dirX = -dirX;
		}
		if (y < World.y) {
			y = World.y;
			dirY = -dirY;
		}


		if (y + h > World.bottom()) {
			y -= dirY;
			dirY = -dirY;
		}
		if (x + w > World.right()) {
			x -= dirX;
			dirX = -dirX;
		}
	}
}
