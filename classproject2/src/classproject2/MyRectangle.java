package classproject2;
import javafx.scene.canvas.GraphicsContext;
import java.util.Random;



public class MyRectangle extends MyShape
{
	private double x1,y1, height, width;
	MyColor ca = MyColor.RED ;
      Random rnd = new Random();
	public MyRectangle(double m, double n,  double height, double width)
	{
		super();
		this.x1 = m;
		this.y1 = n;
		this.height = height;
		this.width = width;
	}


	
	
	public double getX1() {
		return x1;
	}




	@Override
	public String toString() {
		return "MyRectangle [x1=" + x1 + ", y1=" + y1 + ", height=" + height + ", width=" + width + "]";
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




	public double getHeight() {
		return height;
	}




	public void setHeight(double height) {
		this.height = height;
	}




	public double getWidth() {
		return width;
	}




	public void setWidth(double width) {
		this.width = width;
	}




	public void draw(GraphicsContext g)
	{
		g.setFill(ca.MixColor(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256) ));
		g.fillRect(x1, y1, height, width);
		
	}

}
