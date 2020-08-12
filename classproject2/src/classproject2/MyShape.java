package classproject2;
/* This project is a project that helps us understand what inheritance is
 * the ability for a class in java to share its code to its child classes
 *                               Object
 *                                 |
 *                              MyShape
 *                             /   |   \
 *                   MyRectangle   |     MyOval
 *                                MyLine
 * to understand this we created a my shape class which serves as the basis to all other class and inherits from Objects 
 * code for MyShape is below
 * 
 */
public class MyShape extends Object {
	private double X;      //fields x and y represent the center of my screen 
	private double Y;
	private MyColor color;

	public MyShape(double x0, double y0) //constructor takes in two values and set it as the center;
	{ 
		super();
		X =x0;
		Y = y0;
		
		// TODO Auto-generated constructor stub
	}
	public MyShape() 
	{ 
		super();
		X =300;
		Y = 300;
		
		// TODO Auto-generated constructor stub
	}


	public MyColor getColor() {
	return color;
}
public void setColor(MyColor color) {
	this.color = color;
}
	@Override
	public String toString() {
		return "MyShape [X=" + X + ", Y=" + Y + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}
	public double getX() {return X;}

   public double getY() {
		return Y;
	}
	public void setY(double y) {
		Y = y;
	}
	public void setX(double x) {
		X = x;
	}
	
	
public void draw() {}
   
	
}

