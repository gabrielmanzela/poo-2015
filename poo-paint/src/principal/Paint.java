package principal;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import figuras.Circulo;
import figuras.Figura;
import figuras.Retangulo;

public class Paint extends JFrame {

	public static void main(String[] args) {
		Paint aplicacao = new Paint();
	}

	public Paint() {
		Retangulo ret1 = new Retangulo(5, 5, 100, 80);
		Retangulo ret2 = new Retangulo(400, 45, 30, 30);
		Circulo c = new Circulo(200, 50, 56);

		List<Figura> figuras = new ArrayList<Figura>();
		//figuras.add(ret1);
		//figuras.add(ret2);
		//figuras.add(c);
		//Figura[] figuras = new Figura[] {ret1, ret2, c};
		
		AreaDeDesenho areaDeDesenho = new AreaDeDesenho(figuras);
		
		MouseListener mouse = new MouseListener(areaDeDesenho);
		
		areaDeDesenho.addMouseListener(mouse);
		
		this.setContentPane(areaDeDesenho);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
}

















