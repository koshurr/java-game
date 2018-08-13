import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;

public class Player1
{
	private int x=32;
	private int y=32;
	private char direction;
	private BufferedImage Img;
	
	
	
		

	
	
	public Player1(int _x,int _y)
	{	
		x+=_x;
		y+=_y;
		try
		{
		
			Img = ImageIO.read(new File("yakov-flex.png"));

	
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
	
	public void fall()
	{
		if(y<350)
		y+=5;
		
	}

}


