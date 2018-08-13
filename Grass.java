import java.awt.*;

public class Grass
{
	private int x;
	private int y;
	
	public void draw(Graphics g)
	{
		g.setColor(new Color(50,150,50));

		g.fillRect(x,y,800,150);
		//g.drawRect(x,y,800,150);
	}
	
	public Grass(int _x, int _y)
	{
		x=_x;
		y=_y;
	}
}
