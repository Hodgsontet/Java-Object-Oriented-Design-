package classproject2;
import javafx.scene.canvas.GraphicsContext;
import java.util.Random;


public class MyOval extends MyShape
{
	private double ox1,oy1, height,width;
	MyColor ca = MyColor.RED ;
	Random rnd = new Random();

	public MyOval(double m, double n,  double height, double width)
	{
		super();
		this.ox1 = m;
		this.oy1 = n;
		this.height = height;
		this.width = width;
	}


	
	
	public double getox1() {
		return ox1;
	}




	@Override
	public String toString() {
		return "MyOval [ox1=" + ox1 + ", oy1=" + oy1 + ", height=" + height + ", width=" + width + "]";
	}




	public void setox1(double ox1) {
		this.ox1 = ox1;
	}




	public double getoy1() {
		return oy1;
	}




	public void setoy1(double oy1) {
		this.oy1 = oy1;
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
		g.fillOval(ox1, oy1, height, width);
		
	}

}
