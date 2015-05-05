package principal;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import figuras.Retangulo;

public class MouseListener extends MouseAdapter{
	
	private AreaDeDesenho area;
	
	public MouseListener(AreaDeDesenho areaDeDesenho) {
		this.area = areaDeDesenho;
	}

	@Override
	public void mouseClicked(MouseEvent clique){
		System.out.println("X= "+ clique.getX());
		System.out.println("Y= "+ clique.getY());
				
		this.area.setFigura(new Retangulo(clique.getX(), clique.getY(), 100, 100));
	}

}
