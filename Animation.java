import javax.swing.*;
import java.awt.*;
//<applet code="Animation.class" width="500" height="500"></applet>
public class Animation extends JPanel/*implements Runnable or uses Timer*/
{
	protected void paintComponent(Graphics g)
	{
		try
		{
		g.setColor(Color.BLACK);
		g.fillRect(0,0,500,500);
		Font f0=new Font("Arial",Font.BOLD,32);
		g.setFont(f0);
		g.setColor(Color.YELLOW);
		
		g.drawString("MCA STUDENTS",100,300);
		g.drawString("PRESENTS",150,350);
		Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e.getMessage());
		}
	}
}

