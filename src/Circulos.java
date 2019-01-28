import java.awt.Graphics;

import javax.swing.JPanel;

public class Circulos extends JPanel{
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		final int centroY = getHeight()/2 - 5;
		final int centroX = getWidth()/2 - 5;
		
		for(int i = 0; i < 120; i+=10) {
			
			g.drawOval(centroX - i, centroY - i, i, i);
			
		}
		
	}
	
}
