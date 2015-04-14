package principal;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import figuras.Figura;

public class AreaDeDesenho extends JPanel {
	private Figura[] figura;
	
	public AreaDeDesenho(Figura[] figura) {
		this.setPreferredSize(new Dimension(600, 400));
		this.figura = figura;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (Figura f: figura){
			f.desenha(g);
		}
		
		// desenha algumas figuras
		//g.drawRect(200, 200, 200, 120);
		//g.drawOval(100, 300, 40, 40);
	}

}