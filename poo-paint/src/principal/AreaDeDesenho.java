package principal;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

import figuras.Figura;
import figuras.Retangulo;

public class AreaDeDesenho extends JPanel {
	private List<Figura> figura;
	
	public AreaDeDesenho(List<Figura> figura) {
		this.setPreferredSize(new Dimension(600, 400));
		this.figura = figura;
	}
	
	public void setFigura(Figura figura){
		this.figura.add(figura);
		this.repaint();
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