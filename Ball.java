import java.awt.*;
import java.util.*;


public class Ball extends Rectangle{
//integers
	Random random;
	int xVelocity;
	int yVelocity;
	int initialSpeed = 2;
//The subclasses inherit the characteristics of a superclass
	Ball(int x, int y, int width, int height){
		super(x,y,width,height);
		random = new Random(); //random direction in which ball is going to
		int randomXDirection = random.nextInt(2);
		if(randomXDirection == 0)
			randomXDirection--;
		setXDirection(randomXDirection*initialSpeed);
		
		int randomYDirection = random.nextInt(2);
		if(randomYDirection == 0)
			randomYDirection--;
		setYDirection(randomYDirection*initialSpeed);
		
	}
//Random motion direction
	public void setXDirection(int randomXDirection) {
		xVelocity = randomXDirection;
	}
	public void setYDirection(int randomYDirection) {
		yVelocity = randomYDirection;
	}
//Speed of the ball
	public void move() {
		x += xVelocity;
		y += yVelocity;
	}
//Drawing of the ball
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x, y, height, width);
	}
}
