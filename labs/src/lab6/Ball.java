package lab6;

public class Ball {

	public static void main(String[] args) {
	
public class Ball {
	int x,y,w,h, dirX, dirY;

	public Ball(int x, int y, int w, int h, int dirX, int dirY) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY = dirY;
	}

	public void move() {
		x += dirX;
		y += dirY;
		
		if(x < 0 || x > 400) dirX = -dirX;
		if(y < 0 || y > 200) dirY = -dirY;
	}

}