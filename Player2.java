import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;

public class Player2
{
	private int x=100;
	private int y=100;
	private char direction;
	private BufferedImage Img;
	
	
	
		

	
	
	public Player2(int _x,int _y)
	{	
		x+=_x;
		y+=_y;
		try
		{
		

			Img = ImageIO.read(new File("j-st.jpg"));
	
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void draw(Graphics g)
	{
		g.drawImage(Img,x,y,null);
	}
	
	public int getX()
	{
		return x;
	}
	
	public void setX(int _x)
	{
		x=_x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setY(int _y)
	{
		y=_y;
	}
	

}


