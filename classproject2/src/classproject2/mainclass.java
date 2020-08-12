package classproject2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class mainclass extends Application
{
	
  
	public void start (Stage primaryStage)
	{
		Canvas c = new Canvas(600,400);
		Canvas c2 = new Canvas(600,400);
		Canvas c3 = new Canvas(600,400);
		GraphicsContext c3pen = c3.getGraphicsContext2D(); 
		GraphicsContext c2pen = c2.getGraphicsContext2D();//pen for rect
		GraphicsContext apen = c.getGraphicsContext2D(); //pen for line
		MyOval o = new MyOval(100,66.67,400,266.667);
		MyOval o2 = new MyOval(160,106.667,285,190.3);
		MyRectangle r = new MyRectangle(100,66.67,400,266.667);
		MyRectangle r1 = new MyRectangle(160,106.667,285,190.3);//scaled by 0.8
		
		MyOval o3 = new MyOval(200,133.3,200,133.33);
		MyRectangle r3 = new MyRectangle(200,133.3,200,133.33);
		Canvas c4 = new Canvas(600,400);
		GraphicsContext c4pen = c4.getGraphicsContext2D(); 
		
		
		
		
		MyLine l = new MyLine(0,0,600,400);
		
		
		r1.draw(c3pen);
		r.draw(c2pen);
		o.draw(c2pen);
		o2.draw(c3pen);
		
		r3.draw(c4pen);
		o3.draw(c4pen);
		
		
		l.draw(apen);
		//o.draw(c3pen);
		
		primaryStage.setScene(new Scene (new Pane(c2,c3,c4,c)));
		primaryStage.setTitle("my window");
		primaryStage.show();
	}
  

	public static void main(String[] args) 
	{
		
		launch(args); 
	}

}