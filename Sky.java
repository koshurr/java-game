import java.awt.*;

public class Sky
{
	private int x;
	private int y;
	
	public void draw(Graphics g)
	{
		g.setColor(new Color(0,255,255));

		g.fillRect(x,y,800,450);
		//g.drawRect(x,y,800,150);
	}
	
	public Sky(int _x, int _y)
	{
		x=_x;
		y=_y;
	}
}