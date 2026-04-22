package lab6;

public class Ball {
	
	public int x, y, w, h, dirX, dirY;
	
	public Ball(int x, int y, int w, int h, int dirX, int dirY) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY = dirY;
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
