import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;
public class GameView extends JPanel{
	Image back,plane;
	int x=0;
	int y=450;
	public GameView() {
		back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
		plane=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\airplane.jpg");
	}
	public void paint(Graphics g) {
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
		g.drawImage(plane, x, y, 200, 150, this);
	}
}


