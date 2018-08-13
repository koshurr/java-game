import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel extends JPanel
{
	private Grass Gs;
	private Sky Sy;
	public Player1 P1;
	public Player2 P2;
	public GamePanel()
	{
		Gs=new Grass(0,450);
		Sy=new Sky(0,0);
		P1=new Player1(32,32);
		P2=new Player2(100,100);
		
	}
	
	public void paintComponent(Graphics g)
	{
		Gs.draw(g);
		Sy.draw(g);
		P1.draw(g);
		P2.draw(g);
	}
	
	public void update()
	{
		P1.fall();
	}
	
	
}