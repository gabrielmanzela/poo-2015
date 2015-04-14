package figuras;

import java.awt.Graphics;

public class Retangulo extends Figura{
	
	private int largura;
	private int altura;
	private static int count = 0;
	
	public Retangulo(int pos_x, int pos_y, int largura, int altura) {
		super(pos_x,pos_y);
		this.largura = largura;
		this.altura = altura;
		count++;
	}
	
	public String imprime() {
		return "retangulo[x:"+this.x+",y:"+this.y+",l:"+this.largura+",a:"+this.altura+"]";
	}
	
	public static int instancias() {
		return count;
	}
	
	public static void zeraInstancias() {
		count = 0;
	}
	
	public static boolean igual(Retangulo a, Retangulo b) {
		
		boolean altura = a.altura == b.altura;
		boolean largura = a.largura == b.largura;
		boolean y = a.y == b.y;
		boolean x = a.x == b.x;
		
		return (x && y && largura && altura && largura);
	}
	
	public int getLargura() {
		return largura;
	}
		
	public int getAltura() {
		return altura;
	}
	
	@Override
	public void desenha(Graphics g) {
		// desenha retângulo
		g.drawRect(this.x, this.y, altura, largura);
	}

	
	
}
