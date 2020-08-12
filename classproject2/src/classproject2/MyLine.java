package classproject2;

import javafx.scene.canvas.GraphicsContext;



public class MyLine extends MyShape 
{
	private double x1,y1,x2,y2;
  
	public MyLine(double a,double b, double c,double d)
	{
		
		x1 =a;
		y1 = b;
		x2 = c;
		y2 = d;
	}


	
	@Override
	public String toString() {
		return "MyLine [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + "]";
	}



	public double getX1() {
		return x1;
	}



	public void setX1(double x1) {
		this.x1 = x1;
	}



	public double getY1() {
		return y1;
	}



	public void setY1(double y1) {
		this.y1 = y1;
	}



	public double getX2() {
		return x2;
	}



	public void setX2(double x2) {
		this.x2 = x2;
	}



	public double getY2() {
		return y2;
	}



	public void setY2(double y2) {
		this.y2 = y2;
	}



	public void draw(GraphicsContext g) {
         
        g.strokeLine(x1,y1,x2,y2);

    }
	
}

